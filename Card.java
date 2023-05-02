package finalProject;

public class Card {

	int value;
	String name;
	String suit;

	public Card(String name, String suit, int value) {
		this.name = name;
		this.suit = suit;
		this.value = value;

		if (name.equals("Ace")) {
			this.value = 14;
		} else if (name.equals("King")) {
			this.value = 13;
		} else if (name.equals("Queen")) {
			this.value = 12;
		} else if (name.equals("Jack")) {
			this.value = 11;
		} else if (name.equals("Ten")) {
			this.value = 10;
		} else if (name.equals("Nine")) {
			this.value = 9;
		} else if (name.equals("Eight")) {
			this.value = 8;
		} else if (name.equals("Seven")) {
			this.value = 7;
		} else if (name.equals("Six")) {
			this.value = 6;
		} else if (name.equals("Five")) {
			this.value = 5;
		} else if (name.equals("Four")) {
			this.value = 4;
		} else if (name.equals("Three")) {
			this.value = 3;
		} else if (name.equals("Two"))
			this.value = 2;
		else {
			this.value = Integer.parseInt(name);
		}

	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public void describe() {
		System.out.println(this.name + " of " + this.suit + " ... " + this.value);

	}

}
