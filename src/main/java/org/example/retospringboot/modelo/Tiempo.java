package org.example.retospringboot.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="tiempo")
public class Tiempo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ciudad;
    private String pronostico;
    private String recomendacion;
}
