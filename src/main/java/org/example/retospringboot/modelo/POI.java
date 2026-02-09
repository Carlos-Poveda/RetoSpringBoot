package org.example.retospringboot.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="POI")
public class POI {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String localizacion;
    private String detalles;
    private String review;
}
