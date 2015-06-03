package choise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.SwingConstants;


public class Sign extends JFrame {
	private static JLabel name = new JLabel("Name ");
	private static JLabel StudentID = new JLabel("ID ");
	private static JTextField InputN = new JTextField();
	private static JTextField InputID = new JTextField();
	private static JButton SignB = new JButton("OK");
	
	Sign(){
		
		setTitle("Sign");
		setBounds(130, 130, 300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setVisible(true);
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setBounds(80,40,80,20);
		getContentPane().add(name);
		
		InputN.setBounds(160,40,80,20);
		InputN.setColumns(10);
		getContentPane().add(InputN);
		StudentID.setHorizontalAlignment(SwingConstants.CENTER);
		
		StudentID.setBounds(80,80,80,20);
		getContentPane().add(StudentID);
		
		InputID.setBounds(160,80,80,20);
		InputID.setColumns(9);
		getContentPane().add(InputID);
		
		
		getContentPane().add(SignB);
		SignB.setBounds(120, 130, 60, 20);
		SignB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Knowledge.getFrame().setVisible(true);
				Knowledge.getFrame().setTitle(InputID.getText()+"_question");
				SwingUtilities.windowForComponent(SignB).dispose();
				
			}
		});
		
	}
	
	public static  String getInput(){
		return InputID.getText()+ "\n"+InputN.getText() ;
	}
	

	
}
