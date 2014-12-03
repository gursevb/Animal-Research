public abstract class Mammal extends Animal{
	public Mammal() {
		type = "Mammals";
		distribution = "All Seven Continents!";
	}
	@Override
	public void animalType() {
		System.out.println( type + " live in " + distribution + " .");
	}
	public void animalStatement() {
		super.animalStatement();
	}


	public void endangeredMammal() {
		System.out.println("Here are some endangered " + type  + " you can research!");
		System.out.println("1) Amur Leopard \n 2) Black Rhino \n 3) Mountain Gorilla");
	}



}
