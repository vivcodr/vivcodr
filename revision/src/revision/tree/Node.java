package revision.tree;

public class Node {
	
	private String value;
	Node leftNode;
	Node rightNode;
	
	public Node(String value) {
		this.setValue(value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
