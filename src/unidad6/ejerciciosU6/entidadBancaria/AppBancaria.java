package unidad6.ejerciciosU6.entidadBancaria;
import java.security.SecureRandom;
import java.util.Scanner;

public class AppBancaria {

	//Atributos:
	public static Scanner entrada = new Scanner(System.in);
	public static SecureRandom random = new SecureRandom();
	public static final int MAX_USUARIOS = 10;
	public static String[] claveUsuario = new String[6];
	public static String[] claveInicioSesion = new String[6];

	/*
	 * Método principal en el que se crea un Array de Usuarios y se llama a la funcionalidad del programa.
	 */
	public static void main(String[] args) {
		Usuario[] array_usuarios = new Usuario[MAX_USUARIOS];
		funcionalidadAppBancaria(array_usuarios);
	}

	/*
	 * Método el cual nos muestra un menú de interacción en el que el usuario puede ver las 
	 * distintas opciones que puede elegir el usuario.
	 */
	public static void menu() {
		System.out.println("---- MENÚ USUARIO ----");
		System.out.println("1-> Crear nuevo usuario.");
		System.out.println("2-> Iniciar Sesión.");
		System.out.println("0-> SALIR.");
		System.out.print("Opción:");
	}

	/*
	 * Método que controla toda la funcionalidad del programa, contamos con varias opciones, las cuales nos 
	 * permiten crear un nuevo usuario, iniciar sesión con los datos del usuario y salir del programa.
	 * Está controlado en el caso de introducir una opción no valida.
	 */
	public static void funcionalidadAppBancaria(Usuario[] array_usuarios) {
		int opcion = 0;
		do {
			menu();
			opcion = entrada.nextInt();
			switch (opcion) {
			case 1:
				entrada.nextLine();
				System.out.println("CREAR NUEVO USUARIO.");
				crearNuevoUsuario(array_usuarios);
				break;
			case 2:
				entrada.nextLine();
				System.out.println("INICIAR SESIÓN.");
				iniciarSesion(array_usuarios);
				break;
			case 0:
				System.out.println("SALIENDO...");
				break;
			default:
				System.err.println("ERROR. Opción invalida.");
				break;
			}
		} while (opcion != 0);
		System.out.println("Gracias por usar nuestra APP, hasta pronto.");
	}

	/*
	 * 
	 */
	public static void iniciarSesion(Usuario[] array_usuarios) {
		if (existenUsuarios(array_usuarios) == false) {
			System.err.println("ERROR.No existen usuarios en nuestro banco, porfavor cree uno.");
		} else {
			boolean fin = false;
			String dni;
			String fechaNacimiento;
			dni = pedirDni();
			fechaNacimiento = pedirFechaNacimiento();
			for (int i = 0; i < array_usuarios.length && !fin; i++) {
				if (array_usuarios[i].getDni().equalsIgnoreCase(dni)) {
					if (array_usuarios[i].getFechaNacimiento().equalsIgnoreCase(fechaNacimiento)) {
						claveUsuario=array_usuarios[i].getClave();
						System.out.println("Usuario encontrado.");
						funcionalidadClaveUsuario(claveInicioSesion, claveUsuario);
						fin = true;
					} else {
						System.err.println("ERROR.El usuario con DNI: " + dni + " no tiene esa fecha de nacimiento.");
					}
				} else {
					System.err.println("ERROR.No existe ningún usuario con ese DNI en nuestro banco.");
				}
			}
			if (fin == false) {
				System.err.println("ERROR.No se ha econtrado ningún usuario con esos datos.");
			}
		}
	}

	/*
	 * 
	 */
	public static void crearNuevoUsuario(Usuario[] array_usuarios) {
		boolean creado = false;
		for (int i = 0; i < array_usuarios.length && !creado; i++) {
			if (array_usuarios[i] == null) {
				String dni = pedirDni();
				String fechaNacimiento = pedirFechaNacimiento();
				generarClaveUsuario(claveUsuario);
				array_usuarios[i] = new Usuario(dni, fechaNacimiento, claveUsuario);
				if (array_usuarios[i] != null) {
					creado = true;
					array_usuarios[i].imprimirDatos();
				}
			}
		}
		if (creado) {
			System.out.println("Nuevo Usuario creado.");
		} else {
			System.err.println("ERROR.No se pudo crear el usuario.");
		}
	}

