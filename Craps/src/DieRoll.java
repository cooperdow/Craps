import java.util.Scanner;
public class DieRoll 
	{
public void greetPlayer()
{
Scanner userInput = new Scanner(System.in);
System.out.println("What is your name?");
String name = userInput.nextLine();
System.out.println("Hello," + name + "! Hope you enjoy the game.");										
}
	public static void main(String[] args)
		{
		Scanner userInput=new Scanner(System.in);
		int dieRoll1=(int)(Math.random()*6)+1;
		int dieRoll2=(int)(Math.random()*6)+1;
		int dieTotal=dieRoll1+dieRoll2;
		boolean stillRolling=true;
		System.out.println("You rolled a " + dieRoll1 + " and a " + dieRoll2 + " for a total of " + dieTotal);
		
		if(dieTotal==2 || dieTotal==12)	
			{
			System.out.println("You lose");
			}
		
		else if(dieTotal==7 || dieTotal==11)
			{
			System.out.println("You win");
			}
		else
			{
			System.out.println("Your point is " + dieTotal);
		
		while (stillRolling)
		{
			Scanner userInput2=new Scanner(System.in);
			int dieRoll3=(int)(Math.random()*6)+1;
			int dieRoll4=(int)(Math.random()*6)+1;
			int dieTotal2=dieRoll3+dieRoll4;
			System.out.println("Type (1) to roll again");			
			int choice=userInput2.nextInt();
				if(dieTotal2 == dieTotal)
					{
					stillRolling = false;
					System.out.println("You rolled a " + dieRoll3 + " and a " + dieRoll4 + " for a total of " +dieTotal2);
					System.out.println("You win");
					}
				else if(dieTotal2 == 7)
					{
					stillRolling = false;
					System.out.println("You rolled a " + dieRoll3 + " and a " + dieRoll4 + " for a total of " +dieTotal2);
					System.out.println("You lose");
					}
				else
					{
					System.out.println("You rolled a " + dieRoll3 + " and a " + dieRoll4 + " for a total of " +dieTotal2);
					}
					
				}
			}
		}
	}
		
		
		
