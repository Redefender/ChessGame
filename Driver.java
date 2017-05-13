import java.util.Scanner;
/***
*Author: Ezra, 5/13/17
**/

public class Driver {
	public static void main(String[]	args)	{
     //game vars
     boolean playAgain=true,player1Turn=true,
     player2Turn=false, isGameOver=false;
     Scanner stdin = new Scanner(System.in);

     do //overall game loop
	  {
       if(playAgain) //new round
       {
         //get playerinfo
         System.out.print("Enter White player's name: ");
         String name = stdin.nextLine();
         Player player1 = new Player(name,"White");

         System.out.print("Enter Black player's name: ");
         name = stdin.nextLine();
         Player player2 = new Player(name,"Black");

         Board bo= new Board();
         playAgain=false;
       }

       while(player1Turn)
       {
         //get starting position
         player1.setPos();

         //check what piece is
         player1.checkPieceType(bo.get);
         //set position moved to
         //move on board
         //display
         //set turn for player2
         player1Turn=false;
         player2Turn=true;
       }//end player1
       while(player2Turn)
       {
         //set turn for player1
         player1Turn=true;
         player2Turn=false;
       }//end player2
       if(isGameOver)
       {
         String userInput="";
         System.out.print("Would you like to play again(Y/N)?");
         userInput = stdin.nextLine().toUpperCase();
         if("Y".equals(userInput))
         {
            playAgain=true;
         }
       }

	  } while(playAgain);


	}
}
