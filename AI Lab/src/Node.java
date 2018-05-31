import java.util.ArrayList;

public class Node {

	String name;
	ArrayList<Node> children;
	
	public Node(String name, ArrayList<Node> children)	{
		this.name = name;
		this.children = children;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Node> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<Node> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "hi";
	}
	
	
}
