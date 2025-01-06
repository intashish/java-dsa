package tree;

public class Main {

	public static void main(String[] args) {

		Tree drinks = new Tree("drinks");
		Tree cold = new Tree("cold");
		Tree hot = new Tree("hot");
		Tree iceTea = new Tree("ice tea");
		Tree coldCoffee = new Tree("cold Coffee");
		Tree milkTea = new Tree("milk Tea");
		Tree coffee = new Tree("coffee");
		
		drinks.add(cold);
		drinks.add(hot);
		cold.add(iceTea);
		cold.add(coldCoffee);
		hot.add(coffee);
		hot.add(milkTea);
		
		System.out.println(drinks.print(1));
	}

}
