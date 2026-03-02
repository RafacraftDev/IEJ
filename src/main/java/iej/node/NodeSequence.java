package iej.node;

public class NodeSequence extends Node {

    private NodeSequence(String regex) {
        super(regex);
    }

    public static NodeSequence of(Node... nodes) {
        StringBuilder sb = new StringBuilder();

        for (Node node : nodes) {
            sb.append(node.get());
        }

        return new NodeSequence(sb.toString());
    }
}