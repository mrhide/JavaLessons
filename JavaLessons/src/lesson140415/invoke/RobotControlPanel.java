package lesson140415.invoke;

import java.awt.Dimension;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;

public class RobotControlPanel {

	
	public static void main(String[] args) {

		System.out.println("Start!");

		SimpleRobot robot = new SimpleRobot();

		Robot2D r2d2 = new Robot2D(100, 100);

		Dispatcher dispatcher = new Dispatcher();

		dispatcher.add(robot);
		dispatcher.add(r2d2);

		ControlCenter center = new ControlCenter(dispatcher);

		new Thread(center).start();

		startKeyboardInterface(center);
		startGraphics(r2d2);
	}

	private static void startGraphics(Robot2D robot) {
		JFrame frame = new JFrame("Robot Control Panel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		robot.setPreferredSize(new Dimension(400, 400));
		
		frame.add(robot);
		
		frame.pack();
		frame.setVisible(true);
		
		while(true) {
			robot.repaint();
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private static void startKeyboardInterface(final CommandListener listener) {
		new Thread(new Runnable() {
			public void run() {
				Scanner scanner = new Scanner(System.in);

				try {
					while (scanner.hasNextLine()) {
						String command = scanner.nextLine();
						listener.command(command);
					}
				} finally {
					if (scanner != null) {
						scanner.close();
					}
				}

			}
		}).start();
	}

}
