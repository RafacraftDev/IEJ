package iej.node;

public class Or extends Node {

    private Or(String regex) {
        super(regex);
    }

    public static Or of(Node... nodes) {
        return new Or(build(nodes));
    }

    public static Or of(String... options) {
        Node[] nodes = new Node[options.length];
        for (int i = 0; i < options.length; i++) {
            nodes[i] = Literal.of(options[i]);
        }
        return of(nodes);
    }

    static String build(Node[] nodes) {
        StringBuilder sb = new StringBuilder("(?:");

        for (int i = 0; i < nodes.length; i++) {
            sb.append(nodes[i].get());
            if (i < nodes.length - 1) {
                sb.append('|');
            }
        }

        sb.append(")");
        return sb.toString();
    }
}
