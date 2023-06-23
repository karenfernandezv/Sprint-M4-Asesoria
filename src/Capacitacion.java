
public class Capacitacion extends Cliente{

	private int idCapa;
	private String capaDia;
	private String capaHora;
	private String capaLugar;
	private String capaDurac;
	private int capaCantAsis = 0;


	public int getIdCapa() {
		return idCapa;
	}

	public void setIdCapa(int idCapa) {
		this.idCapa = idCapa;
	}

	public String getCapaDia() {
		return capaDia;
	}

	public void setCapaDia(String capaDia) {
		this.capaDia = capaDia;
	}

	public String getCapaHora() {
		return capaHora;
	}

	public void setCapaHora(String capaHora) {
		this.capaHora = capaHora;
	}

	public String getCapaLugar() {
		return capaLugar;
	}

	public void setCapaLugar(String capaLugar) {
		this.capaLugar = capaLugar;
	}

	public String getCapaDurac() {
		return capaDurac;
	}

	public void setCapaDurac(String capaDurac) {
		this.capaDurac = capaDurac;
	}

	public int getCapaCantAsis() {
		return capaCantAsis;
	}

	public void setCapaCantAsis(int capaCantAsis) {
		this.capaCantAsis = capaCantAsis;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}
	
	public Capacitacion() {
		super();
	}

	public Capacitacion(int idCapa, String capaDia, String capaHora, String capaLugar, String capaDurac,
			int capaCantAsis, int rut) {
		super(rut);
		this.idCapa = idCapa;
		this.capaDia = capaDia;
		this.capaHora = capaHora;
		this.capaLugar = capaLugar;
		this.capaDurac = capaDurac;
		this.capaCantAsis = capaCantAsis;
	}

	// Mostrar Detalle de la Capacitación
	public void mostrarDetalle() {
	    System.out.println("La capacitación será en " + capaLugar + " a las " + capaHora + " del día " + capaDia + ", y durará " + capaDurac + " minutos.");
	}
	



}