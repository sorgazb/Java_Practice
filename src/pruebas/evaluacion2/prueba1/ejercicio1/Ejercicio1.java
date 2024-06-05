package pruebas.evaluacion2.prueba1.ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		/*
		 * Almacenamos en un string todas las direcciones MAC:
		 */
		String direccionesMac="00-0C-29-DC-8E-F2,00-14-22-D8-CF-DB-C5,"
				+ "00-0B-0E-32-0E-81-72,00-14-22-1C-BE-35-AE,"
				+ "00-14-22-7F-D4-31-EA,00-0B-0E-31-EA-4B-20,"
				+ "00-14-22-15-D3-97-2C,00-0C-29-BF-09-53-33,"
				+ "00-0C-29-0A-FB-14-D7,00-0C-29-49-C2-94-F9,"
				+ "00-0B-0E-41-EA-BE-64,00-14-22-8F-0F-14-BE,"
				+ "00-14-22-10-83-A5-61,00-0B-0E-D8-8D-65-5B,"
				+ "00-0C-29-60-B5-FF-9E,00-0C-29-A4-75-CC-12,"
				+ "00-14-22-3E-0A-FF-FF,00-14-22-48-E0-CE-08,"
				+ "00-0B-0E-ED-BA-BE-0B,00-0B-0E-7A-97-1C-D5,"
				+ "00-0B-0E-90-E6-81-70,00-14-22-09-24-80-07,"
				+ "00-0C-29-42-FA-03-45,00-0B-0E-32-E9-4D-19,"
				+ "00-14-22-7D-6B-BE-5F,00-0C-29-63-8A-50-BD,"
				+ "00-14-22-D1-CE-6A-7C,00-14-22-3C-CF-B4-17,"
				+ "00-14-22-5A-BD-CB-57,00-14-22-B2-D2-40-65" ;
		
		/*
		 * Almacenamos toda la cadena anterior en un array
		 * pero separamos todos dentro de un array en una posición
		 * diferente separando el String por ,
		 */
		String [] arrayDireccionesMac=direccionesMac.split(",");
		
		obtenerDireccionesMarca(arrayDireccionesMac);
		generarDireccionesIPV6(arrayDireccionesMac);
		

		

	}
	
	public static void obtenerDireccionesMarca(String [] arrayDireccionesMac) {
		/*
		 * Creamos contadores para saber el número de 
		 * direcciones MAC con las que cuenta cada marca
		 */
		int contDell=0;
		int contCisco=0;
		int contHp=0;
		
		/*
		 * Recorremos el array en busca de cadenas que contengan
		 * en su dirección MAC el identifacador de cada equipo.
		 */
		for(int i=0; i < arrayDireccionesMac.length; i++) {
			if(arrayDireccionesMac[i].contains("00-0C-29")) {
				contDell++;
			}else if(arrayDireccionesMac[i].contains("00-0B-0E")) {
				contCisco++;
			}else if(arrayDireccionesMac[i].contains("00-14-22")) {
				contHp++;
			}
		}
		
		System.out.println("Número de Direcciones MAC por marca:");
		System.out.println("Equipos DELL: "+contDell);
		System.out.println("Equipos CISCO: "+contCisco);
		System.out.println("Equipos HP: "+contHp);
	}
	
	public static void generarDireccionesIPV6(String [] arrayDireccionesMac) {
		//Cadena de ipv6 que vamos a concatenar:
		String ipv6="-FF-FE";
		
		//Array que va a almacenar las direcciones ipv6
		String [] arrayIPV6= new String [arrayDireccionesMac.length];
		
		//Copiamos el array de direcciones mac en el nuevo array
		for(int i=0; i < arrayDireccionesMac.length;i++) {
			arrayIPV6[i]=arrayDireccionesMac[i];
		}
		
		//Creamos en el nuevo array las direcciones IPV6:
		for(int i=0; i < arrayIPV6.length; i++) {
			String array1=arrayIPV6[i].substring(0, 8);//Primera parte direccion MAC
			String array2=arrayIPV6[i].substring(8);//Segunda parte direccion MAC
			arrayIPV6[i]=array1.concat(ipv6).concat(array2);
		}
			
		//Mostramos ambos arrays:S
		System.out.println("---DIRECIÓN MAC CON IVP6:---");
		for(int i=0; i < arrayDireccionesMac.length; i++) {
			System.out.println(arrayDireccionesMac[i]+("    IVP6:"+arrayIPV6[i]));
		}
	}

}
