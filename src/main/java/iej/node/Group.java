package iej.node;

public class Group extends Node{
	
	/**
	* IEJ – Interactive Expression Java
	* Author: RafacraftCoder
	* GitHub: https://github.com/RafacraftDev/IEJ
	*
	* Description: Part of the IEJ interpreter project
	* License: MIT
	*/
	
	private Group(Node node) {
		super("(" + node.get() + ")"); // make a group
	}
	public static Group of(Node node) {
		return new Group(node);
	}
}