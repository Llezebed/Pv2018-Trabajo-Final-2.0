/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos.hibernate.dao;

import aplicacion.modelo.dominio.Butaca;
import java.util.List;

/**
 *
 * @author Bug0
 */
public interface ButacaDAO {
    List<Butaca> obtenertodos();
    void agregar (Butaca unaButaca);
    void modificar(Butaca unaButaca);
    void eliminar (Butaca unaButaca);
    Butaca consulta (String descripcion,String nombre);
}
