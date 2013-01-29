package it.redoddity.elephant;

public class Elephant {
	private boolean empty=true;
	public Elephant(String name) {
		
	}

	public boolean isEmpty() {
		return empty;
	}

	public void feed() {
		empty=false;
	}
}
