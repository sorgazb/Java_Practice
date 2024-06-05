package unidad11.teoriaU11.gson.ejemploLectura.ejemUsuarios;

public class Usuario {
	
	private String name;
	private String email;
	private int age;
	private long phone;
	private String city;
	private boolean hasCreditCard;
	
	@Override
	public String toString() {
		return "Usuario [name=" + name + ",\n email=" + email + ", \n age=" + age + ",\n phone=" + phone + ",\n city=" + city
				+ ", \n hasCreditCard=" + hasCreditCard + "]";
	}
	


}
