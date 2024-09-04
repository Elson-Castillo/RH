package com.ec.rh.servicio;

import com.ec.rh.modelo.Empleado;
import java.util.List;

/**
 *
 * @author ING. Elson Castillo
 */
public interface IEmpleadoServicio {

    public List<Empleado> listarEmpleados();

    public Empleado buscarEmpleadoPoId(Integer idEmpleado);

    public Empleado guardarEmpleado(Empleado empleado);

    public void eliminarEmpleado(Empleado empleado);

}
