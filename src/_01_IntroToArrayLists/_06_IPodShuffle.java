package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class _06_IPodShuffle implements ActionListener {
	private JButton shuffleButton = new JButton();
	private ArrayList<Song> songs = new ArrayList<>();
	private int currentSongIndex = 0;
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();

	public _06_IPodShuffle() {
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
	}

	public void startIpod() {
		songs.add(new Song("Cow.mp3"));
		songs.add(new Song("Pig.mp3"));
		songs.add(new Song("Rooster.mp3"));
		songs.add(new Song("Donkey.mp3"));
		songs.add(new Song("demo.mp3"));
		frame.add(panel);
		panel.add(shuffleButton);
		shuffleButton.setText("Surprise Me!");
		shuffleButton.addActionListener(this);
		frame.pack();
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		_06_IPodShuffle ipod = new _06_IPodShuffle();
		ipod.startIpod();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (shuffleButton == buttonPressed) {
			songs.get(currentSongIndex).stop();
			Random generator = new Random();
			int newNum = generator.nextInt(songs.size());
			currentSongIndex = newNum;
			songs.get(newNum).play();
		}
	}
}