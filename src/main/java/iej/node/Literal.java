package iej.node;

public class Literal extends Node {

    private Literal(String text) {
        super(text);
    }

    public static Literal of(String text) {
        return new Literal(text);
    }
}