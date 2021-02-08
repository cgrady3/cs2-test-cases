// ===========================
// GenericBST: TestCase02.java
// ===========================
// A brief test case that verifies your implementation of the methods in
// GenericBST.java work for GenericBSTs of comparable types Integer, Character,
// Double, and String.
//
// For detailed compilation and testing instructions, see the assignment PDF.
//
// Adapted by layne#0695 from Casin#0994's TestCase02

import java.io.*;

public class TestCase03
{
	public static void main(String [] args) throws Exception
	{
		int numElements = 15;

		// Console messages
		String insertSuccess =
				"Insertion is working! This GenericBST has all the array's elements.";
		String insertFail = "Insertion failed! One or more elements were not successfully inserted "
				+ "into this GenericBST.";
		String traversalSuccess =
				"Traversals are working! All 3 traversals of this BST match what's expected.";
		String traversalFail =
				"Traversals failed! One or more of the traversals didn't work as expected.";
		String deleteSuccess =
				"Deletion is working! This GenericBST no longer has the array's elements.";
		String deleteFail = "Deletion failed! This GenericBST still contains one or more of the "
				+ "array's elements.";

		// -----------------------------------------------------------------------------------------
		
		// GenericBST Type: Integer
		System.out.println("-------------------------------------------");
		System.out.println("GenericBST Type: Integer");
		System.out.println();

		// Create a GenericBST and a normal BST to test it against
		GenericBST<Integer> myIntegerTree = new GenericBST<Integer>();
		IntTree testIntegerTree = new IntTree();

		int containCount = 0;
		int notContainCount = 0;

		int [] arrayInteger = new int[numElements];

		// Generate data and insert it into GenericBST
		for (int i = 0; i < numElements; i++)
		{
			int element = (int) (Math.random() * 100 + 1);
			arrayInteger[i] = element;
			myIntegerTree.insert(element);
			testIntegerTree.insert(element);
		}

		// Checks to see if data is contained in the GenericBST after insertion
		for (int i : arrayInteger)
			if (myIntegerTree.contains(i))
				containCount++;

		System.out.println(containCount == numElements ? insertSuccess : insertFail);

		// Traversal method check
		if (checkIntTraversals(myIntegerTree, testIntegerTree))
			System.out.println(traversalSuccess);
		else
			System.out.println(traversalFail);

		// Delete a GenericBST
		for (int i : arrayInteger)
			myIntegerTree.delete(i);

		// Checks to see if data is contained in the GenericBST after deletion
		for (int i : arrayInteger)
			if (!myIntegerTree.contains(i))
				notContainCount++;

		System.out.println(notContainCount == numElements ? deleteSuccess : deleteFail);
		System.out.println();
		
		// -----------------------------------------------------------------------------------------
		
		// GenericBST Type: Character
		System.out.println("-------------------------------------------");
		System.out.println("GenericBST Type: Character");
		System.out.println();

		// Create a GenericBST and a normal BST to test it against
		GenericBST<Character> myCharacterTree = new GenericBST<Character>();
		IntTree testCharacterTree = new IntTree();

		containCount = 0;
		notContainCount = 0;

		char [] arrayCharacter = new char[numElements];

		// Generate data and insert it into GenericBST
		for (int i = 0; i < numElements; i++)
		{
            // Generate a random "normal" character
			char element = (char) (Math.random() * 95 + '!');
			arrayCharacter[i] = element;
			myCharacterTree.insert(element);
			testCharacterTree.insert(element);
		}

		// Checks to see if data is contained in the GenericBST after insertion
		for (char c : arrayCharacter)
			if (myCharacterTree.contains(c))
				containCount++;

		System.out.println(containCount == numElements ? insertSuccess : insertFail);

		// Traversal method check
		if (checkCharTraversals(myCharacterTree, testCharacterTree))
			System.out.println(traversalSuccess);
		else
			System.out.println(traversalFail);

		// Delete a GenericBST
		for (char c : arrayCharacter)
			myCharacterTree.delete(c);

		// Checks to see if data is contained in the GenericBST after deletion
		for (char c : arrayCharacter)
			if (!myCharacterTree.contains(c))
				notContainCount++;

		System.out.println(notContainCount == numElements ? deleteSuccess : deleteFail);
		System.out.println();
		
		// -----------------------------------------------------------------------------------------
		
		// GenericBST Type: Double
		System.out.println("-------------------------------------------");
		System.out.println("GenericBST Type: Double");
		System.out.println();

		// Create a GenericBST and a normal BST to test it against
		GenericBST<Double> myDoubleTree = new GenericBST<Double>();
		DoubleTree testDoubleTree = new DoubleTree();

		containCount = 0;
		notContainCount = 0;

		double [] arrayDouble = new double[numElements];

		// Generate data and insert it into GenericBST
		for (int i = 0; i < numElements; i++)
		{
			double element = (Math.random() * 100);
			arrayDouble[i] = element;
			myDoubleTree.insert(element);
			testDoubleTree.insert(element);
		}

		// Checks to see if data is contained in the GenericBST after insertion
		for (double d : arrayDouble)
			if (myDoubleTree.contains(d))
				containCount++;

		System.out.println(containCount == numElements ? insertSuccess : insertFail);

		// Traversal method check
		if (checkDoubleTraversals(myDoubleTree, testDoubleTree))
			System.out.println(traversalSuccess);
		else
			System.out.println(traversalFail);

		// Delete a GenericBST
		for (double d : arrayDouble)
			myDoubleTree.delete(d);

		// Checks to see if data is contained in the GenericBST after deletion
		for (double d : arrayDouble)
			if (!myDoubleTree.contains(d))
				notContainCount++;

		System.out.println(notContainCount == numElements ? deleteSuccess : deleteFail);
		System.out.println();
		
		// -----------------------------------------------------------------------------------------

		// GenericBST Type: Character
		System.out.println("-------------------------------------------");
		System.out.println("GenericBST Type: Character");
		System.out.println();

		// Create a GenericBST and a normal BST to test it against
		GenericBST<String> myStringTree = new GenericBST<String>();
		StringTree testStringTree = new StringTree();

		containCount = 0;
		notContainCount = 0;

		String [] arrayString = new String[numElements];

		// Generate data and insert it into GenericBST
		for (int i = 0; i < numElements; i++)
		{
			char [] element = new char[5];
			// Fill char array with 5 randomized alphabetic characters
			for (int j = 0; j < element.length; j++)
				element[j] = (char) ((int) (Math.random() * 26)
						+ (((int) (Math.random() * 2) == 0) ? 'A' : 'a'));

			arrayString[i] = new String(element);
			myStringTree.insert(new String(element));
			testStringTree.insert(new String(element));
		}

		// Checks to see if data is contained in the GenericBST after insertion
		for (String s : arrayString)
			if (myStringTree.contains(s))
				containCount++;

		System.out.println(containCount == numElements ? insertSuccess : insertFail);

		// Traversal method check
		if (checkStringTraversals(myStringTree, testStringTree))
			System.out.println(traversalSuccess);
		else
			System.out.println(traversalFail);

		// Delete a GenericBST
		for (String s : arrayString)
			myStringTree.delete(s);

		// Checks to see if data is contained in the GenericBST after deletion
		for (String s : arrayString)
			if (!myStringTree.contains(s))
				notContainCount++;

		System.out.println(notContainCount == numElements ? deleteSuccess : deleteFail);
	}

