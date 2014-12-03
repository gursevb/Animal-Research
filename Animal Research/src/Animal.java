public abstract class Animal {
	protected String type;
	protected String distribution;

	public void animalType() {
		System.out.println("You can research a Mammal, Bird or Reptile!");
		System.out.println("The program will also tell you whether the animal is endangered or not!");
		System.out.println("You can also look at sub-breeds of the Animals");
	}
	public abstract void animalColor();

	public void animalStatement()
	{
		System.out.println("I hope you enjoyed researching this animal!");
	}

}
