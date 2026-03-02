package iej.node;

public class Or extends Node {
	
	/**
	* IEJ – Interactive Expression Java
	* Author: RafacraftCoder
	* GitHub: https://github.com/RafacraftDev/IEJ
	*
	* Description: Part of the IEJ interpreter project
	* License: MIT
	*/
	
    private Or(String regex) {
        super(regex);
    }

    public static Or of(String... options) {
        return new Or(build(options));
    }

    static String build(String[] options) {
        StringBuilder sb = new StringBuilder("(?:");

        for (int i = 0; i < options.length; i++) {
            sb.append(options[i]); // append option in i
            if (i < options.length - 1) {
                sb.append("|"); // append |
            }
        }

        sb.append(")");
        return sb.toString();
    }
}