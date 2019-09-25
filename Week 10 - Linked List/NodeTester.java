public class NodeTester
{
	public static void main(String[] args)
	{
		Node n1 = new Node ("Frankie");
		Node n2 = new Node ("Bella");
		Node n3 = new Node ("Teenie");
		Node n4 = new Node ("Samuel");
		Node n5 = new Node ("Hankel");

		// n1 -> n2 -> n3 -> n4 -> null
		n1.setNextNode (n2);
		n2.setNextNode (n3);
		n3.setNextNode (n4);

		Node currNode = n1;
		while (currNode != null)
		{
			System.out.println (currNode.getName() );
			currNode = currNode.getNextNode();
		}

		// Remove n2
		n1.setNextNode (n3);
		n2.setNextNode (null);

		System.out.println ("");

		currNode = n1;
		while (currNode != null)
		{
			System.out.println (currNode.getName() );
			currNode = currNode.getNextNode();
		}

		// Got:  n1 -> n3 -> n4 -> null
		// Want: n1 -> n3 -> n5 -> n4 -> null
		Node nextNode = n3.getNextNode();
		n3.setNextNode (n5);
		n5.setNextNode (nextNode);

		System.out.println ("");
		currNode = n1;
		while (currNode != null)
		{
			System.out.println (currNode.getName() );
			currNode = currNode.getNextNode();
		}

	}
}