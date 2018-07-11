/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.datos.hibernate.dao.ClasificacionDAO;

import aplicacion.datos.hibernate.dao.imp.ClasificacionDAOImp;

import aplicacion.modelo.dominio.Clasificacion;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author alumno
 */
@ManagedBean
@ViewScoped
public class ClasificacionBean {

    /**
     * Creates a new instance of Clasificacion
     */
    public ClasificacionBean() {
    }
    
    public void agregarClasificacion (Clasificacion unaClasificacion){
        ClasificacionDAO clasificacionDAO = new ClasificacionDAOImp();
        clasificacionDAO.agregar(unaClasificacion);
    }
    public List<Clasificacion> listarClasificaciones(){
        ClasificacionDAO clasificacionDAO = new ClasificacionDAOImp();
        return clasificacionDAO.obtenertodos();
    }
    public void modificarClasificacion(Clasificacion unaClasificacion){
        ClasificacionDAO clasificacionDAO = new ClasificacionDAOImp();
        clasificacionDAO.modificar(unaClasificacion);
    }
}
