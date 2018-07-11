/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos.hibernate.dao;

import aplicacion.modelo.dominio.Clasificacion;
import java.util.List;

/**
 *
 * @author PC-Gamer
 */
public interface ClasificacionDAO {
    List<Clasificacion> obtenertodos();
    void agregar (Clasificacion unaClasificacion);
    void modificar(Clasificacion unaClasificacion);
    void eliminar (Clasificacion unaClasificacion);
    Clasificacion consulta (String descripcion);
    
}
