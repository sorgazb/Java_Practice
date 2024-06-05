package unidad12.teoriaU12.BDDOO;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;
import org.neodatis.odb.core.query.criteria.Where;


public class AppCRUD {
    public static void main(String[] args) {
        ODB odb = ODBFactory.open("personas.db");

        // Crear y almacenar una nueva persona
        Persona persona1 = new Persona(1, "Juan");
        odb.store(persona1);
        Persona persona2 = new Persona(2, "Manuela");
        odb.store(persona2);
        
		leerPersonas(odb);

        actualizarPersona(odb,"Antonio");
        
        leerPersonas(odb);
        
        eliminarPersona(odb,2);
        
        leerPersonas(odb);

        //eliminarPersonas(odb);

        odb.close();
    }
 // Eliminar personas
	private static void eliminarPersonas(ODB odb) {
		Objects<Persona> personas;
        personas = odb.getObjects(Persona.class);
        if (personas.size() > 0) {
            Persona persona = personas.getFirst();
            odb.delete(persona);
        }
	}
	
	//Eliminar persona
	
	private static void eliminarPersona(ODB odb,long personaId) {
		
        // Se crea una sentencia para buscar la pesona a eliminar
        CriteriaQuery query = new CriteriaQuery(Persona.class, Where.equal("id", personaId));
        Objects<Persona> personas = odb.getObjects(query);

        // Se comprueba que existe la persona y se elimina
        if (personas.hasNext()) {
            Persona persona = personas.next();
            odb.delete(persona);
            System.out.println("Persona eliminada: " + persona.getNombre());
        } else {
            System.out.println("No se encontró la persona con ID: " + personaId);
        }
	        
	}
	

	// Actualizar persona
	private static void actualizarPersona(ODB odb,String nombre) {
		Objects<Persona> personas;
        personas = odb.getObjects(Persona.class);
        if (personas.size() > 0) {
            Persona persona = personas.getFirst();
            persona.setNombre(nombre);
            odb.store(persona);
        }
	}

	// Leer personas
	private static void leerPersonas(ODB odb) {
        Objects<Persona> personas = odb.getObjects(Persona.class);
        System.out.println("Listado de Personas:");
        while (personas.hasNext()) {
            Persona persona = personas.next();
            System.out.println(persona.getId() + " - " + persona.getNombre());
        }
	}
}

