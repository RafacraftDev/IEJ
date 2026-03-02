package iej.node;

public class Optional extends Node {
	private Optional(String c) {
		super("(?:" + c + ")?");
	}
	
	public static Optional of(String r) {
		return new Optional(r);
	}
}