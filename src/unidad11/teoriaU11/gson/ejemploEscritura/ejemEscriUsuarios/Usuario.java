package unidad11.teoriaU11.gson.ejemploEscritura.ejemEscriUsuarios;

public class Usuario {
	
	private String name;
	private String email;
	private int age;
	private long phone;
	private String city;
	private boolean hasCreditCard;
	
	
	
	public Usuario(String name, String email, int age, long phone, String city, boolean hasCreditCard) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.phone = phone;
		this.city = city;
		this.hasCreditCard = hasCreditCard;
	}



	@Override
	public String toString() {
		return "Usuario [name=" + name + ",\n email=" + email + ", \n age=" + age + ",\n phone=" + phone + ",\n city=" + city
				+ ", \n hasCreditCard=" + hasCreditCard + "]";
	}
	


}
