package unidad12.teoriaU12.BDDOO;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;

public class PruebaTest {
    public static void main(String[] args) {
        ODB odb = null;
        try {
            odb = ODBFactory.open("test.db"); // Intenta abrir una base de datos
            System.out.println("NeoDatis ODB conectado con éxito.");
        } finally {
            if (odb != null) {
                odb.close(); // Asegúrate de cerrar la conexión
            }
        }
    }
}
