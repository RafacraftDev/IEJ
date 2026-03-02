package iej.node;

public class Anchor extends Node {

    private Anchor(String prefix, Node node, String suffix) {
        super(prefix + node.get() + suffix);
    }

    public static Anchor start(Node node) {
        return new Anchor("^", node, "");
    }

    public static Anchor end(Node node) {
        return new Anchor("", node, "$");
    }

    public static Anchor full(Node node) {
        return new Anchor("^", node, "$");
    }
}