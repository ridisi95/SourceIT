package HW13;

public class WriterAndReaders_WriterNOTWORK implements Runnable {
	public String str = "";
	private int index;
	public int regulator;
	String[] arr = { "FIRST line", "SECOND line ", "THIRD line" };

//	public WriterAndReaders_Writer(WriterAndReaders_Text str) {
//		this.str = str;
//	}
//	public WriterAndReaders_Writer() {
//	}

	@Override
	public void run() {
		try {
			while (true) {
				if (index == 3) {
					index = 0;
				} 
				if (regulator == 0) {
					synchronized (str) {
						str = arr[index];
						System.out.println("Writer wrote: " + str);
						Thread.currentThread().sleep(1000);
						index++;
					}
				}
			}
		} catch (InterruptedException e) {
			System.err.println("Writer is stoped");
		}
	}

	public String getStr() {
		return str;
	}

	public int getRegulator() {
		return regulator;
	}

	public void setRegulator() {
		this.regulator += 1;
	}
}
