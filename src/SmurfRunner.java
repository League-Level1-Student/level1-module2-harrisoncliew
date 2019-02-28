
public class SmurfRunner {
	public static void main(String[] args) {
		Smurf s = new Smurf("Papa");
		Smurf s2 = new Smurf("Smurfette");
		Smurf s3 = new Smurf("Handy");
		s3.eat();
		System.out.println(s3.getName());
		System.out.println(s.getName());
		System.out.println(s.getHatColor());
		System.out.println(s.isGirlOrBoy());
		System.out.println(s2.getName());
		System.out.println(s2.getHatColor());
		System.out.println(s2.isGirlOrBoy());
	}
}
