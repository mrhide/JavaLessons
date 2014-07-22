package tetris;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;

public class View extends KeyAdapter {

	static private Color[] colors = {Color.BLACK, Color.BLUE, Color.YELLOW, Color.RED, Color.GREEN, Color.ORANGE};
	private static final int CELL_SIZE = 30;

	private JPanel _panel;
	private EventProcessor _processor;

	public View(JPanel panel) {
		_panel = panel;
	}
	
	public void setEventProcessor(EventProcessor processor) {
		_processor = processor;		
	}

	public void updateState(State state) {

		drawField(state.field);
		frawFigure(state);		

	}

	private void frawFigure(State state) {
		for (int r = 0; r < state.figure.data.length; r++) {
			for (int c = 0; c < state.figure.data[r].length; c++) {
				if(state.figure.data[r][c] == 0) {
					continue;
				}
				drawCell(state.figure.data[r][c], state.figureRow + r, state.figureColumn + c);
			}
		}
	}

	private void drawField(Field field) {
		for (int r = 0; r < field.box.length; r++) {
			for (int c = 0; c < field.box[r].length; c++) {
				drawCell(field.box[r][c], r, c);
			}
		}
	}

	private void drawCell(int colorIndex, int r, int c) {
		Graphics2D g = (Graphics2D) _panel.getGraphics();
		g.setColor(colors[colorIndex]);
		try {
			g.fillRect(c * CELL_SIZE, 
								r * CELL_SIZE, 
								CELL_SIZE, CELL_SIZE);
		} finally {
			if(g != null) {
				g.dispose();				
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			_processor.moveLeft();
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			_processor.moveRight();
		}
	}

}
