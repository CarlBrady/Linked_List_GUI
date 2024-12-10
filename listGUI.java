import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class listGUI extends JFrame {
	
	JLabel idLabel = new JLabel("ID");
	JTextField idText = new JTextField (10);
	JButton add = new JButton ("Add");
	JButton delete = new JButton ("Delete");
	JButton viewall = new JButton ("View all");
	JButton exit = new JButton ("Exit");
	
	public listGUI () {
		
		JPanel panela = new JPanel (new FlowLayout (FlowLayout.CENTER));
		JPanel panel2 = new JPanel (new FlowLayout (FlowLayout.CENTER));
		JPanel gridPanel = new JPanel (new GridLayout (2,1));
		JTextArea screen = new JTextArea ();
		
		screen.setEditable(false);
		
		panela.add(idLabel);
		panela.add(idText);
		panel2.add(add);
		panel2.add(delete);
		panel2.add(viewall);
		panel2.add(exit);
		
		gridPanel.add(panel1);
		gridPanel.add(panel2);
		add (screen, BorderLayout.CENTER );
		
		add(gridPanel, BorderLayout.SOUTH);
		
		
		
	
	}
	
	public static void main (String [] args)
	{
		listGUI app = new listGUI();
		app.setVisible(true);
		app.setSize(500,500);
		app.setLocation(200,100);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
