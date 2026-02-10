package org.example.retospringboot.controlador;

import org.example.retospringboot.modelo.Ruta;
import org.example.retospringboot.persistencia.RutaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rutas")
class RutaController {
    private final RutaRepository rutaRepository;
    RutaController(RutaRepository rutaRepository) {
        this.rutaRepository = rutaRepository;
    }

    @GetMapping("/all_rutas")
    public List<Ruta> findAll() {
        return rutaRepository.findAll();
    }

    @GetMapping("/ruta/{id}")
    public Ruta findById(@PathVariable String id) {
        return rutaRepository.findById(id).orElse(null);
    }

    @PostMapping("/add_ruta")
    public Ruta save(@RequestBody Ruta ruta) {
        return rutaRepository.save(ruta);
    }

    @DeleteMapping("/borrar_ruta_nombre") // Quitamos el /{nombre}
    public void deleteByName(@RequestParam String nombre) {
        rutaRepository.deleteRutaByPropertiesNombre(nombre);
    }

    @DeleteMapping("/borrar_ruta_id/{id}")
    public void delete(@PathVariable String id) {
        rutaRepository.deleteById(id);
    }

    // put y exists con id
}
