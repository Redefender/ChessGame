import java.util.Scanner;

public class Player
{
	private String	posChosen;
	private String	name;
	private String	color;
   private String pieceType;
	public Player(){}
	public Player(String	name,	String color)
	{
   this.name =	name;
		this.color = color;
	}
	public void	setPos()
	{
		String testPos="";
		Scanner stdin = new Scanner(System.in);


		//validate same color, in board
		boolean isValidPos=false;
		while(!isValidPos)
		{
			try
			{
			  System.out.print("Enter position: ");
			  testPos =	stdin.nextLine();
			  if(testPos.length() != 2)
			   throw new Exception("Error! Enter only rank and file: ");

			  if(!ValidatePiece.testInBoard(testPos))	//must be a-h,	1-8
			  {
			   throw	new Exception("Error! not in board!");
			  }
			  isValidPos=true;
			}
			catch(Exception e)
			{
				System.out.print(e.getMessage());

			}
		}


		posChosen =	testPos;

	}
   public void checkPieceType(String board[][])
   {
      pieceType = board[this.convertRowToIndice()][this.convertColToIndice()];

   }
   public int convertColToIndice() //gets from posChosen
   {

      char column = Character.toUpperCase(posChosen.charAt(0));
      switch(column)
      {
         case 'A': return 0;

         case 'B': return 1;

         case 'C': return 2;

         case 'D': return 3;

         case 'E': return 4;

         case 'F': return 5;

         case 'G': return 6;

         case 'H': return 7;

         default:
            return -99;
      }

   }
   public int convertRowToIndice()
   {
      int row = Character.getNumericValue(posChosen.charAt(1));
      switch(row)
      {
         case 8: return 0;
         case 7: return 1;
         case 6: return 2;
         case 5: return 3;
         case 4: return 4;
         case 3: return 5;
         case 2: return 6;
         case 1: return 7;
      }
      return -99;

   }
   public String getPieceType(){return pieceType;}
   public  void setPosChosen(String i){posChosen=i;}
}
