public abstract class Bird extends Animal {
	public Bird() {
		type = "Birds";
		distribution = "All Seven Continents!";
	}
	@Override
	public void animalType() {
		System.out.println( type + " live in " + distribution + " .");
		}
	public void animalStatement() {
		super.animalStatement();
	}


	public void endangeredBird() {
		System.out.println("Here are some endangered " + type  + " you can research!");
		System.out.println("1) California Condor \n 2) I’iwi \n 3) Whooping Crane");
	}



}