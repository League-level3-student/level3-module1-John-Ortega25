package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
	JButton button = new JButton();
	ArrayList<Song> songs = new ArrayList<>();
	
	public _06_IPodShuffle() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();	
		songs.add(new Song("Cow.wav"));
		songs.add(new Song("Pig.mp3"));
		songs.add(new Song("Rooster.wav"));
		songs.add(new Song("Donkey.flac"));
		songs.add(new Song("demo.mp3"));
		frame.add(panel);
		panel.add(button);
		button.setText("Surprise Me!");
		button.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
		
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
	}
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (button == buttonPressed) {
			System.out.println("hello");
			songs.get(1).play();
		}
	}
}