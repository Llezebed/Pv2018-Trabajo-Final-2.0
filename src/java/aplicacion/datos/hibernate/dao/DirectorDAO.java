/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos.hibernate.dao;

import aplicacion.modelo.dominio.Director;
import java.util.List;

/**
 *
 * @author usuario
 */
public interface DirectorDAO {
    List<Director> obtenertodos();
    void agregar (Director unDirector);
    
}
