package com.ec.rh.servicio;

import com.ec.rh.modelo.Empleado;
import com.ec.rh.repositorio.EmpleadoRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ING. Elson Castillo
 */
@Service
public class EmpleadoServicio implements IEmpleadoServicio {
    
    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;
    
    @Override
    public List<Empleado> listarEmpleados() {
        return empleadoRepositorio.findAll();
    }
    
    @Override
    public Empleado buscarEmpleadoPoId(Integer idEmpleado) {
        Empleado empleado = empleadoRepositorio.findById(idEmpleado).orElse(null);
        return empleado;
    }
    
    @Override
    public Empleado guardarEmpleado(Empleado empleado) {
        return empleadoRepositorio.save(empleado);
    }
    
    @Override
    public void eliminarEmpleado(Empleado empleado) {
        empleadoRepositorio.delete(empleado);
    }
    
}
