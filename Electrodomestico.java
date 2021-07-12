
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
		this.color = COLOR[0];
		this.consum = CONSUM_ENER[4];
		this.price = PRICE_BASE;
		this.size = SIZE;
	}

	public Electrodomestico(double price, double size) {
		super();
		this.price = price;
		this.size = size;
		this.color = COLOR[0];
		this.consum = CONSUM_ENER[4];
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
		if (color.equalsIgnoreCase(COLOR[0]))
			return color;
		else if (color.equalsIgnoreCase(COLOR[1]))
			return color;
		else if (color.equalsIgnoreCase(COLOR[2]))
			return color;
		else if (color.equalsIgnoreCase(COLOR[3]))
			return color;
		else
			return COLOR[0];
	}

	public String confirmConsum(String consum) {
		if (consum.contains(CONSUM_ENER[0]))
			return consum;
		else if (consum.contains(CONSUM_ENER[1]))
			return consum;
		else if (consum.contains(CONSUM_ENER[2]))
			return consum;
		else if (consum.contains(CONSUM_ENER[3]))
			return consum;
		else if (consum.contains(CONSUM_ENER[4]))
			return consum;
		else
			return CONSUM_ENER[4];
	}

	@Override
	public String toString() {
		return "Electrodomestico [price=" + price + ", color=" + color + ", consum=" + consum + ", size=" + size + "]";
	}

}
