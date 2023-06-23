import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		int menu=0;
		
		String nombres;
		String apellidos;
		String fechaNacimiento; 
		int rut; 
		String telefono;
		String afp;
		String sistemaSalud;
		String direccion;
		String comuna;
		int edad;
		String titulo;
		String fechaIngreso;
		String area;
		String experienciaPrevia;
		int idCapa;
		String capaDia;
		String capaHora;
		String capaLugar;
		String capaDurac;
		int capaCantAsis;
		
		final List<String> DIA = Arrays.asList("LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO","DOMINGO");
		
		Scanner scan = new Scanner(System.in);
		
		Contenedor contenedor = new Contenedor();
		
		Cliente cliente1 = new Cliente();
		
		
		do {
		System.out.println("- Ingrese el numero correspondiente a la opcion del menu que desea utilizar\n");
		System.out.println("1.Almacenar Cliente\n2.Almacenar Profesional\n3.Almacenar Administrativo\n"
						  +"4.Almacenar Capacitacion\n5.Eliminar usuario\n6.Listar usuarios\n"
						  +"7.Listar usuarios por tipo\n8.Listar Capacitaciones\n9.Salir\n ");
			
		menu = scan.nextInt();
		scan.nextLine();
		
		switch (menu) {
		
		case 1:
			
			System.out.println("Ingrese los datos del Cliente\n");
			
			do { System.out.println("Ingrese nombres");
			 nombres = scan.nextLine();
			} while (nombres.isEmpty() || nombres.length() < 5 || nombres.length() >50);
			
			do {
			 System.out.println("Ingrese apellidos");
			 apellidos = scan.nextLine();
			} while (apellidos.isBlank() || apellidos.length() < 5 || apellidos.length() >50);
			
			do {
			 System.out.println("Ingrese fecha de nacimiento en formato DD-MM-AAAA");
			 fechaNacimiento = scan.nextLine();
			} while(fechaNacimiento.isBlank());
			
			do {
			 System.out.println("Ingrese rut - numero menor a 99999999");
			 rut = scan.nextInt();
			 scan.nextLine();
			} while (rut > 99999999);
			
			do {
			 System.out.println("Ingrese telefono");
			 telefono = scan.nextLine();
			} while (telefono.isBlank());
			
			do {
			 System.out.println("Ingrese afp");
			 afp = scan.nextLine();
			} while (afp.length() < 4 && afp.length() >30);
			
			do {
			 System.out.println("Ingrese sistemaSalud - 1. FONASA | 2. ISAPRE");
			 sistemaSalud = scan.nextLine();
			} while (!sistemaSalud.equals("1") && !sistemaSalud.equals("2"));
			
			do {
			 System.out.println("Ingrese direccion");
			 direccion = scan.nextLine();
			} while (direccion.length() > 70);
			
			do {
			 System.out.println("Ingrese comuna");
			 comuna = scan.nextLine();
			} while (comuna.length() > 50);
			
			do {
			 System.out.println("Ingrese edad");
			 edad = scan.nextInt();
			 scan.nextLine();
			} while (edad <0 && edad > 150);
			 
			
			 
			 cliente1 = new Cliente("Cliente",rut,nombres,apellidos,
					 fechaNacimiento,telefono,afp,sistemaSalud,direccion,comuna,edad);
			contenedor.almacenarCliente(cliente1);
			break;
			
		case 2:
			
			System.out.println("Ingrese los datos del Profesional\n");		
			do { System.out.println("Ingrese nombres");
			 nombres = scan.nextLine();
			} while (nombres.isEmpty() || nombres.length() < 5 || nombres.length() >50);
			
			do {
			 System.out.println("Ingrese apellidos");
			 apellidos = scan.nextLine();
			} while (apellidos.isBlank() || apellidos.length() < 5 || apellidos.length() >50);
			
			do {
			 System.out.println("Ingrese fecha de nacimiento en formato DD-MM-AAAA");
			 fechaNacimiento = scan.nextLine();
			} while(fechaNacimiento.isBlank());
			
			do {
			 System.out.println("Ingrese rut - numero menor a 99999999");
			 rut = scan.nextInt();
			 scan.nextLine();
			} while (rut > 99999999);
			
			do {
			 System.out.println("Ingrese titulo");
			 titulo = scan.nextLine();
			} while (titulo.isBlank() || titulo.length() < 10 || titulo.length() > 50);
			 
			 
			 System.out.println("Ingrese fecha de ingreso a la empresa - DD-MM-AAAA");
			 fechaIngreso = scan.nextLine();
			 
			Profesional profesional1 = new Profesional("PROFESIONAL",nombres,apellidos,
					fechaNacimiento,rut,titulo,fechaIngreso);
			
			contenedor.almacenarProfesional(profesional1);
			break;
			
		case 3:
			
			System.out.println("Ingrese los datos del Administrativo\n");
			do { System.out.println("Ingrese nombres");
			 nombres = scan.nextLine();
			} while (nombres.isEmpty() || nombres.length() < 5 || nombres.length() >50);
			
			do {
			 System.out.println("Ingrese apellidos");
			 apellidos = scan.nextLine();
			} while (apellidos.isBlank() || apellidos.length() < 5 || apellidos.length() >50);
			
			do {
			 System.out.println("Ingrese fecha de nacimiento en formato DD-MM-AAAA");
			 fechaNacimiento = scan.nextLine();
			} while(fechaNacimiento.isBlank());
			
			do {
			 System.out.println("Ingrese rut - numero menor a 99999999");
			 rut = scan.nextInt();
			 scan.nextLine();
			} while (rut > 99999999);
			
			do {
			 System.out.println("Ingrese area a la que pertenece");
			 area = scan.nextLine();
			} while (area.isBlank() || area.length() < 5 || area.length() > 20);
			
			do {
			 System.out.println("Ingrese experiencia previa - Max 100 caracteres");
			 experienciaPrevia = scan.nextLine();
			} while (experienciaPrevia.length() > 100);
			 
			Administrativo administrativo1 = new Administrativo("Administrativo",nombres,apellidos,
					fechaNacimiento,rut,area,experienciaPrevia);
			
			contenedor.almacenarAdministrativo(administrativo1);
			break;
			
		case 4:
			
			do {
				System.out.println("Ingrese el ID de la capacitación:\n");
				idCapa = scan.nextInt();
				scan.nextLine();
			} while (idCapa == 0);
			do {
			    System.out.println("Ingrese el dia de la Capacitacion: ");
			    capaDia = scan.nextLine();
			    if (!DIA.contains(capaDia.toUpperCase())) {
			        System.out.println("***DIA NO VALIDO. FAVOR VERIFIQUE EL DIA INGRESADO Y REINTENTELO NUEVAMENTE***");
			    } else {
			        break;
			    }
			} while (true);
			
			do {
				System.out.println("Por favor, ingrese la hora de la Capacitacion en formato 24 horas (HH:MM):");
				capaHora = scan.nextLine();
				if (!capaHora.matches("([01][0-9]|2[0-3]):[0-5][0-9]")) {
					System.out.println("***HORA NO VALIDA***");
				} else {
					break;
				}
			} while (true);
			do {
				System.out.println("Por favor, ingrese el lugar (entre 10 y 50 caracteres):");
				capaLugar = scan.nextLine();
				if (capaLugar == null || capaLugar.length() < 10 || capaLugar.length() > 50) {
					System.out.println("***ERROR. INGRESE UN VALOR ENTRE 10 Y 50 CARACTERES***");
				} else {
					break;
				}
			} while (true);
			do {
				System.out.println("Por favor, ingrese la duración (máximo 70 caracteres):");
				capaDurac = scan.nextLine();
				if (capaDurac != null && capaDurac.length() > 70) {
					System.out.println("***LA DURACION DEBE CONTENER UN MAXIMO DE 70 CARACTERES***");
				} else {
					break;
				}
			} while (true);
			do {
				System.out.println("Por favor, ingrese la cantidad de asistentes (menor a 1000):");
				if (!scan.hasNextInt()) {
					System.out.println("***ERROR. DEBE INGRESAR UN NÚMERO***");
					scan.next();
				} else {
					capaCantAsis = scan.nextInt();
					if (capaCantAsis >= 1000) {
						System.out.println("***ERROR. LA CAPACITACION NO PUEDE TENER MAS DE 1000 ASISTENTES.***");
					} else {
						break;
					}
				}
			} while (true);
			
			Capacitacion capacitacion1 = new Capacitacion(idCapa,capaDia,capaHora,capaLugar,capaDurac,capaCantAsis,cliente1.getRut());
			
			contenedor.almacenarCapacitacion(capacitacion1);
			break;
			
		case 5:
			contenedor.eliminarUsuario();
			break;
		case 6:
			contenedor.listarUsuarios();
			break;
		case 7:
			contenedor.listarUsuariosPorTipo(null);
			break;
		case 8:
			contenedor.listarCapacitaciones();
			break;
		case 9:
			System.out.println("Programa finalizado");
			break;
		default:
			System.out.println("La opcion ingresada no es valida");
			
			
		}
			} while (menu != 9);
		
		
	scan.close();
	}

}
