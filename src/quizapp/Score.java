package quizapp;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener
{
	JButton again, exit;
	
	Score(String name, int score)
	{
		setLayout(null);
		
		ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
		Image score_img = i3.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
		ImageIcon s_img = new ImageIcon(score_img);
		JLabel simage = new JLabel(s_img);
		simage.setBounds(50, 150, 300, 250);
		add(simage);
		
		JLabel heading = new JLabel("Thank u " + name + " for playing Simple Minds");
		heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
		heading.setForeground(new Color(30, 144, 254));
		heading.setBounds(150, 50, 700, 30);
		add(heading);
		
		JLabel yourscore = new JLabel("Your score is: " + score);
		yourscore.setFont(new Font("Mongolian Baiti", Font.BOLD, 25));
		yourscore.setBounds(500, 200, 500, 30);
		add(yourscore);
		
		again = new JButton("Play Again");
		again.setBackground(new Color(30, 144, 254));
		again.setFont(new Font("SAN_SERIF", Font.BOLD, 16));
		again.setForeground(Color.WHITE);
		again.addActionListener(this);
		again.setBounds(420, 300, 150, 30);
		add(again);
		
		exit = new JButton("Exit");
		exit.setBackground(new Color(30, 144, 254));
		exit.setFont(new Font("SAN_SERIF", Font.BOLD, 16));
		exit.setForeground(Color.WHITE);
		exit.addActionListener(this);
		exit.setBounds(620, 300, 150, 30);
		add(exit);
		
		setBounds(380, 150, 850, 550);
		getContentPane().setBackground(Color.WHITE);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == again)
		{
			setVisible(false);
			new Login();
		}
		else
		{
			System.exit(0);
		}
	}
	
	public static void main(String args[])
	{
		new Score("user", 0);
	}
}
