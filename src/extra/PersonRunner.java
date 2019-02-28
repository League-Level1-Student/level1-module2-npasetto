package extra;

public class PersonRunner {
public static void main(String[] args) {
	Person person1 = new Person();
	Person person2 = new Person();
	Person person3 = new Person();
	person1.setName("hello");
	person1.setSuperpower("supek");
	person2.setName("jvfdjkcbgukhbcrjhv");
	person2.setSuperpower("superpower2");
	person3.setName(";l';.m'l;'k.jl'.,',jl");
	person3.setSuperpower("superpower3");
	System.out.println(person1.toString());
	System.out.println(person2.toString());
	System.out.println(person3.toString());
}
}
