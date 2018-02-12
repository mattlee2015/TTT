package BasicTTT;

public class State {
	
	Player currentPlayer;
	String[][] board = new String[3][3];
	Boolean fullBoard;

	
	public Boolean getFullBoard() {
		return fullBoard;
	}

	public void setFullBoard(Boolean fullBoard) {
		this.fullBoard = fullBoard;
	}

	public State(String [][] currBoard, Player currentPlayer){
		
		currBoard = board;
		this.currentPlayer = currentPlayer;
		
		
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public String[][] getBoard() {
		return board;
	}

	public void setBoard(String[][] board) {
		this.board = board;
	}
	
	// returns the representation of the board
	public String toString(){
		
		return "";
	}
	
	
	//update board method
	
	
	//check viable moves method
	int[] availSpace = new int[9];
	int [][] boardLoc = {{1,2,3},{4,5,6},{7,8,9}};
	
	public int[] checkOpenSpace(){
		for(int i=0; i<3;i++){
			for(int j=0; j<3;j++){
				if(board[i][j] == null){
					int spot = getBoardLocation(boardLoc[i][j]);
					
					availSpace[spot] = spot;
					
					
				}
				
			}	
		}
		return availSpace;
	}
	
	//for debugging purposes to find which spaces are open
	public void printOpenSpace(){
		String printThis = "The open spaces are ";
		
		for(int i=0;i<availSpace.length;i++){
			if(availSpace[i] == i+1){
				printThis += Integer.toString(availSpace[i])+" ";
			}
		}
		
		
	}
	
	
	
	//is terminal state method
	public boolean isTerminal(){
		
		Player playerX = new Player("X");
		Player playerO = new Player("O");
		
	
		for(int i=0; i<3;i++)
		{
			//for horizontal win conditions
			if(board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]) && board[i][2].equals(board[i][0])){
				
				if(board[i][0].equals(playerX.getSymbol())){
					playerX.setWon(true);
					
				}else if(board[i][0].equals(playerO.getSymbol())){
					playerO.setWon(true);
				}
				
				return true;
			}
			
			//for vertical win conditions
			else if(board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]) && board[2][i].equals(board[0][i])){
				if(board[0][i].equals(playerX.getSymbol())){
					playerX.setWon(true);
				}else if(board[0][i].equals(playerO.getSymbol())){
					playerO.setWon(true);
				}
				
				return true;
			}
			
		}
		
		//for diagonal win conditions
		if(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && board[2][2].equals(board[0][0])){
			if(board[0][0].equals(playerX.getSymbol())){
				playerX.setWon(true);
			}else if(board[0][0].equals(playerO.getSymbol())){
				playerO.setWon(true);
			}
			
			return true;
		}
		else if(board[2][0].equals(board[1][1]) && board[1][1].equals(board[0][2]) && board[0][2].equals(board[2][0])){
			if(board[1][1].equals(playerX.getSymbol())){
				playerX.setWon(true);
			}else if(board[1][1].equals(playerO.getSymbol())){
				playerO.setWon(true);
			}
			
			return true;
			
		}
		//if the board is full and neither player has won (tie)
		else if(isFullBoard() == true && playerX.won == false && playerO.won == false){
			
			return true;
		}
		
		
		
		return false;
		
	}
	
	public int getBoardLocation(int loc){
		
		
		
		for(int i=0; i<3;i++){
			for (int j=0; j<3;j++){
				if(loc == boardLoc[i][j]){
					return boardLoc[i][j];
				}
				
			}
		}
		
		return -1; 
		
		
	}
	
	
	
	public boolean isFullBoard(){
		for(int i=0; i<3;i++){
			for(int j=0; j<3;j++){
				if(board[i][j] == null){
					return fullBoard  = false;
				}
				
			}
		}
		
		return fullBoard = true;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
