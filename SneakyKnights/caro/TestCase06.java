// Sean Szumlanski
// COP 3503, Spring 2021

// =============================
// SneakyKnights: TestCase06.java
// =============================
// Several small test cases. This is a copy of the TestCase02.java file that was
// released with the assignment.


import java.io.*;
import java.util.*;

public class TestCase06
{
	private static void checkTest(boolean success)
	{
		System.out.println(success ? "Hooray!" : "fail whale :(");
	}

	public static void main(String [] args)
	{
		ArrayList<String> list = new ArrayList<String>();

		list.clear();
		list.add("a1");
		list.add("b2");
		checkTest(SneakyKnights.allTheKnightsAreSafe(list, 60000) == true);

		list.clear();
		list.add("a2");
		list.add("b1");
		checkTest(SneakyKnights.allTheKnightsAreSafe(list, 60000) == true);

		list.clear();
		list.add("xx342");
		list.add("xy343");
		checkTest(SneakyKnights.allTheKnightsAreSafe(list, 60000) == true);

		list.clear();
		list.add("xx342");
		list.add("xy341");
		checkTest(SneakyKnights.allTheKnightsAreSafe(list, 60000) == true);

		list.clear();
		list.add("xx342");
		list.add("xw341");
		checkTest(SneakyKnights.allTheKnightsAreSafe(list, 60000) == true);

		list.clear();
		list.add("xx342");
		list.add("xw343");
		checkTest(SneakyKnights.allTheKnightsAreSafe(list, 60000) == true);

		list.clear();
		list.add("a3");
		list.add("b1");
		list.add("c4");
		list.add("d2");
		checkTest(SneakyKnights.allTheKnightsAreSafe(list, 4) == false);

		list.clear();
		list.add("a2");
		list.add("b4");
		list.add("c1");
		list.add("d3");
		checkTest(SneakyKnights.allTheKnightsAreSafe(list, 4) == false);
	}
}
