package builder;

public class Demo {
	public static void main(String[] args) {
		BurgerResuturantDirector burgerResuturant = new BurgerResuturantDirector();
		burgerResuturant.setBuilder(new CheeseBurgerBuilder());
		buildBurger(burgerResuturant);

		burgerResuturant.setBuilder(new VeganBurgerBuilder());
		buildBurger(burgerResuturant);

	}

	private static void buildBurger(BurgerResuturantDirector burgerResuturant) {
		Burger burger = burgerResuturant.buildBurger();
		burger.print();
	}
}
