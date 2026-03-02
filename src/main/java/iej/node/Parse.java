package iej.node;

public class Parse extends Node {
	
	/**
	* IEJ – Interactive Expression Java
	* Author: RafacraftCoder
	* GitHub: https://github.com/RafacraftDev/IEJ
	*
	* Description: Part of the IEJ interpreter project
	* License: MIT
	*/
	
	private Parse(char charc) {
		super("\\" + String.valueOf(charc)); // parse char with \\
	}
	public static Parse of(char charc) {
		return new Parse(charc);
	}
}