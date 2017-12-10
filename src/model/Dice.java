package model;

import java.util.Random;

public class Dice {

	public static final Dice D6 = new Dice();
	
	private int sides;
	private int currentValue;

	private final Random random = new Random();

	// default constructor
	public Dice() {
		this.sides = 6;
		roll();
	}

	// construktor for alt. sides
	public Dice(int sides) {
		this.sides = sides;
		roll();
	}

	// rolls dice
	public int roll() {
		this.currentValue = random.nextInt(sides) + 1;
		return currentValue;
	}

	public int getSides() {
		return sides;
	}

	public String getName() {
		return "D" + sides;
	}

	// gets the rolled dice
	public int getValue() {
		return currentValue;
	}
}
