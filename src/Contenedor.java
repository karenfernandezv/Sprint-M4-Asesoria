import java.util.ArrayList;
import java.util.Scanner;

public class Contenedor extends Usuario {

	protected ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	protected ArrayList<Capacitacion> capacitaciones = new ArrayList<Capacitacion>();

	
	
	Scanner scan = new Scanner(System.in);
	
	//Constructor
	public Contenedor() {
		super();
	}
	
	public void almacenarCliente(Cliente cliente) {
		
		usuarios.add(cliente);
		
	}
	
	public void almacenarProfesional(Profesional profesional) {

		
		usuarios.add(profesional);
	}

	public void almacenarAdministrativo(Administrativo administrativo) {
		
		
		usuarios.add(administrativo);
	}
	
	public void almacenarCapacitacion(Capacitacion capacitacion) {
		
		capacitaciones.add(capacitacion);
	}

	public void eliminarUsuario() {
		System.out.println("Ingrese el rut del usuario que desea eliminar");
		rut = scan.nextInt();
		scan.nextLine();
	    for (int i = 0; i < usuarios.size(); i++) {
	        if (usuarios.get(i).getRut() == rut) {
	            usuarios.remove(i);
	            break;
	        }
	    }
	}
	
	public void listarUsuarios() {
		
		for (Usuario listado : usuarios) {
			
			System.out.println("Nombres: " + listado.getNombres());
			System.out.println("Apellidos: " + listado.getApellidos());
			System.out.println("Fecha de Nacimiento: " + listado.getFechaNacimiento());
			System.out.println("Rut: " + listado.getRut() + "\n");
		}
	}
	
		
	
	public void listarUsuariosPorTipo(String tipoUsuario) {
		System.out.println("Ingrese el tipo de usuario");
		tipoUsuario = scan.nextLine();
		tipoUsuario = tipoUsuario.toLowerCase();
		for (int i = 0; i < usuarios.size(); i ++ ) {
			if (usuarios.get(i).getTipoUsuario().equals(tipoUsuario)) {
				System.out.println(usuarios.get(i).toString());
			}
		}
		
	}
	
	public void listarCapacitaciones( ) {
		 for (Capacitacion capacitacion : capacitaciones) {
		    	System.out.println("========================================");
		    	System.out.println("====CAPACITACIÓN===");
		        System.out.println("ID: " + capacitacion.getIdCapa());
		        System.out.println("Rut: " + capacitacion.getRut());
		        System.out.println("Dia: " + capacitacion.getCapaDia());
		        System.out.println("Hora: " + capacitacion.getCapaHora());
		        System.out.println("Lugar: " + capacitacion.getCapaLugar());
		        System.out.println("Duración: " + capacitacion.getCapaDurac());
		        System.out.println("Cantidad de Asistentes: " + capacitacion.getCapaCantAsis());
		        
		        System.out.println("========================================");
		        
		        for (int i = 0; i < usuarios.size(); i++) {
			        if (usuarios.get(i).getRut() == capacitacion.getRut()) {
			           System.out.println(usuarios.get(i).toString()); 
			        }
		    }
				}
			
	}
	}
	
	
	
	

