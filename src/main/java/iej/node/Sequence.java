package iej.node;

public class Sequence extends Node {
	private Sequence(String text) {
		super(text);
	}

	public static Sequence of(Node... nodes) {
		StringBuilder sb = new StringBuilder();

		for (Node node : nodes) {
			sb.append(node.get());
		}

		return new Sequence(sb.toString());
	}
	public NodeValuer values() {
		NodeValuer nodeValuer = new NodeValuer(this.get());
		return nodeValuer;
	}
}