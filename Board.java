
public class Board {
   private String[][] board;
   public Board()
   {
      //creates new board
      this.newBoard();
      //this.displayBoard();
   }
   public void get(int y,int x) //tests
   {
      System.out.println("row " + y + ", col" + x + ": " + board[y][x] );
   }
   
   public void newBoard()
   {
     /*String[][] board = {
      {"r","n","b","q","k","b","n","r"},
      {"p","p","p","p","p","p","p","p"},
      {" "," "," "," "," "," "," "," "},
      {" "," "," "," "," "," "," "," "},
      {" "," "," "," "," "," "," "," "},
      {" "," "," "," "," "," "," "," "},
      {"P","P","P","P","P","P","P","P"},
      {"R","N","B","Q","K","B","N","R"}     
   };*/
      board = new String[8][8]; //have board point to array
      board[0][0] = "r";
      board[0][1] = "n";
      board[0][2] = "b";
      board[0][3] = "q";
      board[0][4] = "k";
      board[0][5] = "b";
      board[0][6] = "n";
      board[0][7] = "r";
      board[1][0] = "p";
      board[1][1] = "p";
      board[1][2] = "p";
      board[1][3] = "p";
      board[1][4] = "p";
      board[1][5] = "p";
      board[1][6] = "p";
      board[1][7] = "p";

      for(int y=2;y<=5;y++)
      {
         for(int x=0;x<8;x++)
         {
            board[y][x] = ".";
         }
      }
      //drawing firstPerson
      board[6][0] = "P";
      board[6][1] = "P";
      board[6][2] = "P";
      board[6][3] = "P";
      board[6][4] = "P";
      board[6][5] = "P";
      board[6][6] = "P";
      board[6][7] = "P";
      board[7][0] = "R";
      board[7][1] = "N";
      board[7][2] = "B";
      board[7][3] = "Q";
      board[7][4] = "K";
      board[7][5] = "B";
      board[7][6] = "N";
      board[7][7] = "R";
      
   }
   public void displayNewBoard()
   {
      for(int vertical=0;vertical<8;vertical++)
      {
         for(int horizontal=0;horizontal<8;horizontal++)
         {
            System.out.print(board[vertical][horizontal]);
         }
         System.out.println();
      }
    
   }
  
}