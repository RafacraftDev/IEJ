package iej.node;

public class Or extends Node {

    private Or(String regex) {
        super(regex);
    }

    public static Or of(String... options) {
        return new Or(build(options));
    }

    static String build(String[] options) {
        StringBuilder sb = new StringBuilder("(?:");

        for (int i = 0; i < options.length; i++) {
            sb.append(options[i]);
            if (i < options.length - 1) {
                sb.append("|");
            }
        }

        sb.append(")");
        return sb.toString();
    }
}