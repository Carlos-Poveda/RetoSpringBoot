package org.example.retospringboot.excepcion;

public class RutaNotFoundException extends RuntimeException {
    public RutaNotFoundException(String mensaje) {
        super(mensaje);
    }
}
