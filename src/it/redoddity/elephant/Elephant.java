package it.redoddity.elephant;

import java.awt.Color;

public class Elephant {
	
	private int weight = 100;
	
	private Boolean feeded = false;
	
	private String name = "Dumbo";

	private Color color = Color.GRAY;
	
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

	public String getName() {
		return name;
	}
	
	public String toString() {
		return name+":\n";	
	}

	public int getWeight() {
		return this.weight;
	}

	public void growOneYear() {
		this.weight = this.weight + 50;
		
	}

	public void setColor(Color color)
	{
		this.color = color;
	}

	public Color getColor()
	{
		return this.color;
	}

	public void kick()
	{
		this.setColor(Color.GREEN);
	}
}
