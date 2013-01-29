package it.redoddity.elephant;

import java.awt.Color;

public class Elephant {
	
	private Boolean feeded = false;
	
	private String name = null;

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
		// TODO Auto-generated method stub
		return null;
	}

	public int getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void growOneYear() {
		// TODO Auto-generated method stub
		
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
