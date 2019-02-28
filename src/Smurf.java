/*
 *    Copyright (c) The League of Amazing Programmers 2013-2018
 *    Level 1
 */

/* 
 * 1. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 2&3 see comments in code below
 * 4. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 5. Make a Smurfette and print her name, hat color and girl or boy. 
 */

public class Smurf {

	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		if(name.equalsIgnoreCase("Papa Smurf")) {
			return "Red";
		}else {
			return "White";
		}
		
	}

	/* Smurfette is the only female Surf. */
	public String isGirlOrBoy() {
		if(name.equalsIgnoreCase("Smurfette")) {
			return "Female";
		}else {
			return "Male";
		}
	}

}


