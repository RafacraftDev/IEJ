package iej.node;

public class StringLiteral extends Node {
	
	/**
	* IEJ – Interactive Expression Java
	* Author: RafacraftCoder
	* GitHub: https://github.com/RafacraftDev/IEJ
	*
	* Description: Part of the IEJ interpreter project
	* License: MIT
	*/
	
    private StringLiteral() {
        super("\".*\"");
    }

    public static StringLiteral of() {
        return new StringLiteral();
    }
}