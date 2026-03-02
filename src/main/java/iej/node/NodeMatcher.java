package iej.node;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NodeMatcher {
	
	private String input = "";
	private final Pattern pattern;

	private NodeMatcher(String i, Node node) {
		this.pattern = Pattern.compile(node.get());
		input = i;
	}

	public static NodeMatcher of(String input, Node node) {
		return new NodeMatcher(input, node);
	}

	public Matcher matcher(String input) {
		return pattern.matcher(input);
	}

	public boolean matches() {
		return pattern.matcher(input).matches();
	}

	public boolean find() {
		return pattern.matcher(input).find();
	}

	public String getPattern() {
		return pattern.pattern();
	}

	public String group(int i) {
		Matcher m = matcher(input);
		if (m.matches()) { // o .find() según tu necesidad
			return m.group(i);
		}
		return null; // o lanzar excepción personalizada
	}

	public String group() {
		return group(0); // grupo completo
	}
}