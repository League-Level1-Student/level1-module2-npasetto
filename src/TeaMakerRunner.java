
public class TeaMakerRunner {
public static void main(String[] args) {
	TeaBag bag = new TeaBag(TeaBag.MINT);
	Kettle kettle = new Kettle();
	kettle.boil();
	Cup cup = new Cup();
	cup.makeTea(bag, kettle.getWater());
}
}
