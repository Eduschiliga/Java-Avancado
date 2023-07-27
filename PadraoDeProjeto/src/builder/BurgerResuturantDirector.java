package builder;

public class BurgerResuturantDirector {
	private BurgerBuilder burgerBuilder;

	public void setBuilder(BurgerBuilder burgerBuilder) {
		this.burgerBuilder = burgerBuilder;
	}

	public Burger buildBurger() {
		burgerBuilder.buildBun();
		burgerBuilder.buildMeat();
		burgerBuilder.buildSalad();
		burgerBuilder.buildCheese();
		burgerBuilder.buildSauce();
		return burgerBuilder.build();
	}
}
