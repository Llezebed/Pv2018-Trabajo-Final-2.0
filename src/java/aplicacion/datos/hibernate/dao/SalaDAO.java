/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos.hibernate.dao;

import aplicacion.modelo.dominio.Sala;
import java.util.List;

/**
 *
 * @author PC-Gamer
 */
public interface SalaDAO {
    List<Sala> obtenertodos();
    void agregar (Sala unaSala);
    void modificar(Sala unaSala);
    void eliminar (Sala unaSala);
    Sala consulta (String descripcion,String nombre);
    
}
