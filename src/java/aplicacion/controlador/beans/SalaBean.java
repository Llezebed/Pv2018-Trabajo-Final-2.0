/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.datos.hibernate.dao.SalaDAO;
import aplicacion.datos.hibernate.dao.imp.SalaDAOImp;
import aplicacion.modelo.dominio.Sala;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author alumno
 */
@ManagedBean
@ViewScoped
public class SalaBean {

    /**
     * Creates a new instance of SalaBean
     */
    public SalaBean() {
    }
     public void agregarSala (Sala unaSala){
        SalaDAO salaDAO = new SalaDAOImp();
        salaDAO.agregar(unaSala);
    }
    public List<Sala> listarSala(){
        SalaDAO salaDAO = new SalaDAOImp();
        return salaDAO.obtenertodos();
    }
    public void modificarSala(Sala unaSala){
        SalaDAO salaDAO = new SalaDAOImp();
        salaDAO.modificar(unaSala);
    }
}
