package tetris;

public class Logic {

	public State state;

	public Logic(State state) {
		this.state = state;
	}

	public void moveLeft() {
		if(state.getFigureColumn() == 0) {
			return;
		}
		state.moveFigureLeft();
	}
	
	public void moveRight() {
		if(state.getFigureColumn() == 0) {
			return;
		}
		state.moveFigureRight();
	}

	public void slideDownOneRow() {
		state.figureRow++;
	}

	public void rotate() {
		// homework
	}

	public void dropDown() {
		// homework
	}



}
