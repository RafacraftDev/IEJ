package iej.node;

public class Parse extends Node {
	private Parse(char charc) {
		super("\\" + String.valueOf(charc));
	}
	public static Parse of(char charc) {
		return new Parse(charc);
	}
}