package unidad11.teoriaU11.ficherosBinarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOEjemplo {

	public static void main(String[] args) {
		
		try (DataOutputStream dos= 
				new DataOutputStream(new FileOutputStream("ficherosBinarios/datos.bin")))
			{
			dos.writeInt(42);
			dos.writeDouble(3.14);
			dos.writeUTF("Mañana no vengo");
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try (DataInputStream dis= 
				new DataInputStream(new FileInputStream("ficherosBinarios/datos.bin")))
			{
			
			int entero=dis.readInt();
			double doble=dis.readDouble();
			String cadena=dis.readUTF();
			
			System.out.println("Entero: "+entero);
			System.out.println("Doble: "+doble);
			System.out.println("Cadena: "+cadena);
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
