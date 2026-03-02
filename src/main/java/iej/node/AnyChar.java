package iej.node;

public class AnyChar extends Node {

    private AnyChar(char a) {
        super("." + String.valueOf(a));
    }

    public static AnyChar of(char charc) {
        return new AnyChar(charc);
    }
}