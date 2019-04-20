package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class _02_LogSearch implements ActionListener {
	JButton addButton = new JButton();
	JButton addTheAddButton = new JButton();
	JButton searchButton = new JButton();
	JButton listButton = new JButton();
	JLabel idLabel = new JLabel();
	JLabel nameLabel = new JLabel();
	JTextField idField = new JTextField(10);
	JTextField nameField = new JTextField(10);
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	HashMap<Integer, String> logSearch = new HashMap<>();

	public void createUI() {
		frame.add(panel);
		panel.add(listButton);
		listButton.setText("List");
		panel.add(searchButton);
		searchButton.setText("Search");
		panel.add(addButton);
		addButton.setText("Add");
		idLabel.setText("ID");
		nameLabel.setText("Name");
		listButton.addActionListener(this);
		searchButton.addActionListener(this);
		addButton.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
	}

	public void createAddUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(idLabel);
		panel.add(idField);
		panel.add(nameLabel);
		panel.add(nameField);
		panel.add(addTheAddButton);
		addTheAddButton.setText("add");
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		_02_LogSearch logNames = new _02_LogSearch();
		logNames.createUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == addButton) {
			createAddUI();
		}
		if (buttonPressed == addTheAddButton) {
			String name = nameField.getText();
			String id = idField.getText();
			Integer idNum = Integer.parseInt(id);
			logSearch.put(idNum, name);
		}

		if (buttonPressed == listButton) {
			for (Integer i : logSearch.keySet()) {
				System.out.println(logSearch.get(i));
			}
		}
	}
}

/*
 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
 * an input dialog to ask the user to enter an ID number. After an ID is
 * entered, use another input dialog to ask the user to enter a name. Add this
 * information as a new entry to your HashMap.
 * 
 * Button 2: Search by ID When this button is clicked, use an input dialog to
 * ask the user to enter an ID number. If that ID exists, display that name to
 * the user. Otherwise, tell the user that that entry does not exist.
 * 
 * Button 3: View List When this button is clicked, display the entire list in a
 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
 * 
 * When this is complete, add a fourth button to your window. Button 4: Remove
 * Entry When this button is clicked, prompt the user to enter an ID using an
 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
 * the user that the ID is not in the list.
 *
 */