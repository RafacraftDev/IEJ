package iej.node;

public class Spaces extends Node {
	private Spaces() {
		super("\\s+");
	}
	public static Spaces of() {
		return new Spaces();
	}
}