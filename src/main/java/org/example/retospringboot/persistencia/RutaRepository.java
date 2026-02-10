package org.example.retospringboot.persistencia;

import org.example.retospringboot.modelo.Ruta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RutaRepository extends MongoRepository<Ruta,String> {
    void deleteRutaByPropertiesNombre(String nombre);

}
