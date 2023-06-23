import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class Usuario implements IAsesoria {

	protected String tipoUsuario;
	protected String nombres;
	protected String apellidos;
	protected String fechaNacimiento; // DD-MM-AAAA
	protected int rut; //Numero menor a 99.999.999
	
	//Getters and Setters
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getFechaNacimiento() {
		
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		this.rut = rut;
	}
	
	//Constructor vacio
	public Usuario() {
		super();
	}
	
	//Constructor con todos los parametros
	public Usuario(String tipoUsuario, String nombres, String apellidos, String fechaNacimiento, int rut) {
		super();
		this.tipoUsuario = tipoUsuario.toLowerCase();
		
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.rut = rut;
	}
	
	public Usuario(int rut) {
		this.rut = rut;
	}
	// Metodo toString
	public String toString() {
		return "Usuario [Nombres = " + nombres + ", Apellidos = " + apellidos + ", Fecha de Nacimiento=" + fechaNacimiento
				+ ", Rut = " + rut + "]";
	}
	
	public void mostrarEdad() {
		
		DateTimeFormatter formatoEntrada = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	    LocalDate nacimiento = LocalDate.parse(fechaNacimiento, formatoEntrada);

	    DateTimeFormatter formatoSalida = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    String nacimientoFormat = nacimiento.format(formatoSalida);

	    LocalDate fechaFinal = LocalDate.parse(nacimientoFormat);

	    LocalDate fechaActual = LocalDate.now();

	    long edad = ChronoUnit.YEARS.between(fechaFinal, fechaActual);
	    System.out.println("El usuario tiene " + edad + " años.\n");

	}

	public void analizarUsuario() {
		System.out.println("Nombre: " + nombres + " " + apellidos);
		System.out.println("Rut: " + rut + "\n");
		
	}
	
	
}