	// Performs all 3 traversals of myTree and testTree and compares them
	// Returns true if they match, false if they don't
	static boolean checkIntTraversals(GenericBST<Integer> myTree, IntTree testTree) throws Exception
	{
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;

		System.setOut(ps);

		myTree.inorder();
		myTree.preorder();
		myTree.postorder();

		String myTraversals = baos.toString();

		baos.reset();

		testTree.inorder(false);
		testTree.preorder(false);
		testTree.postorder(false);

		String testTraversals = baos.toString();

		System.out.flush();
		System.setOut(old);

		return myTraversals.compareTo(testTraversals) == 0;
	}

	// Performs all 3 traversals of myTree and testTree and compares them
	// Returns true if they match, false if they don't
	static boolean checkCharTraversals(GenericBST<Character> myTree, IntTree testTree)
	{
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;

		System.setOut(ps);

		myTree.inorder();
		myTree.preorder();
		myTree.postorder();

		String myTraversals = baos.toString();

		baos.reset();

		testTree.inorder(true);
		testTree.preorder(true);
		testTree.postorder(true);

		String testTraversals = baos.toString();

		System.out.flush();
		System.setOut(old);

		return myTraversals.compareTo(testTraversals) == 0;
	}

	// Performs all 3 traversals of myTree and testTree and compares them
	// Returns true if they match, false if they don't
	static boolean checkDoubleTraversals(GenericBST<Double> myTree, DoubleTree testTree)
	{
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;

		System.setOut(ps);

		myTree.inorder();
		myTree.preorder();
		myTree.postorder();

		String myTraversals = baos.toString();

		baos.reset();

		testTree.inorder();
		testTree.preorder();
		testTree.postorder();

		String testTraversals = baos.toString();

		System.out.flush();
		System.setOut(old);

		return myTraversals.compareTo(testTraversals) == 0;
	}

	// Performs all 3 traversals of myTree and testTree and compares them
	// Returns true if they match, false if they don't
	static boolean checkStringTraversals(GenericBST<String> myTree, StringTree testTree)
	{
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;

		System.setOut(ps);

		myTree.inorder();
		myTree.preorder();
		myTree.postorder();

		String myTraversals = baos.toString();

		baos.reset();

		testTree.inorder();
		testTree.preorder();
		testTree.postorder();

		String testTraversals = baos.toString();

		System.out.flush();
		System.setOut(old);

		return myTraversals.compareTo(testTraversals) == 0;
	}
}

// Node class used in IntTree
class IntNode
{
	int data;
	IntNode left, right;

