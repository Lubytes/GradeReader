/*
 * The panel that is displayed on the screen.
 * Attributes will be manipulated by buttons and input from a file.
 * 
 */

/*
 * Attributions:
 * makeTextPanel and imageIcon are edited but retrieved from:
 * https://docs.oracle.com/javase/tutorial/uiswing/components/tabbedpane.html
 * 
 */



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JComponent;


public class PanelView extends JFrame implements ActionListener{

	//the panel information
	public PanelView(){

		//tabs and future image icon ability from oracle tutorial 
		JTabbedPane tabbedPane = new JTabbedPane();
        ImageIcon icon = createImageIcon("images/middle.gif");
		
		JComponent panel1 = makeTextPanel("");
		tabbedPane.addTab("Grades", icon, panel1, "Displays grade information");
		
		JComponent panel2 = makeTextPanel("");
        tabbedPane.addTab("Settings", icon, panel2, "Edit grade information");
		
		//adding content to pan2

		//creating a button for quitting
		JButton quitButton = new JButton("Quit");
		quitButton.setBounds(50, 60, 80, 30);
		quitButton.addActionListener(this);

		//adding the quit button
		panel1.add(quitButton);

		
		//adding content to pan2
		
		
		
		
		//title, size, location to center
		setTitle("GradeReader");
		setSize(1000, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().add(tabbedPane);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Check what kind of input it is
		
		//if exit button, exit
		if(e.getID() == 1001)
			System.exit(0);
		
		
		
	}

	protected JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(null);
        panel.add(filler);
        return panel;
    }
	
	
	protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = PanelView.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
	

	//main function to launch the application. This will eventually be moved to the run class
	public static void main(String[] args) {
		PanelView window = new PanelView();
		window.setVisible(true);
	}





}

