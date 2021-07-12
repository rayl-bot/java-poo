enum Color{
	BLANCO, NEGRO, AZUL, ROJO, DEFAULT();
}

enum Consum{
	A,B,C,D,E,F;
}
public class Electrodomestico {
	// contantes que se van a utilizar
	protected static final String[] CONSUM_ENER = { "A", "B", "C", "D", "F" };
	protected static final String[] COLOR = { "blanco", "negro", "azul", "rojo" };
	protected static final double PRICE_BASE = 100;
	protected static final double SIZE = 5;

	protected double price;
	protected String color;
	protected String consum;
	protected double size;

	public Electrodomestico() {
		this.color = Color.BLANCO.toString();
		this.consum = Consum.F.toString();
		this.price = PRICE_BASE;
		this.size = SIZE;
	}

	public Electrodomestico(double price, double size) {
		super();
		this.price = price;
		this.size = size;
		this.color = Color.BLANCO.toString();
		this.consum = Consum.F.toString();
	}

	public Electrodomestico(double price, String color, String consum, double size) {
		super();
		this.price = price;
		this.color = confirmColor(color);
		this.consum = confirmConsum(consum);
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = confirmColor(color);
	}

	public String getConsum() {
		return consum;
	}

	public void setConsum(String consum) {
		this.consum = confirmConsum(consum);
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String confirmColor(String color) {
		if (color.equalsIgnoreCase(Color.BLANCO.toString()))
			return color;
		else if (color.equalsIgnoreCase(Color.NEGRO.toString()))
			return color;
		else if (color.equalsIgnoreCase(Color.AZUL.toString()))
			return color;
		else if (color.equalsIgnoreCase(Color.ROJO.toString()))
			return color;
		else
			return Color.BLANCO.toString();
	}

	public String confirmConsum(String consum) {
		if (consum.contains(Consum.A.toString()))
			return consum;
		else if (consum.contains(Consum.B.toString()))
			return consum;
		else if (consum.contains(Consum.C.toString()))
			return consum;
		else if (consum.contains(Consum.D.toString()))
			return consum;
		else if (consum.contains(Consum.E.toString()))
			return consum;
		else if (consum.contains(Consum.F.toString()))
			return consum;
		else
			return Consum.F.toString();
	}

	@Override
	public String toString() {
		return "Electrodomestico [price=" + price + ", color=" + color + ", consum=" + consum + ", size=" + size + "]";
	}

}
