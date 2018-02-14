package BasicTTT;

public class Action {
	
	int sero;
	int garo;
	
	private Player currentPlayer;
	private int loc;
	
	
	public Action(int loc, Player currentPlayer){
		
		this.loc = loc;
		this.currentPlayer = currentPlayer;
		
	}


	public Player getCurrentPlayer() {
		return currentPlayer;
	}


	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}


	public int getLoc() {
		return loc;
	}


	public void setLoc(int loc) {
		this.loc = loc;
	}
	
	
	public String toString(){
		
		return "I am "+currentPlayer+ " and I placed my symbol at spot "+loc;
	}
	public void applyAction(State state) {
		int loc = this.loc;
		
		state.board[sero][garo] = currentPlayer.getSymbol();
		
	}
	
	
	

}
