package iej.node;

public class ZeroOrMore extends Node {
	
	/**
	* IEJ – Interactive Expression Java
	* Author: RafacraftCoder
	* GitHub: https://github.com/RafacraftDev/IEJ
	*
	* Description: Part of the IEJ interpreter project
	* License: MIT
	*/
	
    private ZeroOrMore(Node node) {
        super("(?:" + node.get() + ")*");
    }

    public static ZeroOrMore of(Node node) {
        return new ZeroOrMore(node);
    }
}