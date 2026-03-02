package iej.node;

public class OneOrMore extends Node {

    private OneOrMore(Node node) {
        super("(" + node.get() + ")+");
    }

    public static OneOrMore of(Node node) {
        return new OneOrMore(node);
    }
}