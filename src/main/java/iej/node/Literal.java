package iej.node;

public class Literal extends Node {
	
	/**
	* IEJ – Interactive Expression Java
	* Author: RafacraftCoder
	* GitHub: https://github.com/RafacraftDev/IEJ
	*
	* Description: Part of the IEJ interpreter project
	* License: MIT
	*/
	
    private Literal(String text) {
        super(text); // add text
    }

    public static Literal of(String text) {
        return new Literal(text);
    }
}