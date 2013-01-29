package it.redoddity.elephant;

import java.awt.Color;

public class Elephant {
	
	private int weight = 100;
	
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

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getWeight() {
		// TODO Auto-generated method stub
		return this.weight;
	}

	public void growOneYear() {
		this.weight = this.weight + 50;
		
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
