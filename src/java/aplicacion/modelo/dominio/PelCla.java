package aplicacion.modelo.dominio;
// Generated 21/06/2018 01:26:29 by Hibernate Tools 4.3.1






/**
 * PelCla generated by hbm2java
 */
public class PelCla  implements java.io.Serializable {


     private Integer pcCodigo;
     private Clasificacion clasificaciones;
     private Pelicula peliculas;
     private boolean pcEstado;

    public PelCla() {
    }

    public PelCla(Clasificacion clasificaciones, Pelicula peliculas, boolean pcEstado) {
       this.clasificaciones = clasificaciones;
       this.peliculas = peliculas;
       this.pcEstado = pcEstado;
    }
   
    public Integer getPcCodigo() {
        return this.pcCodigo;
    }
    
    public void setPcCodigo(Integer pcCodigo) {
        this.pcCodigo = pcCodigo;
    }
    public Clasificacion getClasificaciones() {
        return this.clasificaciones;
    }
    
    public void setClasificaciones(Clasificacion clasificaciones) {
        this.clasificaciones = clasificaciones;
    }
    public Pelicula getPeliculas() {
        return this.peliculas;
    }
    
    public void setPeliculas(Pelicula peliculas) {
        this.peliculas = peliculas;
    }
    public boolean isPcEstado() {
        return this.pcEstado;
    }
    
    public void setPcEstado(boolean pcEstado) {
        this.pcEstado = pcEstado;
    }




}


