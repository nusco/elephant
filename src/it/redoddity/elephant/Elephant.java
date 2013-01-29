package it.redoddity.elephant;

import java.awt.Color;

public class Elephant {
	
	private Boolean feeded = false;
	
	private String name = "Dumbo";
	
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

	public int getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void growOneYear() {
		// TODO Auto-generated method stub
		
	}

	public void setColor(Color green) {
		// TODO Auto-generated method stub
		
	}

	public Color getColor() {
		// TODO Auto-generated method stub
		return null;
	}

	public void kick() {
		// TODO Auto-generated method stub
		
	}
}
