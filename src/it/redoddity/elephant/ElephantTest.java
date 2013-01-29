package it.redoddity.elephant;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

public class ElephantTest {
	
	
	@Test
	public void testFeed() {
		Elephant e = new Elephant("Dumbo");
		assertTrue(e.isEmpty());
		e.feed();
		assertTrue(!e.isEmpty());
	}

	@Test
	public void testName() {
		assertEquals("Dumbo", new Elephant("Dumbo").getName());
		assertEquals("Dumbo", new Elephant("DUMBO").getName());
		assertEquals("Dumbo", new Elephant("dumbo").getName());
	}

	@Test
	public void testNameWrongCaps() {
	}
	
	@Test
	public void testToString() {
		Elephant e = new Elephant("Dumbo");
		assertTrue(e.toString().contains("Dumbo:\n"));
	}
	
	@Test
	public void testWeightsALot() {
		Elephant e = new Elephant("Dumbo");
		assertEquals(100, e.getWeight());
	}
	
	@Test
	public void testGrowsUp() {
		Elephant e = new Elephant("Dumbo");
		e.growOneYear();
		assertEquals(150, e.getWeight());
	}
	
	@Test
	public void testIsGray() {
		Elephant e = new Elephant("Dumbo");
		assertEquals(Color.GRAY, e.getColor());
	}

	@Test
	public void testCanChangeColor() {
		Elephant e = new Elephant("Dumbo");
		e.setColor(Color.GREEN);
		assertEquals(Color.GREEN, e.getColor());
	}
	
	@Test
	public void testBecomesGreenWhenAngry() {
		Elephant e = new Elephant("Dumbo");
		e.kick();
		assertEquals(Color.GREEN, e.getColor());
	}
	
	@Test
	public void testBecomesPinkWhenHugged() {
		Elephant e = new Elephant("Dumbo");
		e.hug();
		assertEquals(Color.PINK, e.getColor());
	}
	
	@Test
	public void testBecomesGreyWhenHuggedAndKickedInASequence() {
		Elephant e = new Elephant("Dumbo");
		e.hug();
		e.kick();
		assertEquals(Color.GRAY, e.getColor());
	}

	@Test
	public void testRemembersThings() {
		Elephant e = new Elephant("Dumbo");
		e.tellAbout("Raise Against The Machine");
		e.tellAbout("Pink Floyd");
		assertTrue(e.rememberAbout("Pink Floyd"));
		assertFalse(e.rememberAbout("Arcade Fire"));
	}
	
}
