/*
1. (Printing a Sentence in Reverse Using a Stack)
Write a program that inputs a line of text and uses a
stack to display the words of the line in reverse order.
*/
import java.util.*;

public class StackStringReverseOrder
{
	public static void main(String[] args)
	{
		String inputStr = "Print in Reverse    Using    a Stack";

		// Split string up into words. Hint: split, array
		String[] words = inputStr.split (" ");

		// Put the words onto a stack. Hint: push
		Stack<String> wordsStack = new Stack<String>();
		// loop through all words in the array and push them onto stack
		// No blank words on stack. HINT: trim(), length()
		for (int k = 0; k < words.length; k++)
		{
			if (words[k].trim().length() > 0)
			    wordsStack.push (words[k] );
		}

		// Read them them back off the stack and display them
		// Hint: pop, iterator
		//while (wordsStack.empty() == false)
		//{
		//	System.out.println (wordsStack.pop() );
		//}

		// Display words using Iterator
		/*
		Iterator stackIterator = wordsStack.iterator();
		while (stackIterator.hasNext() == true)
		{
			System.out.println (wordsStack.pop() );
		}
		*/

		// Display but keep stack intact
		Iterator stackIterator = wordsStack.iterator();
		while (stackIterator.hasNext() == true)
		{
			//System.out.println (wordsStack.peek() );
			System.out.println (stackIterator.next() );
		}

	}
}