package it.redoddity.elephant;

public class Elephant {
	
	private Boolean feeded = false;
	
	private String name = null;

	public Elephant(String name)
	{
		this.name = name;
	}

	public boolean isEmpty()
	{
		return !this.feeded;
	}

	public void feed()
	{
		this.feeded = true;
	}
}
