package HW8;

public class DefaultMyList implements MyList {

	transient Object[] data = new Object[1];
	private int size;
	private int countObj = 0;
	private Object[] modifiedData;
	private int count;

	public void add(Object e) {

		modifiedData = new Object[countObj + 1];
		for (int i = 0; i < data.length; i++) {
			modifiedData[i] = data[i];
		}
		data = modifiedData;
		data[countObj] = e;
		countObj++;
	}

	public Object get(int index) {

		return data[index];
	}

	public void clear() {

		data = new Object[1];
	}

	public boolean remove(Object o) {

		modifiedData = new Object[data.length - 1];
		count = -1;

		for (int i = 0; i < data.length; i++) {

			if (data[i].equals(o)) {

				count++;
			}

			if (count == -1 && i == data.length - 1) {
				return false;
			}

		}

		for (int i = 0; i < data.length; i++) {

			if (!data[i].equals(o)) {
				modifiedData[count] = data[i];
				count++;
			}

		}
		data = modifiedData;
		return true;
	}

	public Object[] toArray() {

		return data;
	}

	public int size() {

		return data.length;
	}

	public boolean contains(Object o) {

		for (int i = 0; i < data.length; i++) {

			if (data[i].equals(o)) {
				return true;
			}
		}

		return false;
	}

	public boolean containsAll(MyList c) {

		modifiedData = c.toArray();

		count = 0;

		for (int i = 0; i < data.length; i++) {

			for (int j = 0; j < c.size(); j++) {
				if (data[i].equals(modifiedData[j])) {
					count++;
				}
			}
			if (count == modifiedData.length - 1) {
				return true;
			}
		}

		return false;
	}

}