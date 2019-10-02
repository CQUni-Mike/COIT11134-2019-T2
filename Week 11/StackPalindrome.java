/*
2. (Palindrome Tester) Write a program that uses a stack
to determine whether a string is a palindrome (i.e., the
string is spelled identically backward and forward).
The program should ignore space and punctuation.
*/
/*
radar
racecar
:::
Won’t lovers revolt now
Doc, Note: I Dissent. A Fast Never Prevents A Fatness. I Diet On Cod.
Never Odd Or Even
Do Geese See God?
Was It A Rat I Saw?
Dammit, I’m Mad!!
A Santa Lived As a Devil At NASA
Mr. Owl Ate My Metal Worm
Madam In Eden, I’m Adam
A Man, A Plan, A Canal-Panama!
*/
import java.util.*;

public class StackPalindrome
{

	public static boolean isPalindrome (String inputStr)
	{
		String filteredInputString = "";

		for (int k = 0; k < inputStr.length(); k++)
		{
			if (Character.isLetter(inputStr.charAt (k)) == true)
			   filteredInputString += inputStr.charAt (k);
		}


		Stack<Character> charStack = new Stack<Character> ();
		// Loop through all charters in the string
		// add them to the stack.  HINT: charAt ()

		filteredInputString = filteredInputString.toUpperCase();
		for (int k = 0; k < filteredInputString.length(); k++)
		{
			charStack.push (filteredInputString.charAt (k) );
		}

		// Get data from the Stack and compare to original data
		// Stack is backwards, original is forwards
		// Display true or false
		boolean isPalindrome = true;
		for (int k = 0; k < filteredInputString.length() / 2; k++)
		{
			//System.out.println (filteredInputString.charAt (k) + " vs " +
			//    charStack.peek() + " - is letter: " +
			//    Character.isLetter(filteredInputString.charAt (k)) );

			if (filteredInputString.charAt (k) != charStack.pop() )
			   isPalindrome = false;
		}

		return isPalindrome;
	}

	// Use Queue and Stack
	public static boolean isPalindromeQS (String inputStr)
	{
		inputStr = inputStr.toUpperCase();

		Queue<Character> queue = new LinkedList<>();

		for (int k = 0; k < inputStr.length(); k++)
		{
			if (Character.isLetter(inputStr.charAt (k)) == true)
			   queue.add (inputStr.charAt (k) );
		}


		Stack<Character> charStack = new Stack<Character> ();
		// Loop through all charters in the string
		// add them to the stack.  HINT: charAt ()


		for (int k = 0; k < queue.size(); k++)
		{
			charStack.push (queue.peek () );
		}

		// Get data from the Stack and compare to original data
		// Stack is backwards, original is forwards
		// Display true or false
		boolean isPalindrome = true;
		for (int k = 0; k < queue.size() / 2; k++)
		{
			//System.out.println (queue.peek () + " vs " +
			//    charStack.peek() + " - is letter: " +
			//    Character.isLetter(queue.peek ()) );

			if (queue.peek () != charStack.pop() )
			   isPalindrome = false;
		}

		return isPalindrome;
	}

	public static void main(String[] args)
	{
		String inputStr = "Radar";
		//inputStr = "Won’t lovers revolt now";
		inputStr = "A Man, A Plan, A Canal-Panama!";


		System.out.println (inputStr + " plaindrome: " +
		    isPalindrome (inputStr) );

		System.out.println (inputStr + " plaindrome: " +
		    isPalindromeQS (inputStr) );

		// ZOOM: 441 749 364





		inputStr = "Java Rules!";
	}
}
