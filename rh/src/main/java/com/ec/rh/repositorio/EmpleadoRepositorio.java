
package com.ec.rh.repositorio;

import com.ec.rh.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ING. Elson Castillo
 */
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer>{
    
}
