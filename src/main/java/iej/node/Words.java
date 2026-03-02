package iej.node;

public class Words extends Node {

    private Words(String content) {
        super("[" + content + "]");
    }

    public static Words of(String... parts) {
        StringBuilder sb = new StringBuilder();

        for (String part : parts) {

            if (part.contains("...")) {
                String[] range = part.split("\\.\\.\\.");
                sb.append(range[0]).append("-").append(range[1]);
            } else {
                sb.append(part);
            }
        }

        return new Words(sb.toString());
    }
}