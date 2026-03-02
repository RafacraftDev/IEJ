package iej.node;

public abstract class Node {
	
    String regex = "";
	
	protected Node(String regex) {
		this.regex = regex;
	}
	public String get() {
		return regex;
	}
}