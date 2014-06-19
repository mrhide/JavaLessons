package lesson140610;

public class Worker {
	
	private static final Runnable POISON_PILL = new Runnable() {
		@Override
		public void run() {
		}
	};

	final private BlockingQueue<Runnable> _tasks = new BlockingQueue<>();

	private class WorkerTask implements Runnable {
		@Override
		public void run() {
			Runnable task;
			while (true) {
				task = _tasks.poll();
				if (task == POISON_PILL) {
					break;
				}
				try {
					task.run();
				} catch (Throwable e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public Worker() {
		new Thread(this.new WorkerTask()).start();
	}

	public void execute(Runnable task) {
		_tasks.offer(task);
	}
	
	public void shutdown() {
		execute(POISON_PILL);
	}

}