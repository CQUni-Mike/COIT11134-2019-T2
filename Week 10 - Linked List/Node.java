public class Node
{
	private String name;
	private Node   nextNode;  // Self Referential Class
	                          // Singaly Linked List
	private Node   priorNode; // Doubly Linked List

	public Node ()
	{
		name     = "";
		nextNode = null;
	}

	public Node (String name)
	{
		this.name = name;
		nextNode  = null;
	}

	public Node getNextNode ()
	{
		return nextNode;
	}

	public String getName ()
	{
		return name;
	}

	public void setNextNode (Node nextNode)
	{
		this.nextNode = nextNode;
	}

	public void setName (String name)
	{
		this.name = name;
	}


}