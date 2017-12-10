package model;

public class DiceForAttributes {

	private int numberOfDices;
	private Dice dice;
	private int modifier;

	public DiceForAttributes(int numberOfDices, Dice dice) {
		super();
		this.numberOfDices = numberOfDices;
		this.dice = dice;
		this.modifier = 0;
	}
	
	public DiceForAttributes(int numberOfDices, Dice dice, int modifier) {
		super();
		this.numberOfDices = numberOfDices;
		this.dice = dice;
		this.modifier = modifier;
	}

	public int getNumberOfDices() {
		return numberOfDices;
	}

	public Dice getDice() {
		return dice;
	}

	public int getModifier() {
		return modifier;
	}

	public int roll() {
		int value = 0;
		for(int i = 0; i < numberOfDices; i++) {
			value += dice.roll();
		}
		return value + modifier;
	}
	
	@Override
	public String toString() {
		return numberOfDices + dice.getName() + (modifier > 0 ? "+" + modifier : "" );
	}
}
