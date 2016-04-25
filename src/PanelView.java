/*
 * The panel that is displayed on the screen.
 * Attributes will be manipulated by buttons and input from a file.
 * 
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PanelView extends JFrame implements ActionListener{

	//the panel information
	public PanelView(){

		//add the content to the current panel
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(null);

		//creating a button for quitting
		JButton quitButton = new JButton("Quit");
		quitButton.setBounds(50, 60, 80, 30);
		quitButton.addActionListener(this);

		//adding the quit button
		panel.add(quitButton);

		//title, size, location to center
		setTitle("GradeReader");
		setSize(1000, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Check what kind of input it is
		
		//if exit button, exit
		if(e.getID() == 1001)
			System.exit(0);
		
		
		
	}


	//main function to launch the application. This will eventually be moved to the run class
	public static void main(String[] args) {
		PanelView window = new PanelView();
		window.setVisible(true);
	}





}

