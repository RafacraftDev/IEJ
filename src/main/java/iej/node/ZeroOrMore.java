package iej.node;

public class ZeroOrMore extends Node {

    private ZeroOrMore(Node node) {
        super("(?:" + node.get() + ")*");
    }

    public static ZeroOrMore of(Node node) {
        return new ZeroOrMore(node);
    }
}