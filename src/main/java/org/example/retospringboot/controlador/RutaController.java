package org.example.retospringboot.controlador;

import org.example.retospringboot.modelo.Ruta;
import org.example.retospringboot.persistencia.RutaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rutas")
class RutaController {
    private final RutaRepository rutaRepository;
    RutaController(RutaRepository rutaRepository) {
        this.rutaRepository = rutaRepository;
    }

    // TODAS LAS RUTAS
    @GetMapping("/all_rutas")
    public List<Ruta> findAll() {
        return rutaRepository.findAll();
    }
    // RUTA POR ID
    @GetMapping("/ruta_id/{id}")
    public Ruta findById(@PathVariable String id) {
        return rutaRepository.findById(id).orElse(null);
    }

    // RUTA POR NOMBRE
    @GetMapping("/ruta_nombre")
    public Ruta findByNombre(@RequestParam String nombre) {
        return rutaRepository.findFirstByPropertiesNombre(nombre);
    }

    // AÑADIR RUTA
    @PostMapping("/add_ruta")
    public Ruta save(@RequestBody Ruta ruta) {
        return rutaRepository.save(ruta);
    }
    // BORRAR RUTA POR NOMBRE
    @DeleteMapping("/borrar_ruta_nombre") // Quitamos el /{nombre}
    public void deleteByName(@RequestParam String nombre) {
        rutaRepository.deleteRutaByPropertiesNombre(nombre);
    }
    // BORRAR RUTA POR ID
    @DeleteMapping("/borrar_ruta_id/{id}")
    public void delete(@PathVariable String id) {
        rutaRepository.deleteById(id);
    }
    // ACTUALIZAR RUTA POR ID
    @PutMapping("/actualizar_ruta_id/{id}")
    public Ruta update(@PathVariable String id, @RequestBody Ruta ruta) {
        Ruta rutaExistente = rutaRepository.findById(id).orElse(null);
        if (rutaExistente != null) {
            rutaExistente.setProperties(ruta.getProperties());
            return rutaRepository.save(rutaExistente);
        } else {
            return null;
        }
    }
    // Existe por id
    @GetMapping("/comprobar_id/{id}")
    public ResponseEntity<Void> checkExists(@PathVariable String id) {
        if (rutaRepository.existsById(id)) {
            return ResponseEntity.ok().build(); // Devuelve Status 200
        } else {
            return ResponseEntity.notFound().build(); // Devuelve Status 404
        }
    }
    // Existe por nombre
    @GetMapping("/comprobar_nombre")
    public ResponseEntity<Void> checkExistsByNombre(@RequestParam String nombre) {
        Ruta ruta = rutaRepository.findFirstByPropertiesNombre(nombre);
        if (ruta != null) {
            return ResponseEntity.ok().build(); // Devuelve Status 200
            } else {
            return ResponseEntity.notFound().build(); // Devuelve Status 404
        }
    }

}
