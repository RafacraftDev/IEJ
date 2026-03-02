package iej.node;

public class Anchor extends Node {
	
	/**
	* IEJ – Interactive Expression Java
	* Author: RafacraftCoder
	* GitHub: https://github.com/RafacraftDev/IEJ
	*
	* Description: Part of the IEJ interpreter project
	* License: MIT
	*/

	private Anchor(String prefix, Node node, String suffix) {
		super(prefix + node.get() + suffix); // define 'prefix' + content + 'suffix'
	}

	public static Anchor start(Node node) {
		return new Anchor("^", node, ""); // set '^' in the start
	}

	public static Anchor end(Node node) {
		return new Anchor("", node, "$"); // set '$' in the end
	}

	public static Anchor full(Node node) {
		return new Anchor("^", node, "$"); // set '^' && '$' in his location
	}
}