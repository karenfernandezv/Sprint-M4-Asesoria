
public class Administrativo extends Usuario{
	
	
	protected String area;
	protected String experienciaPrevia;
	
	
	// Getters y Setters
	
	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}


	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}


	public Administrativo() {
		super();
	}


	public Administrativo(String tipoUsuario, String nombres, String apellidos,
			String fechaNacimiento,int rut,String area, String experienciaPrevia) {
		super(tipoUsuario,nombres,apellidos,fechaNacimiento,rut);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}
	
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Nombre: " + nombres + " " + apellidos);
		System.out.println("Rut: " + rut + "\n");
		System.out.println("Area:" + area);
		System.out.println("Experiencia Previa:" + experienciaPrevia);

		
	}


	@Override
	public String toString() {
		return "Administrativo [Area = " + area + ", Experiencia previa = " + experienciaPrevia 
				+ ", Tipo de usuario = "+ tipoUsuario + ", Nombres = " + nombres 
				+ ", Apellidos = " + apellidos + ", Fecha de nacimiento=" + fechaNacimiento 
				+ ", rut=" + rut + "]\n";
	}


	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
