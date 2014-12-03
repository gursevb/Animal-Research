public abstract class Reptile extends Animal {
	public Reptile() {
		type = "Reptiles";
		distribution = "Six Continents!";
	}
	@Override
	public void animalType() {
		System.out.println( type + " live in " + distribution + " .");
		}
	public void animalStatement() {
		super.animalStatement();
	}


	public void endangeredReptile() {
		System.out.println("Here are some endangered " + type  + " you can research!");
		System.out.println("1) Argentine Tortoise \n 2) Arizona Striped Whiptail \n 3) Black Sea Viper");
	}



	public void Snake() {
		System.out.println("Here are some endangered " + type  + " you can research!");
		System.out.println("1) Argentine Tortoise \n 2) Arizona Striped Whiptail \n 3) Black Sea Viper");
	}
}
