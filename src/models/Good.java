package models;

public class Good extends Product {

	// Konstruktor
	public Good(int number, String name, String unit, double amount, double purchasePrice, double salePrice) {
		super(number, name, unit, amount, purchasePrice, salePrice);

	}

	

	

	// Zum testen ob die Objekte erzeugt wurden
	public void displayproduct() {
		System.out.println("Good: " + number + ", " + name + ", " + unit + ", " + amount + ", " + purchasePrice + ", "
				+ salePrice);
	}


	@Override
	public int getNumber() {
		return number;

	}

	public static int getIndex(int numberOfGood) {

		int i = 0;

		for (Good g : GasStation.getGoods()) {
			if (g.getNumber() == numberOfGood) {
				i = GasStation.getGoods().indexOf(g);
			} else
				continue;
		}

		return i;

	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	// Die korrekte Ausgabe f�r die Textdatei wird erzeugt
	public String displaytextfile() {
		String text = String.valueOf(number) + ";" + name + ";" + unit + ";" + String.valueOf(amount) + ";"
				+ String.valueOf(purchasePrice) + ";" + String.valueOf(salePrice);
		return text;
	}

}
