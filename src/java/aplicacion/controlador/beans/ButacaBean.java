/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.datos.hibernate.dao.ButacaDAO;
import aplicacion.datos.hibernate.dao.imp.ButacaDAOImp;
import aplicacion.modelo.dominio.Butaca;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author alumno
 */
@ManagedBean
@ViewScoped
public class ButacaBean {

    /**
     * Creates a new instance of ButacaBean
     */
    public ButacaBean() {
    }
     public void agregarButaca (Butaca unaButaca){
        ButacaDAO ButacaDAO = new ButacaDAOImp();
        ButacaDAO.agregar(unaButaca);
    }
    public List<Butaca> listarButaca(){
        ButacaDAO butacaDAO = new ButacaDAOImp();
        return butacaDAO.obtenertodos();
    }
    public void modificarButaca(Butaca unaButaca){
        ButacaDAO butacaDAO = new ButacaDAOImp();
        butacaDAO.modificar(unaButaca);
    }
}
