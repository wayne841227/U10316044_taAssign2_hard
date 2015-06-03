package choise;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

 

public class PlayGame extends JPanel {
	
	
	private JButton start = new JButton("Start");
	private boolean isStart = false;
	private boolean right = false;
	private JLabel question = new JLabel();
	private JLabel Remaintime;
	private JButton[] choice = new JButton[4]; 
	private JButton next;
	private int score = 0;
	private int count = 1;
	private int remainingTime = 10;
	private boolean isAnswer ;
	private boolean finish ;
	private boolean[] isAppear = new boolean[10];
	private Timer timer;
	PlayGame(){
		setLayout(null);
		setBounds(0, 0, 700, 600);
		setVisible(true);
		ready();
		
	}
	

	
	private void SQuestion(){
		int randomQue = (int)(Math.random()*10);
		
		while(isAppear[randomQue] && count<=10){
			randomQue = (int)(Math.random()*10);
		}
		
		isAppear[randomQue] = true;
		Question.question(randomQue);
		question = new JLabel(Question.Q, JLabel.CENTER);
		question.setFont(new Font("Microsoft YaHei",Font.BOLD,Question.Q.length()<15?35:25));
		question.setBounds(120,60,500,100);
		add(question);
		for(int i=0; i<4; i++){
			choice[i] = new JButton(Question.C[i]);
			choice[i].setFont(new Font("Microsoft YaHei",Font.BOLD, Question.C[i].length()<10?30:20));
			choice[i].setBounds(130, 170 + 70*i, 400, 50);
			add(choice[i]);	
			RightJudge(i);
		}
		
		next = new JButton(count == 10? "End~": "Next ->");
		next.setFont(new Font("Microsoft YaHei",Font.BOLD,15));
		next.setBounds(450, 500, 200, 50);
		add(next);
		
		add(Remaintime);
		
		timer.start();
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(isAnswer){
					timer.stop();
					remainingTime = 10;
					count++;
					finish = (count > 10);
					if(right)
						score += 10;
					else
						JOptionPane.showMessageDialog(null, "Your answer is not correct! The answer is " + Question.C[Question.KEY]);
					isAnswer = false;
					right = false;
					removeAll();
					repaint();
					if(!finish)
						SQuestion();
					else
						timer.stop();
				
				}
				else
					JOptionPane.showMessageDialog(null, "Please choose!");
				
				
				
			}
		});
	}
	
	
	private void ready(){ 
		start.setBounds(240,450,120,60);
		start.setFont(new Font("Microsoft YaHei",Font.BOLD,17));
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isStart = true;
				SQuestion();
				repaint();
			}			
		});
		add(start);
		
		Remaintime = new JLabel();
		Remaintime.setBounds(400,10,250,100);
		Remaintime.setFont(new Font("Microsoft YaHei",Font.BOLD,17));
		timer = new Timer(1000, new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(remainingTime == 0){
					JOptionPane.showMessageDialog(null, "Hey!! Overtime! The answer is " + Question.C[Question.KEY]);
					
					count++;
					
					timer.stop();
					removeAll();
					repaint();
					
					if(count <= 10)
						SQuestion();
					
					remainingTime = 10;
				}
					
				Remaintime.setText("remaining time:" + remainingTime + " scconds");
				remainingTime--;
			}
	    });
	}
	
	
	private void RightJudge(int c){
		
		choice[c].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				isAnswer = true;
				if(Question.KEY == c){
					right = true;
				}
				
			}
	    });
		
	}
	
	@Override 
	protected void paintComponent(Graphics g) {
		
		if(isStart){
			
			if(count <= 10){
			g.setColor(Color.GREEN);
			g.fillRect(0, 0, 700, 600);
			remove(start);
			g.setColor(Color.BLACK);
			g.setFont(new Font("Microsoft YaHei",Font.BOLD,35));
			g.drawString("A.", 80, 210);
			g.drawString("B.", 80, 280);
			g.drawString("C.", 80, 350);
			g.drawString("D.", 80, 420);
			g.setFont(new Font("Microsoft YaHei",Font.BOLD,20));
			g.drawString("Question "+count+"/10", 10, 30);
			g.drawString("Score: " + score, 20, 525);
				
			}
			else{
				g.setColor(Color.GREEN);
				g.fillRect(0, 0, 700, 600);
				g.setColor(Color.BLACK);
				g.setFont(new Font("Microsoft YaHei",Font.BOLD,35));
				g.drawString("Your score:" + score, 80, 210);
			}
			
		}
		else{
			
			g.setColor(Color.BLACK);
			g.setFont(new Font("Welcome",Font.BOLD,90));
			g.drawString("Welcome", 100, 140);
		
			g.setColor(Color.BLUE);
			g.setFont(new Font(Sign.getInput(),Font.BOLD,50));
			g.drawString(Sign.getInput(), 100, 280);
			
		}
	}
}