	IntNode(int data)
	{
		this.data = data;
	}
}

// IntTree is used to insert integers into BSTs and perform traversals of those BSTs
class IntTree
{
	private IntNode root;

	public void insert(int data)
	{
		root = insert(root, data);
	}

	private IntNode insert(IntNode root, int data)
	{
		if (root == null)
			return new IntNode(data);
		else if (data < root.data)
			root.left = insert(root.left, data);
		else if (data > root.data)
			root.right = insert(root.right, data);

		return root;
	}

	public void inorder(boolean isChar)
	{
		System.out.print("In-order Traversal:");
		inorder(root, isChar);
		System.out.println();
	}

	private void inorder(IntNode root, boolean isChar)
	{
		if (root == null)
			return;

		inorder(root.left, isChar);
		if (isChar)
			System.out.print(" " + (char) root.data);
		else
			System.out.print(" " + root.data);
		inorder(root.right, isChar);
	}

	public void preorder(boolean isChar)
	{
		System.out.print("Pre-order Traversal:");
		preorder(root, isChar);
		System.out.println();
	}

	private void preorder(IntNode root, boolean isChar)
	{
		if (root == null)
			return;

		if (isChar)
			System.out.print(" " + (char) root.data);
		else
			System.out.print(" " + root.data);
		preorder(root.left, isChar);
		preorder(root.right, isChar);
	}

	public void postorder(boolean isChar)
	{
		System.out.print("Post-order Traversal:");
		postorder(root, isChar);
		System.out.println();
	}

	private void postorder(IntNode root, boolean isChar)
	{
		if (root == null)
			return;

		postorder(root.left, isChar);
		postorder(root.right, isChar);
		if (isChar)
			System.out.print(" " + (char) root.data);
		else
			System.out.print(" " + root.data);
	}
}

// Node class used in DoubleTree
class DoubleNode
{
	double data;
	DoubleNode left, right;

	DoubleNode(double data)
	{
		this.data = data;
	}
}

// DoubleTree is used to insert doubles into BSTs and perform traversals of those BSTs
class DoubleTree
{
	private DoubleNode root;

	public void insert(double data)
	{
		root = insert(root, data);
	}

	private DoubleNode insert(DoubleNode root, double data)
	{
		if (root == null)
			return new DoubleNode(data);
		else if (data < root.data)
			root.left = insert(root.left, data);
		else if (data > root.data)
			root.right = insert(root.right, data);

		return root;
	}

	public void inorder()
	{
		System.out.print("In-order Traversal:");
		inorder(root);
		System.out.println();
	}

	private void inorder(DoubleNode root)
	{
		if (root == null)
			return;

		inorder(root.left);
		System.out.print(" " + root.data);
		inorder(root.right);
	}

	public void preorder()
	{
		System.out.print("Pre-order Traversal:");
		preorder(root);
		System.out.println();
	}

	private void preorder(DoubleNode root)
	{
		if (root == null)
			return;

		System.out.print(" " + root.data);
		preorder(root.left);
		preorder(root.right);
	}

	public void postorder()
	{
		System.out.print("Post-order Traversal:");
		postorder(root);
		System.out.println();
	}

	private void postorder(DoubleNode root)
	{
		if (root == null)
			return;

		postorder(root.left);
		postorder(root.right);
		System.out.print(" " + root.data);
	}
}

// Node class used in StringTree
class StringNode
{
	String data;
	StringNode left, right;

	StringNode(String data)
	{
		this.data = data;
	}
}

// StringTree is used to insert Strings into BSTs and perform traversals of those BSTs
class StringTree
{
	private StringNode root;

	public void insert(String data)
	{
		root = insert(root, data);
	}

	private StringNode insert(StringNode root, String data)
	{
		if (root == null)
			return new StringNode(data);

		for (int i = 0; i < root.data.length() && i < data.length(); i++)
		{
			int a = data.charAt(i), b = root.data.charAt(i);

			if (a < b)
			{
				root.left = insert(root.left, data);
				break;
			}
			else if (a > b)
			{
				root.right = insert(root.right, data);
				break;
			}
		}

		return root;
	}

	public void inorder()
	{
		System.out.print("In-order Traversal:");
		inorder(root);
		System.out.println();
	}

	private void inorder(StringNode root)
	{
		if (root == null)
			return;

		inorder(root.left);
		System.out.print(" " + root.data);
		inorder(root.right);
	}

	public void preorder()
	{
		System.out.print("Pre-order Traversal:");
		preorder(root);
		System.out.println();
	}

	private void preorder(StringNode root)
	{
		if (root == null)
			return;

		System.out.print(" " + root.data);
		preorder(root.left);
		preorder(root.right);
	}

	public void postorder()
	{
		System.out.print("Post-order Traversal:");
		postorder(root);
		System.out.println();
	}

	private void postorder(StringNode root)
	{
		if (root == null)
			return;

		postorder(root.left);
		postorder(root.right);
		System.out.print(" " + root.data);
	}
}
