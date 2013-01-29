package it.redoddity.elephant;

public class Elephant {

	private boolean hungry = true;
	private String name;
	
	public Elephant(String name) {
		this.name = name;
	}

	public boolean isEmpty() {
		if (hungry == true)
			return true;
		else
			return false;
	}

	public void feed() {
		this.hungry = false;
	}
}
