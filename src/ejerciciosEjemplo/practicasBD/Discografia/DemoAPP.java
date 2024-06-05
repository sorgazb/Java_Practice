package ejerciciosEjemplo.practicasBD.Discografia;

import java.util.List;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

public class DemoAPP {
	public static void main(String[] args) {
		ODB odb = ODBFactory.open("discografia.db");
		aniadirArtistaBD(odb);
		leerArtistas(odb);
		eliminarArtista(odb, "Maluma");
		leerArtistas(odb);
		actualizarDatosArtistaOyentes(odb, 1500, "Karol");
		odb.close();
	}
	
	private static void aniadirArtistaBD(ODB odb) {
		Discografia discografia=new Discografia();
		discografia.leerFichero();
		List<Artistas> lista=discografia.listaArtistas;
		for(Artistas artista:lista) {
			odb.store(artista);
		}
	}
	
	private static void leerArtistas(ODB odb) {
        Objects<Artistas> artistas = odb.getObjects(Artistas.class);
        System.out.println("Listado de Artistas:");
        while (artistas.hasNext()) {
            Artistas artista = artistas.next();
            System.out.println(artista);
        }
	}
	
	private static void eliminarArtista(ODB odb,String nombre) {
		
        // Se crea una sentencia para buscar el artista a eliminar
        CriteriaQuery query = new CriteriaQuery(Artistas.class, Where.equal("nombre", nombre));
        Objects<Artistas> artistas = odb.getObjects(query);

        // Se comprueba que existe el artista y se elimina
        if (artistas.hasNext()) {
            Artistas artista = artistas.next();
            odb.delete(artista);
            System.out.println("Artista eliminado: " + artista.getNombre());
        } else {
            System.out.println("No se encontró al artista: " + nombre);
        }    
	}
	
	// Actualizar artista
	private static void actualizarDatosArtistaOyentes(ODB odb,int oyentes, String nombre) {
        CriteriaQuery query = new CriteriaQuery(Artistas.class, Where.equal("nombre", nombre));
        Objects<Artistas> artistas = odb.getObjects(query);

        // Se comprueba que existe el artista y se elimina
        if (artistas.hasNext()) {
            Artistas artista = artistas.next();
            artista.setOyentes_spotify(oyentes);
            odb.store(artista);
            System.out.println("Oyentes mensuales actualizados.");
            System.out.println(artista);
        } else {
            System.out.println("No se encontró al artista: " + nombre);
        } 
	}
}
