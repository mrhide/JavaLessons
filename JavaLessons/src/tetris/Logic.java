package tetris;

public class Logic implements EventProcessor {

	public State state;

	public Logic(State state) {
		this.state = state;
	}

	@Override
	public void moveLeft() {
		if(state.hasConflictWhenShifted(0, -1)) {
			return;
		}
		state.moveFigureLeft();
	}
	
	@Override
	public void moveRight() {
		if(state.hasConflictWhenShifted(0, 1)) {
			return;
		}
		state.moveFigureRight();
	}

	@Override
	public void slideDownOneRow() {
		if(state.hasConflictWhenShifted(1, 0)) {
			state.pasteFigure();
			state.removeFullRows();
			state.newFigure();
			return;
		}
		state.slideDown();
	}

	@Override
	public void rotate() {
		// homework
	}

	@Override
	public void dropDown() {
		// homework
	}



}
