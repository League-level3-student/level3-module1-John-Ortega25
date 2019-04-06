import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Hire implements ActionListener {
	private JButton hireButton = new JButton();
	private JButton layOffButton = new JButton();
	private Stack<String> employees = new Stack<>();
	private JTextField hireText = new JTextField(10);
	private JTextField layOffText = new JTextField(3);

	public void createUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(hireText);
		panel.add(hireButton);
		panel.add(layOffText);
		panel.add(layOffButton);
		hireButton.setText("Hire");
		layOffButton.setText("Lay off");
		hireButton.addActionListener(this);
		layOffButton.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		Hire employees = new Hire();
		employees.createUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == hireButton) {
			String newEmployee = hireText.getText();
			employees.push(newEmployee);
			System.out.println(employees);
		} else if (buttonPressed == layOffButton) {
			String userNumLayOff = layOffText.getText();
			int numLayOff = Integer.parseInt(userNumLayOff);
			if (numLayOff <= employees.size()) {
				String finalList = "";
				for (int i = 0; i < numLayOff; i++) {
					String employeeLaidOff = employees.pop();
					finalList = finalList + "\n" + employeeLaidOff;
				}
				JOptionPane.showMessageDialog(null, "The following employee(s) was laid off: " + finalList);
			} else {
				JOptionPane.showMessageDialog(null, "You have entered an invalid number of employees to lay off");
			}
		}
	}
}
