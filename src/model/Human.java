package model;

import model.Attributes.AttributeKey;

public class Human {
	
private Attributes attributes;
	
	public Human(){
			this.attributes = new Attributes();
	}
		
		public void print() {
			System.out.println("Human:");
			for (AttributeKey key : attributes.getValues().keySet()) {
				DiceForAttributes dfa = attributes.getValues().get(key);
				System.out.println("> " + key + " : " + dfa + " -> " + dfa.roll());
			}
		}

}
