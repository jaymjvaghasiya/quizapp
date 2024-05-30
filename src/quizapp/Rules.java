package quizapp;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Rules extends JFrame implements ActionListener
{
	
	JButton back, start;
	String nm;
	
	Rules(String name)
	{
		if(name.equals(""))
			nm = "User";
		else
			nm = name;
		
		setLayout(null);
		
		JLabel title = new JLabel("Welcome " + nm + " to Simple Minds");
		title.setFont(new Font("Viner Hand ITC", Font.BOLD, 35));
		title.setForeground(new Color(30, 144, 254));
		title.setBounds(90, 20, 800, 40);
		add(title);
		
		JLabel rules = new JLabel();
		rules.setText(
				"<html><p>"
					+ "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>"
					+ "2. Do not unnecessarily smile at the person sitting next to you, they may also not <br> know the answer" + "<br><br>"
					+ "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>"
	                + "4. Crying is allowed but please do so quietly." + "<br><br>"
	                + "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>"
	                + "6. Do not get nervous if your friend is answering more questions, may be he/she is doing <br> Jai Mata Di" + "<br><br>"
	                + "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>"
				+ "</p></html>"
		);
		rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rules.setBounds(60, 10, 800, 550);
		add(rules);
		
		start = new JButton("Start");
		start.setBackground(new Color(30, 144, 254));
		start.setForeground(Color.WHITE);
		start.setFont(new Font("SAN_SERIF", Font.BOLD, 16));
		start.addActionListener(this);
		start.setBounds(210, 490, 150, 30);
		add(start);
		
		back = new JButton("Back");
		back.setBackground(new Color(30, 144, 254));
		back.setForeground(Color.WHITE);
		back.setFont(new Font("SAN_SERIF", Font.BOLD, 16));
		back.addActionListener(this);
		back.setBounds(410, 490, 150, 30);
		add(back);
		
		getContentPane().setBackground(Color.WHITE);
		setSize(800, 650);
		setLocation(350, 100);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == start)
		{
			setVisible(false);
			new Quiz(nm);
		}
		else if(e.getSource() == back)
		{
			setVisible(false);
			new Login();
		}
	}
	
	public static void main(String args[]) 
	{
		new Rules("User");
	}
}
