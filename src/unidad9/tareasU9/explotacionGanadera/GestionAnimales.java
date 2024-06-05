package unidad9.tareasU9.explotacionGanadera;

import java.time.LocalDate;

public class GestionAnimales {

	//Crear menú y mapa 
	public static void main(String[] args) {
		Leche vaca1= 
				new Leche(1, 2002, "Bakca White", 
						LocalDate.of(2021, 12, 4), "Rubia gallega", 
						Tipo.VACUNO, Sexo.HEMBRA, 21, 1500.55);
		Carne cerdo1= 
				new Carne(2, 2023, "Antonio Pig", 
						LocalDate.of(2023, 12, 31), "Large White", 
						Tipo.PORCINO, Sexo.MACHO,100, 50,0,0,50);
		
		Cria oveja1= 
				new Cria(3, 2023, "Doly", 
						LocalDate.of(2023, 12, 31), "Churra", 
						Tipo.BOVINO, Sexo.HEMBRA);
		
		Revision revision1= new Revision("Clinica Veterinaria Walid-Mottors", LocalDate.now(), false);
		
		System.out.println("INFO VACA");
		System.out.println(vaca1);
		vaca1.aniadirRevision(revision1);
		vaca1.obtenerRevisiones();
		
		System.out.println("INFO CERDO");
		System.out.println(cerdo1);
		cerdo1.mostrarComidas();
		
		System.out.println("INFO OVEJA");
		System.out.println(oveja1);
		oveja1.aniadirCria(2024, 17);
		oveja1.mostrarCrias();
		
	}

}
