
public class Cliente extends Usuario {
	
	protected String telefono;
	protected String afp; 
	protected String sistemaSalud; // 1 (Fonasa) o 2 (Isapre)
	protected String direccion;
	protected String comuna;
	protected int edad;
	
	//Getters and Setters
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getAfp() {
		return afp;
	}
	public void setAfp(String afp) {
		this.afp = afp;
	}
	public String getsistemaSalud() {
		if (sistemaSalud.equals("1")) {
			sistemaSalud = "FONASA";
		}
		else if (sistemaSalud.equals("2")) {
			sistemaSalud = "ISAPRE";
		}
		return sistemaSalud;
	}
	
	public void setsistemaSalud(String sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	public long getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//Constructor vacio
	public Cliente() {
		super();
	}
	
	public Cliente(int rut) {
		super(rut);
		
	}
	
	//Constructor con todos los parametros
	public Cliente(String tipoUsuario,int rut, String nombres, String apellidos, String fechaNacimiento,String telefono, String afp, 
			String sistemaSalud, String direccion, String comuna, int edad) {
		super(tipoUsuario,nombres,apellidos, fechaNacimiento,rut);
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	//Metodo toString
	public String toString() {
		if (sistemaSalud.equals("1")) {
			sistemaSalud = "FONASA";
		}
		else if (sistemaSalud.equals("2")) {
			sistemaSalud = "ISAPRE";
		}
		return "Cliente [Telefono = " + telefono + ", Afp = " + afp 
				+ ", Sistema de Salud = " + sistemaSalud 
				+ ", Direccion = " + direccion + ", Comuna = " + comuna + "\n"
				+ ", Edad = " + edad + ", Nombres = " + nombres 
				+ ", Apellidos = " + apellidos + ", Fecha de Nacimiento = " + fechaNacimiento 
				+ ", Rut = " + rut + "]\n";
	}
	
	//Metodos Adicionales
	public void obtenerNombre(){
		System.out.println("Nombres del cliente: " + nombres + " " + apellidos + "\n");
	}
	
	public void obtenerSistemaSalud() {
		if (sistemaSalud.equals("1")) {
			System.out.println("Sistema de Salud: FONASA\n");
		}
		else if (sistemaSalud.equals("2")) {
			System.out.println("Sistema de Salud: ISAPRE\n");
		}
		
	}
	
	public void analizarUsuario() {
		System.out.println("Nombre: " + nombres + " " + apellidos);
		System.out.println("Rut: " + rut);
		System.out.println("Direccion: " + direccion);
		System.out.println("Comuna: " + comuna + "\n");
		
	}

}
