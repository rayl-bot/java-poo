
public class Persona {
	private String name;//Nombre
	private int yearsOld;//Edad
	private String dni;//DNI
	private double size;//Peso
	private int height;//Altura
	private char sex;//Sexo
	private static final char SEX_DEFAULT = 'M';//Constante sexo default

	public Persona(String name, int yearsOld, char sex) {
		this.name = name;
		this.yearsOld = yearsOld;
		this.sex = sex;
		this.height = 0;
		this.size = 0;
	}

	//Constructor por defecto con los parametros defaults
	public Persona() {
		super();
		this.name = "";
		this.height = 0;
		this.size = 0;
		this.yearsOld = 0;
		this.sex = SEX_DEFAULT;
	}

	//Constructor por parametro de persona
	public Persona(String name, int yearsOld, String dni, double size, int height, char sex) {
		super();
		this.name = name;
		this.yearsOld = yearsOld;
		this.dni = dni;
		this.size = size;
		this.height = height;
		this.sex = sex;
	}

	//Getters y Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public char getSex() {
		return sex;
	}

}
