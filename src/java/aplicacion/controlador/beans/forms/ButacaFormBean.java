/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.ButacaBean;
import aplicacion.modelo.dominio.Butaca;
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
public class ButacaFormBean {
@ManagedProperty(value = "#{butacaBean}")
    private ButacaBean butacaBean;
    private Butaca unaButaca;
    private Sala Sala;
    private String Identificador;
    private List<Butaca> butacasEncontrados;
    /**
     * Creates a new instance of ButacaFormBean
     */
    public ButacaFormBean() {
        butacaBean = new ButacaBean();
        listarButaca();
    }

    private void listarButaca() {
        setButacasEncontrados(getButacaBean().listarButaca());
    }
    public void establecerButaca(Butaca but){
        setUnaButaca(but);
    }
    public void agregarButaca(){
        setUnaButaca(new Butaca(getSala(),getIdentificador(),true));
        try{
            butacaBean.agregarButaca(getUnaButaca());
        }
        catch (Exception e)
        { FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error","No se pudo agregar la butaca");
          FacesContext.getCurrentInstance().addMessage(null,facesMessage);
        }
        
          FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_INFO,"Felicidades!","Butaca agregada con exito");
          FacesContext.getCurrentInstance().addMessage(null,facesMessage);
          listarButaca();
    }
    
    public void eliminarButaca(){
        getUnaButaca().setButEstado(false);
        getButacaBean().modificarButaca(getUnaButaca());
        listarButaca();
    }
    public void modificarButaca(){
        butacaBean.modificarButaca(getUnaButaca());
    }

    /**
     * @return the butacaBean
     */
    public ButacaBean getButacaBean() {
        return butacaBean;
    }

    /**
     * @param butacaBean the butacaBean to set
     */
    public void setButacaBean(ButacaBean butacaBean) {
        this.butacaBean = butacaBean;
    }

    /**
     * @return the unaButaca
     */
    public Butaca getUnaButaca() {
        return unaButaca;
    }

    /**
     * @param unaButaca the unaButaca to set
     */
    public void setUnaButaca(Butaca unaButaca) {
        this.unaButaca = unaButaca;
    }

    /**
     * @return the Sala
     */
    public Sala getSala() {
        return Sala;
    }

    /**
     * @param Sala the Sala to set
     */
    public void setSala(Sala Sala) {
        this.Sala = Sala;
    }

    /**
     * @return the Identificador
     */
    public String getIdentificador() {
        return Identificador;
    }

    /**
     * @param Identificador the Identificador to set
     */
    public void setIdentificador(String Identificador) {
        this.Identificador = Identificador;
    }

    /**
     * @return the butacasEncontrados
     */
    public List<Butaca> getButacasEncontrados() {
        return butacasEncontrados;
    }

    /**
     * @param butacasEncontrados the butacasEncontrados to set
     */
    public void setButacasEncontrados(List<Butaca> butacasEncontrados) {
        this.butacasEncontrados = butacasEncontrados;
    }
}
