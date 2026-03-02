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
	
	@Override
	public String toString() {
		return get(); // return regex
	}
}