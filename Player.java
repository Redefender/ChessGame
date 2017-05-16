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
      pieceType = board[ValidatePiece.convertRowToIndice(posChosen)]
      [ValidatePiece.convertRowToIndice(posChosen)];

   }
   
   public String getPieceType(){return pieceType;}
   public  void setPosChosen(String i){posChosen=i;}
   public String getPosChosen(){return posChosen;}

}
