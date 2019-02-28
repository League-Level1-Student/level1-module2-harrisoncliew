
public class Minion {
	private String name;
	private int eyes;
	private String color;
	private String master;

	Minion(String name, int eyes, String color, String Master) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = Master;
	}

	int getEyes() {
		return this.eyes;
	}

	String getName() {
		return this.name;
	}

	String getColor() {
		return this.color;
	}

	String getMaster() {
		return this.master;
	}

	void setMaster(String master) {
		this.master = master;
	}

}
