package iej.node;

public class OptionalOr extends Node {

	/**
	* IEJ – Interactive Expression Java
	* Author: RafacraftCoder
	* GitHub: https://github.com/RafacraftDev/IEJ
	*
	* Description: Part of the IEJ interpreter project
	* License: MIT
	*/
	
	private OptionalOr(String... options) {
		super(Or.build(options) + "?");
	}
}