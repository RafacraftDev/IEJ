package iej.node;

public class Whitespace extends Node {
	private Whitespace(String regex) {
		super(regex);
	}

	public static Whitespace required() {
		return new Whitespace("\\s+");
	}

	public static Whitespace optional() {
		return new Whitespace("\\s*");
	}

	public static Whitespace single() {
		return new Whitespace("\\s");
	}

	public static Whitespace inlineRequired() {
		return new Whitespace("[ \\t]+");
	}
}