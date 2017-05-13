import java.util.Scanner;
public class Piece {
    private String color;
    private String symbol;
    public String positionTo;
    public Piece(String color,String symbol)
    {
      this.color = color;
      this.symbol = symbol;
    }
    public boolean movement(){return true;} //takes in coordinates,boolean is able
    public boolean isTaken(){return true;}
    public String getSymbol(){return symbol;}
    public void getMove()
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
    }
}
