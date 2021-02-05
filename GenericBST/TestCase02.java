
// ===========================
// GenericBST: TestCase02.java
// ===========================
// A brief test case that verifies your implementation of the methods in 
// GenericBST.java work for GenericBSTs of Comparable types Integer and Character.
//
// For detailed compilation and testing instructions, see the assignment PDF.
//


import java.io.*;
import java.util.*;

public class TestCase02
{
	public static void main(String [] args)
	{
		// Adjust which classes of type comparable you would like to test here!
		boolean flagInteger = true;
		boolean flagCharacter = true;

		//----------------------------------------------------------------------------------------------------
		if (flagInteger)
		{
			// GenericBST Type: Integer
			System.out.println();
			System.out.println("-------------------------------------------");
			System.out.println("GenericBST Type: Integer");
			System.out.println();

			// Create a GenericBST
			GenericBST<Integer> myIntegerTree = new GenericBST<Integer>();
			int containCount = 0;
			int notContainCount = 0;

			// Insert data into GenericBST
			int [] arrayInteger = {90, 54, 74, 52, 99, 6, 3, 43, 55, 67};
			for (int i = 0; i < arrayInteger.length; i++)
				myIntegerTree.insert(arrayInteger[i]);

			// Checks to see if data is contained in the GenericBST after insertion
			for (int i = 0; i < arrayInteger.length; i++)
			{
				if (myIntegerTree.contains(arrayInteger[i]))
					containCount++;
			}
			if (containCount == arrayInteger.length)
				System.out.println("Insertion is working! This GenericBST has all the array's elements.");

			// Traversal function check
			myIntegerTree.inorder();
			myIntegerTree.preorder();
			myIntegerTree.postorder();	

			// Delete a GenericBST
			for (int i = 0; i < arrayInteger.length; i++)
				myIntegerTree.delete(arrayInteger[i]);

			// Checks to see if data is contained in the GenericBST after deletion
			for (int i = 0; i < arrayInteger.length; i++)
			{
				if (!myIntegerTree.contains(arrayInteger[i]))
					notContainCount++;
			}
			if (notContainCount == arrayInteger.length)
				System.out.println("Deletion is working! This GenericBST no longer has the array's elements.");
			System.out.println();
		}
		//----------------------------------------------------------------------------------------------------
		if (flagCharacter)
		{
			// GenericBST Type: Character
			System.out.println();
			System.out.println("-------------------------------------------");
			System.out.println("GenericBST Type: Character");
			System.out.println();

			// Create a GenericBST
			GenericBST<Character> myCharacterTree = new GenericBST<Character>();
			int containCount = 0;
			int notContainCount = 0;

			// Insert data into GenericBST
			Character [] arrayCharacter = {'a', 'z', 'f', 'v', 'd'};
			for (int i = 0; i < arrayCharacter.length; i++)
				myCharacterTree.insert(arrayCharacter[i]);

			// Checks to see if data is contained in the GenericBST after insertion
			for (int i = 0; i < arrayCharacter.length; i++)
			{
				if (myCharacterTree.contains(arrayCharacter[i]))
					containCount++;
			}
			if (containCount == arrayCharacter.length)
				System.out.println("Insertion is working! This GenericBST has all the array's elements.");

			// Traversal function check
			myCharacterTree.inorder();
			myCharacterTree.preorder();
			myCharacterTree.postorder();	

			// Delete a GenericBST
			for (int i = 0; i < arrayCharacter.length; i++)
				myCharacterTree.delete(arrayCharacter[i]);

			// Checks to see if data is contained in the GenericBST after deletion
			for (int i = 0; i < arrayCharacter.length; i++)
			{
				if (!myCharacterTree.contains(arrayCharacter[i]))
					notContainCount++;
			}
			if (notContainCount == arrayCharacter.length)
				System.out.println("Deletion is working! This GenericBST no longer has the array's elements.");
			System.out.println();
		}
	}
}
