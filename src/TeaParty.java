
public class TeaParty {

	public String welcome(String name, boolean isWoman, boolean isKnighted) {

		String Welcome = "";
		if (isWoman) {
			Welcome = "Hello Ms. " + name;
		} else {
			if (isKnighted) {
				Welcome = "Hello Sir " + name;
			} else {
				Welcome = "Hello Mr. " + name;
			}

		}
		return Welcome;
	}
}
