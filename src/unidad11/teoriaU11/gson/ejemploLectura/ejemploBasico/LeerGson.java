package unidad11.teoriaU11.gson.ejemploLectura.ejemploBasico;

import com.google.gson.Gson;

public class LeerGson {

	public static void main(String[] args) {
		//Esto suele ser un fichero JSON.
		String json="{'nombre':'Paco','email':'paco@educarex.es','curso':'DAW'}";
		
		Gson gson=new Gson();
		Usuario usuario=gson.fromJson(json,Usuario.class);
		System.out.println(usuario);
		
	}

}
