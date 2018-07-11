/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.DirectorBean;
import aplicacion.modelo.dominio.Director;
import aplicacion.modelo.dominio.Perfil;
import java.io.Serializable;
import java.util.Date;
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
public class DirectorFormBean implements Serializable{
    @ManagedProperty(value = "#{directorBean}")
        private DirectorBean directorBean;
        private Director unDirector;
        private String nombre;
        private String apellido;
        private List<Director> directorEncontrados;
        
    /**
     * Creates a new instance of DirectorFormBean
     */
    public DirectorFormBean() {
        directorBean = new DirectorBean();
        listarDirectores();
    }
    private void listarDirectores(){
        directorEncontrados = directorBean.listarDirectores();
    }
  public void agregarDirector(){
       unDirector = new Director(getApellido(),getNombre(),true);
        try{
           directorBean.agregarDirector(unDirector);
       }
    catch (Exception e)
       { FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error","El Director no se ha podido agregar");
         FacesContext.getCurrentInstance().addMessage(null,facesMessage);
        }
        
            FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_INFO,"Felicidades!","Un nuevo director ha sido agregrado con exito");
         FacesContext.getCurrentInstance().addMessage(null,facesMessage);
         listarDirectores();
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the directorBean
     */
    public DirectorBean getDirectorBean() {
        return directorBean;
    }

    /**
     * @param directorBean the directorBean to set
     */
    public void setDirectorBean(DirectorBean directorBean) {
        this.directorBean = directorBean;
    }

    /**
     * @return the unDirector
     */
    public Director getUnDirector() {
        return unDirector;
    }

    /**
     * @param unDirector the unDirector to set
     */
    public void setUnDirector(Director unDirector) {
        this.unDirector = unDirector;
    }

    /**
     * @return the directorEncontrados
     */
    public List<Director> getDirectorEncontrados() {
        return directorEncontrados;
    }

    /**
     * @param directorEncontrados the directorEncontrados to set
     */
    public void setDirectorEncontrados(List<Director> directorEncontrados) {
        this.directorEncontrados = directorEncontrados;
    }
    
}
