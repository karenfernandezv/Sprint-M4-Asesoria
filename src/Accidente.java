
import java.util.Scanner;

public class Accidente {

	private int idAccidente;
	private String accideDia;
	private String accideHora;
	private String accideLugar;
	private String accideOrigen;
	private String accideConsecu;

	// Listas-Arrays y Scanner

	private static final Scanner teclado = new Scanner(System.in);

	// Getters y Setters
	public int getIdAccidente() {
		return idAccidente;
	}

	public void setIdAccidente(int idAccidente) {
		this.idAccidente = idAccidente;
	}


	public String getAccideDia() {
		return accideDia;
	}

	public void setAccideDia(String accideDia) {
	    boolean ingresoValido = false;
	    while (!ingresoValido) {
	        System.out.println("Ingrese el dia de la Capacitacion (DD-MM-YYYY): ");
	        accideDia = teclado.nextLine();
	        if (!accideDia.matches("\\d{2}-\\d{2}-\\d{4}")) {
	            System.out.println("***DIA NO VALIDO. FAVOR VERIFIQUE EL DIA INGRESADO Y REINTENTELO NUEVAMENTE***");
	        } else {
	            ingresoValido = true;
	        }
	    }
        this.accideDia = accideDia;
	}


	public String getAccideHora() {
		return accideHora;
	}

	public void setAccideHora(String accideHora) {
		boolean ingresoValido = false;
		while (!ingresoValido) {
			System.out.println("\nPor favor, ingrese la HORA del ACCIDENTE (en formato HH:MM):");
			accideHora = teclado.nextLine();
			if (!accideHora.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]")) {
				System.out.println("\n***HORA NO VALIDA. FAVOR RESPETE EL FORMATO SOLICITADO***");
			} else {
				ingresoValido = true;
			}
		}
		this.accideHora = accideHora;
	}

	public String getAccideLugar() {
		return accideLugar;
	}

	public void setAccideLugar(String accideLugar) {
		boolean ingresoValido = false;
		while (!ingresoValido) {
			System.out.println("Por favor, ingrese el LUGAR del ACCIDENTE (entre 10 y 50 caracteres):");
			accideLugar = teclado.nextLine();
			if (accideLugar == null || accideLugar.length() < 10 || accideLugar.length() > 50) {
				System.out.println("***ERROR. INGRESE ENTRE 10 Y 50 CARACTERES***");
			} else {
				ingresoValido = true;
			}
		}
		this.accideLugar = accideLugar;
	}

	public String getAccideOrigen() {
		return accideOrigen;
	}

	public void setAccideOrigen(String accideOrigen) {
		boolean ingresoValido = false;
		while (!ingresoValido) {
			System.out.println("Por favor, ingrese el ORIGEN del ACCIDENTE (máximo 100 caracteres):");
			accideOrigen = teclado.nextLine();
			if (accideOrigen.length() > 100) {
				System.out.println("***ERROR. INGRESE MAX. 100 CARACTERES***");
			} else {
				ingresoValido = true;
			}
		}
		this.accideOrigen = accideOrigen;
	}

	public String getAccideConsecu() {
		return accideConsecu;
	}

	public void setAccideConsecu(String accideConsecu) {
		boolean ingresoValido = false;
		while (!ingresoValido) {
			System.out.println("Por favor, ingrese las CONSECUENCIAS del ACCIDENTE (máximo 100 caracteres):");
			accideConsecu = teclado.nextLine();
			if (accideConsecu.length() > 100) {
				System.out.println("***ERROR. INGRESE MAX. 100 CARACTERES***");
			} else {
				ingresoValido = true;
			}
		}
		this.accideConsecu = accideConsecu;
	}
}
