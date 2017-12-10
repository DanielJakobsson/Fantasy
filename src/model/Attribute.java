package model;

public class Attribute {
	private String key;
	private DiceForAttributes diceForAttributes;

	public Attribute(String key, DiceForAttributes diceForAttributes) {
		super();
		this.key = key;
		this.diceForAttributes = diceForAttributes;
	}

	public String getKey() {
		return key;
	}

	public DiceForAttributes getDiceForAttributes() {
		return diceForAttributes;
	}
}
