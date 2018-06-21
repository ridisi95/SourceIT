package HW13;

public class WriterAndReaders_ReaderNOTWORK implements Runnable {
	private WriterAndReaders_WriterNOTWORK writer;
	private String previousStr = "";

	public WriterAndReaders_ReaderNOTWORK(WriterAndReaders_WriterNOTWORK writer) {
		this.writer = writer;
	}

	@Override
	public void run() {
		try {
			while (true) {
				if (!previousStr.equals(writer.getStr())) {
					synchronized (writer.str) {
						previousStr = writer.getStr();
						System.out.println(Thread.currentThread().getName() + writer.getStr());
						Thread.currentThread().sleep(1000);
						writer.setRegulator();
						if (writer.regulator == 3) {
							writer.regulator = 0;
						}
					}
				}
			}
		} catch (InterruptedException e) {
			System.err.println(Thread.currentThread().getName() + "is stoped");
		}
	}
}
