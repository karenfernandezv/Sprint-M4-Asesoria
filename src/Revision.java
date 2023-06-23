
public class Revision extends Visitaenterreno {
	int idRevision;
	String nombreRevision;
	String detalleRevision;
	String estado;//1 (sin problemas), 2 (con observaciones), 3 (no aprueba)
	
	

	public Revision() {
		super();
	}
	
	public Revision(int idRevision,int idVisita,String nombreRevision,String detalleRevision,String estado) {
		super(idVisita);
		this.idRevision = idRevision;
		this.nombreRevision  = (nombreRevision.length() > 10 && nombreRevision.length() < 50) ? nombreRevision : "";
	    this.detalleRevision = (detalleRevision.length() <= 100) ? detalleRevision : "";
	    setEstado(estado);
            }
        
            
 

	public int getIdRevision() {
		return idRevision;
	}

	public void setIdRevision(int idRevision) {
		this.idRevision = idRevision;
	}

	public String getNombreRevision() {
		return nombreRevision;
	}

	public void setNombreRevision(String nombreRevision) {
		this.nombreRevision = nombreRevision;
	}

	public String getDetalleRevision() {
		return detalleRevision;
	}

	public void setDetalleRevision(String detalleRevision) {
		this.detalleRevision = detalleRevision;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		if (estado == "1" || estado == "2" || estado == "3") {
			this.estado = estado;
		
        if (estado == "1") {
            estado = "sin problema";
        } else if (estado == "2") {
            estado = "con observaciones";
        } else {
            estado = "no aprueba";
        }
    
		this.estado = estado;}
	}

	@Override
	public String toString() {
		return "Revision [idRevision=" + idRevision + ", nombreRevision=" + nombreRevision + ", detalleRevision="
				+ detalleRevision + ", estado="  + estado + ", idVisita=" + idVisita
				+ "]";
	}

	

	
	}

	

	


	
