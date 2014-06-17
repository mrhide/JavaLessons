package lesson140401.localinner;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UIExample2 {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("UI Example 2");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // при закрытии окна выйти из приложения
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(400, 400));
		
		panel.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				System.out.println("Released! " + arg0.getX() + " " + arg0.getY());
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				System.out.println("Pressed! " + arg0.getX() + " " + arg0.getY());
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				System.out.println("Exited! " + arg0.getX() + " " + arg0.getY());
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				System.out.println("Entered! " + arg0.getX() + " " + arg0.getY());
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("Clicked! " + arg0.getX() + " " + arg0.getY());
			}
		});
		
		panel.addMouseMotionListener(new MouseMotionListener() {			
			@Override
			public void mouseMoved(MouseEvent arg0) {
				System.out.println("Moved! " + arg0.getX() + " " + arg0.getY());
			}
			
			@Override
			public void mouseDragged(MouseEvent arg0) {
				System.out.println("Dragged! " + arg0.getX() + " " + arg0.getY());
			}
		});
		
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseWheelMoved(MouseWheelEvent arg0) {
				System.out.println("Wheel" + arg0.getX() + " " + arg0.getY());
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getButton());
			}
		});
		
		JTextField field = new JTextField();
		
		field.setPreferredSize(new Dimension(50, 20));
		
		field.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				System.out.println(arg0.getKeyChar());
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
			}
		});
		
		panel.add(field);
		
		frame.add(panel);
		
		frame.pack(); // подогнать размеры под размеры содержимого
		
		frame.setVisible(true);
		
	}
	
}
