package iej.node;

public class NodeValuer {
	String value = "";
	
	NodeValuer(String nv) {
		value = nv;
	}
	
	public static NodeValuer getValues(Node... ns) {
		String nv = "";
		
		for (Node n : ns) {
			nv += n.get();
		}
		
		return new NodeValuer(nv);
	}
}