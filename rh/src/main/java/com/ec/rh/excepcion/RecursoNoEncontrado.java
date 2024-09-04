package com.ec.rh.excepcion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author ING. Elson Castillo
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RecursoNoEncontrado extends RuntimeException {

    public RecursoNoEncontrado(String message) {
        super(message);
    }

}
