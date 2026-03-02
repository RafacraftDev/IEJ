# IEJ - Interactive Expression Java Interpreter

IEJ is a lightweight mini-interpreter built in Java using a **node-based regex system**.  
It allows you to define sequences, groups, literals, and other elements to detect and capture structured input, like simple `printl("…");` commands, without manually writing complex regular expressions.

---

## 🧱 Features

- **Node-based structure**: Build regex patterns using `Node`, `Sequence`, `Group`, `Literal`, `Parse`, and `StringLiteral`.
- **Capturable groups**: Use `Group.of(...)` to capture arguments automatically.
- **NodeMatcher**: Simplifies working with `Pattern` and `Matcher`.
- **Extensible**: Easily add new types of nodes for other commands.
- **Clean API**: No messy regex strings, everything is composed with nodes.

---

## ⚡ Example Usage

```java
import iej.node.*;

public class Example {
    public static void main(String[] args) {
        // 1. Create the main sequence node
        Node printNode = Sequence.of(
            Literal.of("printl"),          // Detect the action 'printl'
            Parse.of('('),                 // Escape '('
            Group.of(StringLiteral.of()),  // Capture the content inside quotes
            Parse.of(')'),                 // Escape ')'
            Literal.of(";")                // End of instruction
        );

        // 2. Input string to analyze
        String input = "printl(\"Hello, world\");";

        // 3. Create a matcher using NodeMatcher
        NodeMatcher matcher = NodeMatcher.of(input, printNode);

        // 4. Check for match and extract content
        if (matcher.matches()) {
            String captured = matcher.group(1);  // Captured content inside quotes
            System.out.println("Captured content: " + captured);
        } else {
            System.out.println("Instruction does not match.");
        }
    }
}
```
## Output:
```
Captured content: Hello, world
```
## 🛠 Installation
1. Clone the repository:
```bash
git clone https://github.com/RafacraftDev/IEJ/
```
2. Compile your project:
```bash
javac -d bin src/main/java/iej/node/*.java src/test/java/iej/test/*.java
```
3. Run the example:
```bash
java -cp bin iej.test.Main
```

## 📚 Notes

- `Sequence.of(...)` concatenates multiple nodes into a full regex.
- `Literal.of(...)` matches literal text.
- `Parse.of(char c)` escapes special characters like parentheses, brackets, etc.
- `Group.of(...)` creates a **capturable group**, retrievable via `NodeMatcher.group()`.
- `NodeMatcher` wraps the Java `Pattern` and `Matcher` classes for easier use.

---

## 💡 Future Ideas

- Support multiple arguments in `printl(...)` automatically.
- Add more node types for conditions, loops, and variables.
- Build a small scripting language based on IEJ.

---

## 📄 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Example

```java
package com.iej;

import iej.node.Group;
import iej.node.Literal;
import iej.node.Node;
import iej.node.NodeMatcher;
import iej.node.Parse;
import iej.node.Sequence;
import iej.node.StringLiteral;
import iej.node.Whitespace;

public class Main {
	static Node node = Sequence.of(
	    Literal.of("printl"),
		Whitespace.optional(),
		Parse.of('('),
		Whitespace.optional(),
		Group.of(StringLiteral.of()),
		Whitespace.optional(),
		Parse.of(')'),
		Literal.of(";")
	);
	
	public static void main(String[] args) {
		interpret("printl(\"Hola, mundo!\");");
	}
	static void interpret(String string){
		String[] parts = string.split("(?<=;)");
		
		for (String part : parts) {
			String matches = node.get();
			if (part.matches(matches)) {
				NodeMatcher nodeMatcher = NodeMatcher.of(part, node);
				String group = nodeMatcher.group(1);
				System.out.println(group);
			}
		}
	}
}
```
