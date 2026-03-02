package iej.test;

import iej.node.*;

public class Main {

    public static void main(String[] args) {
        // Create the main sequence node
        Node printNode = Sequence.of(
            Literal.of("printl"),          // Detect the action 'printl'
            Parse.of('('),                 // Escape '('
            Group.of(StringLiteral.of()),  // Capture the content inside quotes
            Parse.of(')'),                 // Escape ')'
            Literal.of(";")                // End of instruction
        );

        // Input string to analyze
        String input = "printl(\"Hello, world\");";

        // Create a matcher using NodeMatcher
        NodeMatcher matcher = NodeMatcher.of(input, printNode);

        // Check for match and extract content
        if (matcher.matches()) {
            String captured = matcher.group(1);  // Captured content inside quotes
            System.out.println("Captured content: " + captured);
        } else {
            System.out.println("Instruction does not match.");
        }
    }
}
