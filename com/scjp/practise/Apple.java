package src.certification;

import src.certification.food.Fruit;

class Apple extends Fruit {
	/*
	 * public void setName(String name){ fruitName=name; }
	 */

	public void setColor(String color) {
		fruitColor = color;
	}

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println("Run time argument for " + i + " is " + args[i]);
		}

		Apple A1 = new Apple();
		Fruit A2 = new Apple();
		A1.setName("Orange");
		A1.setColor("Saffron");
		A1.displayProp();
	}
}
