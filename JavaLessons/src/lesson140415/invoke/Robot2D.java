package lesson140415.invoke;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Robot2D extends JPanel implements Robot {

	private static final int DY = 10;
	private static final int DX = 10;
	private int _y;
	private int _x;

	public Robot2D(int x, int y) {
		_x = x;
		_y = y;
		
	}
	
	

	public int getY() {
		return _y;
	}

	public void setY(int y) {
		_y = y;
	}

	public int getX() {
		return _x;
	}

	public void setX(int x) {
		_x = x;
	}

	@Override
	public void up() {
		_y -= DY;
	}

	@Override
	public void down() {
		_y += DY;
	}

	@Override
	public void left() {
		_x -= DX;
	}

	@Override
	public void right() {
		_x += DX;
	}

	@Override
	public void stop() {

	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		g2.fillOval(_x, _y, 30, 30);
	}

}
