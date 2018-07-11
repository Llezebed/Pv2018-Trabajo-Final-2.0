/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.ClasificacionBean;
import aplicacion.modelo.dominio.Clasificacion;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author alumno
 */
@ManagedBean
@ViewScoped
public class ClasificacionFormBean {

    @ManagedProperty(value = "#{clasificacionBean}")
    private ClasificacionBean clasificacionBean;
    private Clasificacion unaClasificacion;
    private String descripcion;
    private List<Clasificacion> clasificacionesEncontrados;
    
    public ClasificacionFormBean() {
        clasificacionBean = new ClasificacionBean();
        listarClasificacion();
    }

    private void listarClasificacion() {
        setClasificacionesEncontrados(getClasificacionBean().listarClasificaciones());
    }

    
    public void establecerClasificacion(Clasificacion clas){
        setUnaClasificacion(clas);
    }
    
    public void agregarClasificacion(){
        unaClasificacion = new Clasificacion(getDescripcion(),true);
        try{
            clasificacionBean.agregarClasificacion(unaClasificacion);
        }
        catch (Exception e)
        { FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error","No se pudo agregar la clasificacion");
          FacesContext.getCurrentInstance().addMessage(null,facesMessage);
        }
        
             FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_INFO,"Felicidades!","Clasificacion agregada con exito");
          FacesContext.getCurrentInstance().addMessage(null,facesMessage);
          listarClasificacion();
    }
    
    public void eliminarClasificacion(){
        getUnaClasificacion().setClaEstado(false);
        clasificacionBean.modificarClasificacion(getUnaClasificacion());
        listarClasificacion();
    }
    public void modificarClasificacion(){
        clasificacionBean.modificarClasificacion(getUnaClasificacion());
    }
    /**
     * @return the clasificacionBean
     */
    public ClasificacionBean getClasificacionBean() {
        return clasificacionBean;
    }

    /**
     * @param clasificacionBean the clasificacionBean to set
     */
    public void setClasificacionBean(ClasificacionBean clasificacionBean) {
        this.clasificacionBean = clasificacionBean;
    }

    /**
     * @return the unaClasificacion
     */
    public Clasificacion getUnaClasificacion() {
        return unaClasificacion;
    }

    /**
     * @param unaClasificacion the unaClasificacion to set
     */
    public void setUnaClasificacion(Clasificacion unaClasificacion) {
        this.unaClasificacion = unaClasificacion;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the clasificacionesEncontrados
     */
    public List<Clasificacion> getClasificacionesEncontrados() {
        return clasificacionesEncontrados;
    }

    /**
     * @param clasificacionesEncontrados the clasificacionesEncontrados to set
     */
    public void setClasificacionesEncontrados(List<Clasificacion> clasificacionesEncontrados) {
        this.clasificacionesEncontrados = clasificacionesEncontrados;
    }
    
}
