package choise;


import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;

public class Knowledge extends JFrame {
	private static Knowledge frame;
	private static Sign sign;
	private static PlayGame gamePanel;
	public Knowledge(){
		add(gamePanel);
		//super.setResizable(false);
	}
	
	public static void main(String[] args) {
		sign = new Sign();
		gamePanel = new PlayGame();
		frame = new Knowledge();
		frame.setBounds(100, 100, 700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(false);
	}
	
	public static Knowledge getFrame(){
		return frame;
	}
	
}
