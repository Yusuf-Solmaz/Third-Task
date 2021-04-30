package thirdTask;

public class User {
	
	private String name;
	private String surname;
	private String password;
	private String email;
	
	
	
	
	public User(String name, String surname, String password, String email) {
		this.name=name;
		this.surname=surname;
		this.password=password;
		this.email=email;
	}
	
	public void informations() {
		
		System.out.println("Your name and surname is: "+ getName() +" "+getSurname()+ "\n"+
		"Your password is hidden"+"\n"+
		"Your e-mail is: "+ getEmail()		);
	}
	
	
	public void welcome() {
		System.out.println("Hello "+ getName()+"  Welcome to kodlama.io");
	}
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
