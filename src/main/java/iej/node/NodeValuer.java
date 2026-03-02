package iej.node;

public class NodeValuer {
	String value = "";
	
	/**
	* IEJ – Interactive Expression Java
	* Author: RafacraftCoder
	* GitHub: https://github.com/RafacraftDev/IEJ
	*
	* Description: Part of the IEJ interpreter project
	* License: MIT
	*/
	
	NodeValuer(String nv) {
		value = nv;
	}
	
	public static NodeValuer getValues(Node... ns) {
		String nv = "";
		
		for (Node n : ns) {
			nv += n.get(); // get value in n
		}
		
		return new NodeValuer(nv);
	}
}