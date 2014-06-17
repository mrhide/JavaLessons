package lesson140415.invoke;

import java.util.concurrent.TimeUnit;


public class ControlCenter implements CommandListener, Runnable {

	private Dispatcher _dispatcher;
	private String _command = "up";

	public ControlCenter(Dispatcher dispatcher) {
		_dispatcher = dispatcher;
	
	}

	@Override
	public void command(String command) {
		_command = command;

	}

	@Override
	public void run() {
		while (true) {
			_dispatcher.command(_command);
			pause();
		}
	}

	private void pause() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
