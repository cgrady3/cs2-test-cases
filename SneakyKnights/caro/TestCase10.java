// Sean Szumlanski
// COP 3503, Spring 2021

// =============================
// SneakyKnights: TestCase10.java
// =============================
// A larger test case. This one has some Knights that can attack one another.
// This is a copy of the TestCase04.java file that was released with the
// assignment.


import java.io.*;
import java.util.*;

public class TestCase10
{
	private static void checkTest(boolean success)
	{
		System.out.println(success ? "Hooray!" : "fail whale :(");
	}

	public static void main(String [] args) throws Exception
	{
		Scanner in = new Scanner(new File("input_files/TestCase10-input.txt"));
		ArrayList<String> list = new ArrayList<String>();

		// Read each line from the input file into the ArrayList.
		while (in.hasNext())
			list.add(in.next());

		checkTest(SneakyKnights.allTheKnightsAreSafe(list, 20000) == true);
	}
}
