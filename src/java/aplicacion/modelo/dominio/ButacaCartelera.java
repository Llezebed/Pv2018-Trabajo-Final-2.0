package aplicacion.modelo.dominio;
// Generated 21/06/2018 01:26:29 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 *ButacaCarteleras generated by hbm2java
 */
public class ButacaCartelera  implements java.io.Serializable {


     private Integer bcCodigo;
     private Cartelera carteleras;
     private String bcIdentificadorButaca;
     private boolean bcDisponible;
     private boolean bcEstado;
     private Set ventasEntradases = new HashSet(0);

    public ButacaCartelera() {
    }

	
    public ButacaCartelera(Cartelera carteleras, String bcIdentificadorButaca, boolean bcDisponible, boolean bcEstado) {
        this.carteleras = carteleras;
        this.bcIdentificadorButaca = bcIdentificadorButaca;
        this.bcDisponible = bcDisponible;
        this.bcEstado = bcEstado;
    }
    public ButacaCartelera(Cartelera carteleras, String bcIdentificadorButaca, boolean bcDisponible, boolean bcEstado, Set ventasEntradases) {
       this.carteleras = carteleras;
       this.bcIdentificadorButaca = bcIdentificadorButaca;
       this.bcDisponible = bcDisponible;
       this.bcEstado = bcEstado;
       this.ventasEntradases = ventasEntradases;
    }
   
    public Integer getBcCodigo() {
        return this.bcCodigo;
    }
    
    public void setBcCodigo(Integer bcCodigo) {
        this.bcCodigo = bcCodigo;
    }
    public Cartelera getCarteleras() {
        return this.carteleras;
    }
    
    public void setCarteleras(Cartelera carteleras) {
        this.carteleras = carteleras;
    }
    public String getBcIdentificadorButaca() {
        return this.bcIdentificadorButaca;
    }
    
    public void setBcIdentificadorButaca(String bcIdentificadorButaca) {
        this.bcIdentificadorButaca = bcIdentificadorButaca;
    }
    public boolean isBcDisponible() {
        return this.bcDisponible;
    }
    
    public void setBcDisponible(boolean bcDisponible) {
        this.bcDisponible = bcDisponible;
    }
    public boolean isBcEstado() {
        return this.bcEstado;
    }
    
    public void setBcEstado(boolean bcEstado) {
        this.bcEstado = bcEstado;
    }
    public Set getVentasEntradases() {
        return this.ventasEntradases;
    }
    
    public void setVentasEntradases(Set ventasEntradases) {
        this.ventasEntradases = ventasEntradases;
    }




}


