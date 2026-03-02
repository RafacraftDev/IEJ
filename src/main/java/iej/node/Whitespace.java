package iej.node;

public class Whitespace extends Node {
	
	/**
	* IEJ – Interactive Expression Java
	* Author: RafacraftCoder
	* GitHub: https://github.com/RafacraftDev/IEJ
	*
	* Description: Part of the IEJ interpreter project
	* License: MIT
	*/
	
	private Whitespace(String regex) {
		super(regex);
	}

	public static Whitespace required() {
		return new Whitespace("\\s+"); // space or plus
	}

	public static Whitespace optional() {
		return new Whitespace("\\s*"); // spaces or null
	}

	public static Whitespace single() {
		return new Whitespace("\\s"); // one space
	}

	public static Whitespace inlineRequired() {
		return new Whitespace("[ \\t]+"); // inLineRequired
	}
}