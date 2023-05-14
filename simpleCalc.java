package SimpleCalculator;
import java.util.*; //so you can use Scanner

public class simpleCalc 
{
	public static void continuePrompt()
	{
		System.out.println("Would you like to continue?");
		System.out.println("1. Yes");
		System.out.println("2. No");
	}

	public static void add(int value1, int value2)
	{
		int x = value1;
		int y = value2;
		int total = x+y;
		System.out.println("-------------------");
		System.out.println("Addition Answer: " + total);
	}

	public static void sub(int value1, int value2)
	{
		int x = value1;
		int y = value2;
		int total = x-y;
		System.out.println("-------------------");
		System.out.println("Subtraction Answer: " + total);
	}

	public static void divide(int value1, int value2)
	{
		int x = value1;
		int y = value2;
		int total = x/y;
		System.out.println("-------------------");
		System.out.println("Division Answer: " + total);
	}

	public static void mult(int value1, int value2)
	{
		int x = value1;
		int y = value2;
		int total = x*y;
		System.out.println("-------------------");
		System.out.println("Multiplication Answer: " + total);
	}


	public static void main(String[] args)
	{
		System.out.println("===========================================");
		System.out.println("Hello and welcome to my Simple Calculator!");
		System.out.println("===========================================");
	
		
		Scanner in = new Scanner(System.in);

		//Define two values
		int val1 = 0;
		int val2 = 0;
		int choice = 0;
		boolean endSession = false;

		while (!endSession)
		{
			System.out.println();
			System.out.println();
			//menu to ask whether to add, subtract, divide, or multiply
			System.out.println("=============================");
			System.out.println("What would you like to do?");
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Divide");
			System.out.println("4. Multiply");
			System.out.println();
			System.out.println("0. Exit Session");
			System.out.println("=============================");
			System.out.print("Please enter your choice: "); 
			choice = in.nextInt();

			while (choice > 4 || choice < 0)
			{
				System.out.println("Please enter a valid number!");
				System.out.print("Please enter your choice: ");
				choice = in.nextInt();
			}

			if ((choice > 0) && (choice <= 4))
			{
				System.out.println();
				System.out.println();
				System.out.println("Please input two values!");
				//implement "cin" method for both values
				System.out.print("Value #1: ");
				val1 = in.nextInt();

				System.out.print("Value #2: ");
				val2 = in.nextInt();
			}

			switch(choice)
			{
				case 1: //addition
				{
					add(val1, val2);
					System.out.println();
					break;
				}
				case 2: //subtraction
				{
					sub(val1, val2);
					System.out.println();
					break;
				}
				case 3: //division
				{
					divide(val1, val2);
					System.out.println();
					break;
				}
				case 4: //multiplication
				{
					mult(val1, val2);
					System.out.println();
					break;
				}
				case 0:
				{
					endSession = true;
					break;
				}
			}
			if (endSession == true)
			{
				continuePrompt();
				choice = in.nextInt();
				if (choice == 1)
				{
					endSession = false;
				}
				else if (choice == 2)
				{
					endSession = true;
				}
			}
			
		}
		System.out.println("Session has ended.");
		in.close();
	}
}