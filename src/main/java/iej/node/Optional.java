package iej.node;

public class Optional extends Node {
	
	/**
	* IEJ – Interactive Expression Java
	* Author: RafacraftCoder
	* GitHub: https://github.com/RafacraftDev/IEJ
	*
	* Description: Part of the IEJ interpreter project
	* License: MIT
	*/
	
	private Optional(String c) {
		super("(?:" + c + ")?");
	}
	
	public static Optional of(String r) {
		return new Optional(r);
	}
}