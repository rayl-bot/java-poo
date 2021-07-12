import java.util.*;

public class Password {
	
	private int size;
	private String password;

	public Password() {
		this.size = 1;
		this.password = "";
	}

	public Password(int size) {
		super();
		this.size = size;
		this.password = "";
	}
	
	//Getters y Setters
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String generatePassword() {
		Random ran = new Random();
		char data = ' ';

		for (int i=0; i<this.size; i++) {
		  data = (char)(ran.nextInt(25)+97);
		  this.password = data + this.password;
		}
	    return this.password;
	}

}
