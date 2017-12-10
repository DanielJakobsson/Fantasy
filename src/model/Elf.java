package model;

import model.Attributes.AttributeKey;

public class Elf {
	
	private Attributes attributes;
	
	public Elf(){
			this.attributes = new Attributes();
			attributes.setAttribute(AttributeKey.STY, new DiceForAttributes(2, Dice.D6, 3));
			attributes.setAttribute(AttributeKey.STO, new DiceForAttributes(2, Dice.D6, 2));
			attributes.setAttribute(AttributeKey.SMI, new DiceForAttributes(3, Dice.D6, 3));
			attributes.setAttribute(AttributeKey.INT, new DiceForAttributes(4, Dice.D6));
			attributes.setAttribute(AttributeKey.KAR, new DiceForAttributes(3, Dice.D6, 2));
	}
		
		public void print() {
			System.out.println("Elf:");
			for (AttributeKey key : attributes.getValues().keySet()) {
				DiceForAttributes dfa = attributes.getValues().get(key);
				System.out.println("> " + key + " : " + dfa + " -> " + dfa.roll());
			}
		}
	}

