package iej.node;

public class Group extends Node{
	private Group(Node node) {
		super("\\(" + node.get() + "\\)");
	}
	public static Group of(Node node) {
		return new Group(node);
	}
}