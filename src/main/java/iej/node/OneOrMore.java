package iej.node;

public class OneOrMore extends Node {
	
	/**
	* IEJ – Interactive Expression Java
	* Author: RafacraftCoder
	* GitHub: https://github.com/RafacraftDev/IEJ
	*
	* Description: Part of the IEJ interpreter project
	* License: MIT
	*/
	
    private OneOrMore(Node node) {
        super("(?:" + node.get() + ")+"); // plus of
    }

    public static OneOrMore of(Node node) {
        return new OneOrMore(node);
    }
}