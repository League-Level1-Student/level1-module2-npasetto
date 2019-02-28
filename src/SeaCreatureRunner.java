
public class SeaCreatureRunner {
public static void main(String[] args) {
	SeaCreature spongebob = new SeaCreature("spongebob");
	spongebob.eat();
	spongebob.laugh();
	SeaCreature patrick = new SeaCreature("patrick");
	SeaCreature squidward = new SeaCreature("squidward");
	patrick.eat();
	patrick.laugh();
	squidward.eat();
	squidward.laugh();
}
}
