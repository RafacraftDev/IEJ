package iej.node;

// public base of Node
public abstract class Node {
	
	/**
	* IEJ – Interactive Expression Java
	* Author: RafacraftCoder
	* GitHub: https://github.com/RafacraftDev/IEJ
	*
	* Description: Part of the IEJ interpreter project
	* License: MIT
	*/
	
    String regex = ""; // regex initial value
	
	protected Node(String regex) {
		this.regex = regex; // set Regex
	}
	public String get() {
		return regex; // return regex
	}

	public Node or(Node e2) {
		return Or.of(this, e2);
	}

	public Node zeroOrMore() {
		return ZeroOrMore.of(this);
	}

	public Node oneOrMore() {
		return OneOrMore.of(this);
	}

	public Node optional() {
		return Optional.of(this);
	}

	public Node optionalOr(Node e2) {
		return OptionalOr.of(this, e2);
	}
	
	@Override
	public String toString() {
		return get(); // return regex
	}
}
