package HW7;

public class City { // do through Enum
	String name;

	private class TypeOfStreet {
		int numberOfHouse;
		int lenghtOfRoad;

		private TypeOfStreet(String name, int numberOfHouse, int lenghtOfRoad) {

			City.this.name = name;
			this.numberOfHouse = numberOfHouse;
			this.lenghtOfRoad = lenghtOfRoad;
		}

		public String getName() {
			return name;
		}

		public int getNumberOfHouse() {
			return numberOfHouse;
		}

		public void setNumberOfHouse(int numberOfHouse) {
			this.numberOfHouse = numberOfHouse;
		}

		public int getLenghtOfRoad() {
			return lenghtOfRoad;
		}

		public void setLenghtOfRoad(int lenghtOfRoad) {
			this.lenghtOfRoad = lenghtOfRoad;
		}

		private class Street {
			private Street(String name, int numberOfHouse, int lenghtOfRoad) {super();};

		}

		private class Avenue {
			private Avenue(String name, int numberOfHouse, int lenghtOfRoad) {super();};
		}

		private class Square {
			private Square(String name, int numberOfHouse, int lenghtOfRoad) {super();};
		}
		
		
		
		
		
		
		public Street newStreet(String name, int numberOfHouse, int lenghtOfRoad) {
			return new Street(name, numberOfHouse, lenghtOfRoad);
		}
		public Avenue newAvenue(String name, int numberOfHouse, int lenghtOfRoad) {
			return new Avenue(name, numberOfHouse, lenghtOfRoad);
		}
		public Square newSquare(String name, int numberOfHouse, int lenghtOfRoad) {
			return new Square(name, numberOfHouse, lenghtOfRoad);
		}
		
		
		
		
	}

	public TypeOfStreet add(String name, int numberOfHouse, int lenghtOfRoad) {
		return new TypeOfStreet(name, numberOfHouse, lenghtOfRoad);
	}

	public void main(String[] args) {
		City city = new City();
		TypeOfStreet.Avenue lenina = city.add("Lenina", 1500, 4).newAvenue("Lenina", 1500, 4);
		
	}
}
