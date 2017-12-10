package model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Attributes {
	
	public enum AttributeKey {
		STY, STO, FYS, SMI, INT, PSY, KAR;
	}

	private Map<AttributeKey, DiceForAttributes> attributes;
	
	public Attributes() {
		this.attributes = new LinkedHashMap<>();
		for (AttributeKey key : AttributeKey.values()) {
			attributes.put(key, new DiceForAttributes(3, new Dice()));
		}
	}
	
	public void setAttribute(AttributeKey key, DiceForAttributes dfa) {
		if (attributes.containsKey(key)) {
			attributes.put(key, dfa);
		}
	}
	
	public Map<AttributeKey, DiceForAttributes> getValues() {
		return attributes;
	}
}
