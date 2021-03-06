//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _02_methods._1_animal_farm;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {
	
	public static void main(String[] args) {
		boolean wannaExit = false;	
		/* 1. Ask the user which animal they want, then play the sound of that animal. */			 
		while (!wannaExit) {
		String exitCommand = JOptionPane.showInputDialog(null, "What animal do you want? Exit is the command to exit.");
		if (exitCommand.equalsIgnoreCase("Exit")) {
			wannaExit = true;
		}
		if (exitCommand.equalsIgnoreCase("Cow")) {
			playMoo();
		}
		if (exitCommand.equalsIgnoreCase("Duck")) {
			playQuack();
		}
		if (exitCommand.equalsIgnoreCase("Dog")) {
			playWoof();
		}
		if (exitCommand.equalsIgnoreCase("Llama")) {
			playLlama();
		}
		}
		
		
		/* 2. Make it so that the user can keep entering new animals. */
		
	}

	static void playMoo() {
		JOptionPane.showMessageDialog(null, "playMoo.");
	}

	static void playQuack() {
		JOptionPane.showMessageDialog(null, "playQuack.");
	}

	static void playWoof() {
		JOptionPane.showMessageDialog(null, "playWoof.");
	}
	
	static void playMeow() {
		JOptionPane.showMessageDialog(null, "playMeow.");
	}
	
	static void playLlama() {
		JOptionPane.showMessageDialog(null, "playLlama.");
	}

	static String quackFile = "quack.wav";
	static String mooFile = "moo.wav";
	static String woofFile = "woof.wav";
	static String meowFile = "meow.wav";
	static String llamaFile = "llama.wav";

	/* Ignore this stuff */
	
	public static void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(AnimalFarm.class.getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}