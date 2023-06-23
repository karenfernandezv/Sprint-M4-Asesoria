
public class Profesional extends Usuario {
	
	protected String titulo;
	protected String fechaIngreso; //formato DD/MM/AAAA

	//Getters and Setters

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getFechaIngreso() {
		return fechaIngreso;
	}


	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	//Constructor vacio
	public Profesional() {
		super();
	}

	
	// Metodo constructor con atributos
	
	public Profesional(String tipoUsuario, String nombres, String apellidos, String fechaNacimiento, int rut ,String titulo, String fechaIngreso) {
		super(tipoUsuario,nombres,apellidos,fechaNacimiento,rut);
		
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
		
		
	}

	
    //toString
	
	public String toString() {
		return "Profesional [Titulo = " + titulo + ", Fecha de Ingreso = " + fechaIngreso 
				+ ", Tipo de Usuario=" + tipoUsuario + ", Nombres = " + nombres 
				+ ", Apellidos = " + apellidos + ", Fecha de Nacimiento = " + fechaNacimiento
				+ ", Rut = " + rut + "]\n";
	
	}
	
	//Metodo analizar usuario
	
	public void analizarUsuario(){
		super.analizarUsuario(); 
		System.out.println("Nombre: " + nombres + " " + apellidos);
		System.out.println("Rut: " + rut + "\n");
		System.out.println("Titulo:"+ titulo);
		System.out.println("Fecha de ingreso:"+ fechaIngreso);
	}


	
	
}
	

	

	
	


	
	
	
	
	
	
	
	
	
	
	
     	

	

