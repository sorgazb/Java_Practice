package unidad9.teoriaU9.colecciones.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploLista {

	public static void main(String[] args) {
		List al1 = new ArrayList();
		List al2 = new ArrayList(10);
		List al3 = new ArrayList(al1);
		List<String> al4 = new ArrayList<String>();
		List<String> al5 = new ArrayList<String>(Arrays.asList("A", "B", "C"));

		Usuario u1 = new Usuario(1, "Sergio");
		Usuario u2 = new Usuario(2, "Mario");
		Usuario u3 = new Usuario(3, "Fran");
		Usuario u4 = new Usuario(4, "Antonio");
		Usuario u5 = new Usuario(5, "Moises");
		Usuario u6 = new Usuario(6, "Laura");

		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(u1);
		usuarios.add(u2);
		usuarios.add(u3);

		System.out.println("USUARIOS");
		System.out.println(usuarios);

		List<Usuario> listUsuarios = new ArrayList<Usuario>();
		listUsuarios.addAll(usuarios);
		
		System.out.println("LISTA USUARIOS");
		System.out.println(usuarios);
		
		List<Usuario> listEmpleados = new ArrayList<Usuario>(10);
		listEmpleados.add(u4);
		listEmpleados.add(u5);
		listEmpleados.add(u6);
		
		System.out.println("LISTA EMPELADOS");
		System.out.println(listEmpleados);
		
		listEmpleados.addAll(1,listUsuarios);
		
		System.out.println("LISTA EMPELADOS + ");
		System.out.println(listEmpleados);
		
		Usuario u7= new Usuario(7, "Amor");
		
		listEmpleados.add(2,u7);
		
		System.out.println("LISTA EMPLEADOS ++");
		System.out.println(listEmpleados);
		
		listEmpleados.remove(u7);
		
		System.out.println("LISTA EMPLEADOS -");
		System.out.println(listEmpleados);

		
		listEmpleados.remove(0);
		
		System.out.println("LISTA EMPLEADOS --");
		System.out.println(listEmpleados);
		
		Usuario u8= new Usuario(8, "Serapio");
		listEmpleados.set(3, u8);
		
		System.out.println("LISTA EMPLEADOS <-->");
		System.out.println(listEmpleados);
		
		listEmpleados.clear();
		System.out.println("LISTA EMPLEADOS Vacia");
		System.out.println(listEmpleados);
		

	}

}
