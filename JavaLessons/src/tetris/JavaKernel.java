package tetris;

import java.awt.Color;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class JavaKernel implements Kernel {
	
	static private Color[] colors = {Color.BLACK, Color.BLUE, Color.YELLOW, Color.RED, Color.GREEN, Color.ORANGE};
	private static final int CELL_SIZE = 30;
	private JPanel _panel;
	
	public JavaKernel(JPanel panel) {
		_panel = panel;		
	}
	
	@Override
	public void drawCell(int colorIndex, int r, int c) {
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
}