	/*
	 * Método el cual nos devuelve un String DNI, el cual introduce el usuario por teclado, en este 
	 * método hasta que no se ponga un formarto válido de DNI no nos dejará salir del método.
	 */
	public static String pedirDni() {
		String dni = "";
		boolean valido = false;
		while (!valido) {
			System.out.println("DNI: ");
			dni = entrada.nextLine();
			if (validarDni(dni) == false) {
				valido = false;
			} else {
				valido = true;
			}
		}
		return dni;
	}

	/*
	 * Método el cual nos devuelve un String Fecha de Nacimiento, el cual introduce el usuario por teclado, 
	 * en este método hasta que no se ponga un formarto válido de Fecha de Nacimiento no nos dejará
	 * salir del método.
	 */
	public static String pedirFechaNacimiento() {
		String fechaNacimiento = "";
		boolean valido = false;
		while (!valido) {
			System.out.println("Fecha Nacimiento: ");
			fechaNacimiento = entrada.nextLine();
			if (validarFechaNacimiento(fechaNacimiento) == false) {
				valido = false;
			} else {
				valido = true;
			}
		}
		return fechaNacimiento;
	}

	/*
	 * Método en el cual llamos a al método de validad_DNI de la clase Valida
	 */
	public static boolean validarDni(String dni) {
		boolean validado = true;
		if (!ValidadUsuario.validad_DNI(dni)) {
			System.err.println("ERROR. Formato DNI invalido.");
			validado = false;
		} else {
			validado = true;
		}
		return validado;
	}

	public static boolean validarFechaNacimiento(String fechaNacimiento) {
		boolean validado = true;
		if (!ValidadUsuario.validad_FechaNacimiento(fechaNacimiento)) {
			System.err.println("ERROR. Formato Fecha de Nacimiento invalido.");
			validado = false;
		} else {
			validado = true;
		}
		return validado;
	}

	public static void generarClaveUsuario(String[] claveUsuario) {
		for (int i = 0; i < claveUsuario.length; i++) {
			int num = random.nextInt(10);
			claveUsuario[i] = ("" + num);
		}
	}

	public static boolean existenUsuarios(Usuario[] array_usuarios) {
		boolean existen = false;
		int cont = 0;
		for (int i = 0; i < array_usuarios.length; i++) {
			if (array_usuarios[i] != null) {
				cont++;
			}
		}
		if (cont != 0) {
			existen = true;
		}
		return existen;
	}

	public static void funcionalidadClaveUsuario(String[] claveInicioSesion, String[] claveUsuario) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		num1 = random.nextInt(6);
		num2 = random.nextInt(6);
		num3= random.nextInt(6);
		if (num2 == num1) {
			while (num2 == num1) {
				num2 = random.nextInt(6);
			}
		} else {
			if (num3 == num2 || num3 == num1) {
				while (num3 == num2 && num3 == num1) {
					num3 = random.nextInt(6);
				}
			}
		}
		String [] posicionesABuscar= new String [3];
		posicionesABuscar[0]=claveUsuario[num1];
		posicionesABuscar[1]=claveUsuario[num2];
		posicionesABuscar[2]=claveUsuario[num3];
		
		claveInicioSesion=claveUsuario;
		claveInicioSesion[num1]=" ";
		claveInicioSesion[num2]=" ";
		claveInicioSesion[num3]=" ";
		for(int i=0; i < claveInicioSesion.length; i++) {
			if(claveInicioSesion[i].equalsIgnoreCase(" ")) {
				
			}else {
				claveInicioSesion[i]="*";
			}
		}
		mostrarClaveUsuario(claveInicioSesion);
		
		for(int j=0; j<claveInicioSesion.length; j++) {
			if(claveInicioSesion[j].equalsIgnoreCase(" ")) {
				System.out.println("Introduce el valor de la posicion "+(j+1)+":");
				claveInicioSesion[j]=entrada.nextLine();
			}
		}
		
		if(claveInicioSesion[num1].equalsIgnoreCase(posicionesABuscar[0])) {
			if(claveInicioSesion[num2].equalsIgnoreCase(posicionesABuscar[1])) {
				if(claveInicioSesion[num3].equalsIgnoreCase(posicionesABuscar[2])) {
					System.out.println("Clave correcta.");
				}else {
					System.out.println("ERROR. En la cifra 3");
				}
			}else {
				System.out.println("ERROR. En la cifra 2");
			}
		}else {
			System.out.println("ERROR. En la cifra 1");
		}
	}

	public static void mostrarClaveUsuario(String[] claveInicioSesion) {
		for (String elemento : claveInicioSesion) {
			System.out.print("[" + elemento + "]");
		}
		System.out.println("");
	}
}
