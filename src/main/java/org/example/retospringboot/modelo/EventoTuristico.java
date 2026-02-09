package org.example.retospringboot.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="evento_turistico")
public class EventoTuristico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private List<String> eventos;
    private List<String> ubicaciones;
    private boolean reserva;

}
