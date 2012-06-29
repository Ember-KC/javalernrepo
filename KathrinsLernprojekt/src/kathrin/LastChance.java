package kathrin;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MeinFrame extends JFrame implements ActionListener {
	JPanel panel;
	JLabel kilometerLabel;
	JTextField kilometerField;
	JLabel tankLabel;
	JTextField tankField;
	JLabel benzinLabel;
	JTextField benzinField;
	JLabel gallonLabel;
	JTextField gallonField;
	JButton button;

	// Konstruktor
	MeinFrame(String title) {
		super(title); // den Konstruktor von JFrame aufrufen
		setSize(500, 200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new GridBagLayout()); // den Layoutmanager setzen
		GridBagConstraints constraints = new GridBagConstraints();

		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.ipadx = 10;
		constraints.insets = new Insets(5, 0, 0, 0);

		kilometerLabel = new JLabel(
				"Wie viel Kilometer möchten Sie noch fahren?");
		constraints.gridx = 0;
		constraints.gridy = 0;
		add(kilometerLabel, constraints);

		kilometerField = new JTextField(10);
		constraints.gridx = 1;
		constraints.gridy = 0;
		add(kilometerField, constraints);

		tankLabel = new JLabel("Tankkapazität in Liter:");
		constraints.gridx = 0;
		constraints.gridy = 1;
		add(tankLabel, constraints);

		tankField = new JTextField(10);
		constraints.gridx = 1;
		constraints.gridy = 1;
		add(tankField, constraints);

		benzinLabel = new JLabel("Tankfüllstand in Prozent:");
		constraints.gridx = 0;
		constraints.gridy = 2;
		add(benzinLabel, constraints); // das Label dem JFrame hinzufügen

		benzinField = new JTextField(10);
		constraints.gridx = 1;
		constraints.gridy = 2;
		add(benzinField, constraints);

		gallonLabel = new JLabel("Verbrauch auf 100 km in Liter:");
		constraints.gridx = 0;
		constraints.gridy = 3;
		add(gallonLabel, constraints); // das Label dem JFrame hinzufügen

		gallonField = new JTextField(10);
		constraints.gridx = 1;
		constraints.gridy = 3;
		add(gallonField, constraints);

		button = new JButton("Berechnen");
		constraints.gridx = 0;
		constraints.gridy = 4;
		constraints.gridwidth = 2;
		add(button, constraints);
		button.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int kilometerStrecke = Integer.parseInt(kilometerField.getText());
			int tankGroesse = Integer.parseInt(tankField.getText());
			int fuellStand = Integer.parseInt(benzinField.getText());
			int verbrauch = Integer.parseInt(gallonField.getText());

			double restKilometer = calculateKilometer(tankGroesse, fuellStand,
					verbrauch);
			if (restKilometer >= kilometerStrecke) {
				JOptionPane.showMessageDialog(null, "Sie schaffen noch "
						+ restKilometer
						+ " Kilometer. Sie brauchen noch nicht zu tanken.",
						"Hinweismeldung", JOptionPane.INFORMATION_MESSAGE);

			} else {
				JOptionPane.showMessageDialog(null, "Sie schaffen noch "
						+ restKilometer
						+ " Kilometer. Sie sollten lieber tanken.",
						"Hinweismeldung", JOptionPane.WARNING_MESSAGE);

			}

		} catch (NumberFormatException nfe) {
			System.out.println("Bitte nur Zahlen eingeben!");
		}
		kilometerField.setText("");
		tankField.setText("");
		benzinField.setText("");
		gallonField.setText("");

		// Felder wieder leeren
	}

	public double calculateKilometer(int tankGroesse, int fuellStand,
			int verbrauch) {
		int literFuellStand = tankGroesse * fuellStand / 100;
		double restKilometer = literFuellStand * 100.0 / verbrauch;

		return restKilometer;

	}

}

public class LastChance {
	public static void main(String[] args) {
		MeinFrame frame = new MeinFrame("Tankprogramm"); // ein MeinFrame-Objekt
		// konstruieren
		frame.setVisible(true); // es auffordern sichtbar zu werden
	}
}