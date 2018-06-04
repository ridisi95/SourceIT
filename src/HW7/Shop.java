package HW7;

public class Shop {
	private String nameOfDepartment;
	private int unitOfGoods;
	private int providedService;

	private class Keeper {

		private Keeper(String nameOfDepartment, int unitOfGoods, int providedService) {
			Shop.this.nameOfDepartment = nameOfDepartment;
			Shop.this.unitOfGoods = unitOfGoods;
			Shop.this.providedService = providedService;
		}

		private String getNameOfDepartment() {
			return nameOfDepartment;
		}

		private int getUnitOfGoods() {
			return unitOfGoods;
		}

		private void setUnitOfGoods(int unitOfGoods) {
			Shop.this.unitOfGoods = unitOfGoods;
		}

		private int getProvidedService() {
			return providedService;
		}

		private void setProvidedService(int providedService) {
			Shop.this.providedService = providedService;
		}

		@Override
		public String toString() { // ink for learn:
									// http://study-java.ru/uroki-java/formatirovanie-chisel-i-texta-v-java/
			return String.format("Name of department: %s\t Unit of goods: %d\t Provided service: %s\t ",
					nameOfDepartment, unitOfGoods, providedService);
		}
	}

	public Keeper processInfo(String nameOfDepartment, int unitOfGoods, int providedService) {
		return new Keeper(nameOfDepartment, providedService, providedService);
	}

	public static void main(String[] args) {
		Shop shop = new Shop();
		Shop.Keeper keeper = shop.processInfo("marketing", 350, 15);
		keeper.setUnitOfGoods(10000);
		keeper.setProvidedService(50);
		// System.out.println(keeper.getNameOfDepartment());

		System.out.println(keeper);

	}
}
