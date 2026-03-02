package iej.node;

public class OptionalOr extends Node {
	private OptionalOr(String... options) {
		super(Or.build(options) + "?");
	}
}