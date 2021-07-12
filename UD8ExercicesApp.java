/***
 * 
 * @author rgonzalez
 * @version 12/07/2021
 * 
 *         # java-poo All exercices of UD8 Comenzamos ya con programacion
 *         orientada a objetos(POO), en esta sesion se van a realizar diferentes
 *         ejerciciops para poner en practica la metodologia de programacion
 *         orientada a objetos.
 *
 */
public class UD8ExercicesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona();
		Persona p2 = new Persona("Raul", 20, "43565299X", 80.0, 181, 'H');
		Persona p3 = new Persona("Caca", 34, 'M');
		System.out.println("Nombre p: " + p.getName());
		System.out.println("Nombre de p2: " + p2.getName());
		System.out.println("Nombre de p3: " + p3.getName());
		// PASSWORD
		Password pass = new Password();
		Password pass2 = new Password(10);
		System.out.println("Password 1: " + pass.generatePassword());
		System.out.println("Password 2: " + pass2.generatePassword());
		// ELECTRODOMESTICO
		Electrodomestico ele = new Electrodomestico();
		Electrodomestico ele2 = new Electrodomestico(1111.21, 50.9);
		Electrodomestico ele3 = new Electrodomestico(50, "negro", "D", 60.4);
		System.out.println("Electrodomestico 1: " + ele.getColor());
		System.out.println("Electrodomestico 2: " + ele2.getColor());
		System.out.println("Electrodomestico 3: " + ele3.getColor());
		// SERIES
		Serie s = new Serie();
		Serie s1 = new Serie("Raul Gonzalez", "La novia cadaver");
		Serie s2 = new Serie("Ejemplo 2", 5, "Terror", "Raul Gonzalez");
		System.out.println("Serie 1: " + s.isEntregado() + " NumTemp: " + s.getNumTemp());
		System.out.println("Serie 2: " + s1.getCreador() + " Creador: " + s1.getTitulo());
		System.out.println("Serie 3: " + s2.getCreador() + " Creador: " + s2.getTitulo());
	}

}
