package iej.node;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NodeMatcher {
	
	/**
	* IEJ – Interactive Expression Java
	* Author: RafacraftCoder
	* GitHub: https://github.com/RafacraftDev/IEJ
	*
	* Description: Part of the IEJ interpreter project
	* License: MIT
	*/
	
	// search patron
	private String input = "";
	// initializes NodeMatcher
	private final Pattern pattern;

	private NodeMatcher(String i, Node node) {
		this.pattern = Pattern.compile(node.get()); // compile the node's sequence or anchor
		input = i; // set patron to i
	}

	public static NodeMatcher of(String input, Node node) {
		return new NodeMatcher(input, node);
	}

	public Matcher matcher(String input) {
		return pattern.matcher(input); // return new Matcher
	}

	public boolean matches() {
		return pattern.matcher(input).matches(); // if Pattrrn matches
	}

	public boolean find() {
		return pattern.matcher(input).find(); // find
	}

	public String getPattern() {
		return pattern.pattern();
	}

	public String group(int i) {
		Matcher m = matcher(input);
		if (m.matches()) {
			return m.group(i); // get group
		}
		return null;
	}

	public String group() {
		return group(0); // group complete
	}
}