package iej.node;

public class AnyChar extends Node {
	
	/**
	* IEJ – Interactive Expression Java
	* Author: RafacraftCoder
	* GitHub: https://github.com/RafacraftDev/IEJ
	*
	* Description: Part of the IEJ interpreter project
	* License: MIT
	*/
	
    private AnyChar(char a) {
        super("." + String.valueOf(a)); // .*, .+, .
    }

    public static AnyChar of(char charc) {
        return new AnyChar(charc); // create .
    }
}