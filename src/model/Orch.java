package model;

import model.Attributes.AttributeKey;

public class Orch {

	private Attributes attributes;

	public Orch() {
		this.attributes = new Attributes();
		attributes.setAttribute(AttributeKey.STY, new DiceForAttributes(4, Dice.D6));
		attributes.setAttribute(AttributeKey.SMI, new DiceForAttributes(2, Dice.D6, 3));
		attributes.setAttribute(AttributeKey.KAR, new DiceForAttributes(2, Dice.D6));
	}
	
	public void print() {
		System.out.println("Orch:");
		for (AttributeKey key : attributes.getValues().keySet()) {
			DiceForAttributes dfa = attributes.getValues().get(key);
			System.out.println("> " + key + " : " + dfa + " -> " + dfa.roll());
		}
	}
}
