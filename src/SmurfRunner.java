
public class SmurfRunner {
public static void main(String[] args) {
	Smurf smurf1 = new Smurf("Handy Smurf");
	System.out.println(smurf1.getName());
	smurf1.eat();
	Smurf smurf2 = new Smurf("Papa Smurf");
	System.out.println(smurf2.getHatColor());
	System.out.println(smurf2.isGirlOrBoy());
	Smurf smurf3 = new Smurf("Smurfette");
	System.out.println(smurf3.getHatColor());
	System.out.println(smurf3.isGirlOrBoy());
}
}
