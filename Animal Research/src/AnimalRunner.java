public class AnimalRunner {

	public static void main(String[] args) {
		Mammal m = new Mammal();
		Reptile r = new Reptile();
		Bird b = new Bird();
		Animal ab = new Bird();

		ab.animalType();
		m.endangeredMammal();
		m.animalType();
		m.animalStatement();
		b.endangeredBird();
		b.animalType();
		b.animalStatement();
		r.endangeredReptile();
		r.animalType();
		r.animalStatement();
		r.Snake();

	}

}
