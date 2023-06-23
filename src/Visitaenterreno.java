import java.time.format.DateTimeFormatter;

import java.time.LocalTime;

public class Visitaenterreno extends Cliente {
	protected int idVisita;
	protected int rutCliente;
    protected  String lugar;
	protected String comentarios;
    protected LocalTime hora;
    protected String dia;
  
 
	public Visitaenterreno() {
		super();
	}

	public Visitaenterreno(int idVisita) {
		super();
		this.idVisita = idVisita;
	}

	public Visitaenterreno(int IDVISITA, int RUTCLIENTE, String lugar, String comentarios, String hora,
			String dia ) {
		super();
		this.idVisita = IDVISITA;
		this.rut = RUTCLIENTE;
		this.lugar = (lugar.length() > 10 && lugar.length() < 50) ? lugar : "";
		 this.comentarios = (comentarios.length() <= 100) ? comentarios : "";
		  this.hora = LocalTime.parse(hora, DateTimeFormatter.ofPattern("HH:mm:ss"));
		  this.dia =dia;}
	


	public int getIdVisita() {
		return idVisita;
	}


	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}


	public int getRutCliente() {
		return rutCliente;
	}


	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}


	public String getLugar() {
		return lugar;
	}


	public void setLugar(String lugar) {
		this.lugar = lugar;
	}


	public String getComentarios() {
		return comentarios;
	}


	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}


	public LocalTime getHora() {
		return hora;
	}


	public void setHora(LocalTime hora) {
		this.hora = hora;
	}


	public String getDia() {
		return dia;
	}


	public void setDia(String dia) {
		this.dia = dia;
	}


	@Override
	public String toString() {
		return "Visitaenterreno [idVisita=" + idVisita + ", rutCliente=" + rutCliente + ", lugar=" + lugar
				+ ", comentarios=" + comentarios + ", hora=" + hora + ", dia=" + dia + "]";
	}



 	
 	
		
		
}

	

	



