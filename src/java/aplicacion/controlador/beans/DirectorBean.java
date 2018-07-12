/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.datos.hibernate.dao.DirectorDAO;
import aplicacion.datos.hibernate.dao.imp.DirectorDAOImp;
import aplicacion.modelo.dominio.Director;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author alumno
 */
@ManagedBean
@ViewScoped
public class DirectorBean {

    /**
     * Creates a new instance of DirectorBean
     */
    public DirectorBean() {
    }
        public void agregarDirector (Director unDirector){
        DirectorDAO directorDAO = new DirectorDAOImp();
        directorDAO.agregar(unDirector);
    }
    public List<Director> listarDirectores(){
        DirectorDAO directorDAO = new DirectorDAOImp();
        return directorDAO.obtenertodos();
    }
    
     public void modificarDirector(Director unDirector){
        DirectorDAO directorDAO = new DirectorDAOImp();
        directorDAO.modificar(unDirector);
    }
}

