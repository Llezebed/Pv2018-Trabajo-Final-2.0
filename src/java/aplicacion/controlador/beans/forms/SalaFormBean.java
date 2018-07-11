/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.SalaBean;
import aplicacion.modelo.dominio.Sala;
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
public class SalaFormBean {
     @ManagedProperty(value = "#{salaBean}")
    private SalaBean salaBean;
    private Sala unaSala;
    private String descripcion;
    private String nombre;
    private List<Sala> salasEncontrados;

    /**
     * Creates a new instance of SalaFormBean
     */
    public SalaFormBean() {
        salaBean = new SalaBean();
        listarSala();
    }

    private void listarSala() {
        setSalasEncontrados(getSalaBean().listarSala());
    }
    public void establecerSala(Sala sal){
        setUnaSala(sal);
    }
    public void agregarSala(){
        unaSala = new Sala(getDescripcion(),getNombre(),true);
        try{
            salaBean.agregarSala(unaSala);
        }
        catch (Exception e)
        { FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error","No se pudo agregar la sala");
          FacesContext.getCurrentInstance().addMessage(null,facesMessage);
        }
        
             FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_INFO,"Felicidades!","Sala agregada con exito");
          FacesContext.getCurrentInstance().addMessage(null,facesMessage);
          listarSala();
    }
    
    public void eliminarSala(){
        getUnaSala().setSalEstado(false);
        salaBean.modificarSala(getUnaSala());
        listarSala();
    }
    public void modificarSala(){
        salaBean.modificarSala(getUnaSala());
    }
    

    /**
     * @return the salaBean
     */
    public SalaBean getSalaBean() {
        return salaBean;
    }

    /**
     * @param salaBean the salaBean to set
     */
    public void setSalaBean(SalaBean salaBean) {
        this.salaBean = salaBean;
    }

    /**
     * @return the unaSala
     */
    public Sala getUnaSala() {
        return unaSala;
    }

    /**
     * @param unaSala the unaSala to set
     */
    public void setUnaSala(Sala unaSala) {
        this.unaSala = unaSala;
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
     * @return the salasEncontrados
     */
    public List<Sala> getSalasEncontrados() {
        return salasEncontrados;
    }

    /**
     * @param salasEncontrados the salasEncontrados to set
     */
    public void setSalasEncontrados(List<Sala> salasEncontrados) {
        this.salasEncontrados = salasEncontrados;
    }
    
}
