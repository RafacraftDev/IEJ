package iej.node;

public class StringLiteral extends Node {

    private StringLiteral() {
        super("\".*\"");
    }

    public static StringLiteral of() {
        return new StringLiteral();
    }
}