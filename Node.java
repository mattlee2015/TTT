package BasicTTT;

import java.util.ArrayList;

public class Node {
	
	Player player;
	int utilityVal;//
	State currState;//
	Node parent;
	ArrayList<Node> children;//
	
	public Node(){
		parent = new Node();
		children = new ArrayList<Node>();
		
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public int getUtilityVal() {
		return utilityVal;
	}

	public void setUtilityVal(int utilityVal) {
		this.utilityVal = utilityVal;
	}

	public State getCurrState() {
		return currState;
	}

	public void setCurrState(State currState) {
		this.currState = currState;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public ArrayList<Node> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<Node> children) {
		this.children = children;
	}
	
	public String toString(){
		
		return currState.toString();
	}
	public boolean terminalTest() {
		
		return currState.isTerminal();
		
	}
	
	//utility func
	public int UtilityVal (Player opp){
		
		
		if(player.won == true && opp.won == false){
			return utilityVal = 1;
		}else if(player.won == false && opp.won == true){
			return utilityVal = -1;
			
		}else if(player.won == false && opp.won == false){
			return utilityVal = 0;
		}
		
		return utilityVal;
	}
public void miniMax() {
		
		if(terminalTest() == true) {
			
			utilityVal = this.UtilityVal(player);
		
			
		}
		else
		{
			
			if(currState.getCurrentPlayer() == player) {
				
				ArrayList<Action> actions = currState.checkOpenSpace();
				
				int max = Integer.MIN_VALUE;
				
				ArrayList<Node> successors = new ArrayList<Node>();
				
				for(Action a : actions) {
					
					successors.add(result(currState,a));
				}
				
				children = successors;
				
				for(Node n : children) {

					n.miniMax();
					
					if(max < n.getUtilityVal()) {
						max = n.getUtilityVal();
					}
					
				}
				
				utilityVal = max;
				
			}
			
			if(currState.getCurrentPlayer() != player) {
				
				
				ArrayList<Action> actions = currState.checkOpenSpace();
				
				int min = Integer.MAX_VALUE;
				
				ArrayList<Node> successors = new ArrayList<Node>();
				
				for(Action a : actions) {
					
					successors.add(result(currState,a));

				}
				
				children = successors;
				
				for(Node n : children) {
					
					n.miniMax();

					if(min > n.getUtilityVal()) {
						min = n.getUtilityVal();
					}
					
				}
				
				utilityVal = min;
			}
		}
		
		
	}

	public static Node result(State s, Action a) {
	
		State state = new State(s.copyBoard(), s.getCurrentPlayer());
	
		state.applyAction(a);
	
		Node n = new Node();
	
		n.setCurrState(state);
	
		return n;
	}
	
	//result func
	
	
	
	//miniMax method
	
	
	
	

}
