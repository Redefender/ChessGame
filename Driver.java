import java.util.Scanner;
public class Driver {
	public static void main(String[]	args)	{
     //game vars
     boolean playAgain=true,player1Turn=true,
     player2Turn=false, isGameOver=false;
     Scanner stdin = new Scanner(System.in);
     Player player1=null;
     Player player2=null;
     Board bo=null;
     //bo = new Board();
     //bo.drawMove("a1","a4","R");
     Piece white=null;
     Piece black=null;
    //   player1 = new Player();
//      player1.setPosChosen("a8");
//      System.out.println(player1.convertRowToIndice());
//      System.out.println(player1.convertColToIndice());
//       bo = new Board();
//       player1.checkPieceType(bo.getBoard());
//       System.out.println(player1.getPieceType());
//      white = new Piece();
//       white.getMove();
         //bo.drawMove();
//       bo.displayBoard();

     do //overall game loop
	  {
       if(playAgain) //new round
       {
         //get playerinfo
         System.out.print("Enter White player's name: ");
         String name = stdin.nextLine();
         player1 = new Player(name,"White");
         white = new Piece("White");
         System.out.print("Enter Black player's name: ");
         name = stdin.nextLine();
         player2 = new Player(name,"Black");
         black = new Piece("Black");
         bo= new Board();

         playAgain=false;

       }



       while(player1Turn)
       {
         //get starting position

         player1.setPos();


         player1.checkPieceType(bo.getBoard()); //gets put into
         //System.out.print(player1.getPieceType());//player field
         //set position moved to (through piece object white)
         white.getMove();
         //move on board
         bo.drawMove(player1.getPosChosen(),white.getPosTo(),player1.getPieceType());
         //fields
        //  System.out.println("posChosen: " + player1.getPosChosen());
//          System.out.println("posTo: " + white.getPosTo());
//          System.out.println("PieceType: " + player1.getPieceType());
         //bo.drawMove(player1.getPosChosen(),white.getPosTo(),
       
         //bo.getCoord(ValidatePiece.convertRowToIndice(white.getPosTo()),ValidatePiece.convertColToIndice(white.getPosTo()));
         //display
         bo.displayBoard();
         //set turn for player2
         player1Turn=false;
         player2Turn=true;
       }//end player1
       while(player2Turn)
       {
         player2.setPos();
         player2.checkPieceType(bo.getBoard()); 
         black.getMove();
         player1.getPieceType();
         //bo.getCoord(ValidatePiece.convertRowToIndice(white.getPosTo()),ValidatePiece.convertColToIndice(white.getPosTo()));
         //display
         bo.displayBoard();
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


	}//end main
}
