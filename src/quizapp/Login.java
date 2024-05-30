package quizapp;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame implements ActionListener 
{

	JButton exit, next;
	JTextField text;
	
	Login()
	{
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
		JLabel img = new JLabel(i1);
		img.setBounds(0, 0, 600, 500);
		add(img);
		
		JLabel title = new JLabel("Simple Minds");
		title.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
		title.setForeground(new Color(30, 144, 254));
		title.setBounds(750, 50, 400, 40);
		add(title);
		
		JLabel name = new JLabel("Enter your name");
		name.setFont(new Font("Mongolian Baiti", Font.BOLD, 25));
		name.setForeground(new Color(30, 144, 254));
		name.setBounds(800, 140, 200, 30);
		add(name);
		
		text = new JTextField();
		text.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text.setBounds(720, 210, 350, 40);
		add(text);
		
		next = new JButton("Next");
		next.setBackground(new Color(30, 144, 254));
		next.setForeground(Color.WHITE);
		next.setFont(new Font("SAN_SERIF", Font.BOLD, 16));
		next.addActionListener(this);
		next.setBounds(720, 290, 150, 30);
		add(next);
		
		exit = new JButton("Exit");
		exit.setBackground(new Color(30, 144, 254));
		exit.setForeground(Color.WHITE);
		exit.setFont(new Font("SAN_SERIF", Font.BOLD, 16));
		exit.addActionListener(this);
		exit.setBounds(920, 290, 150, 30);
		add(exit);
		
		getContentPane().setBackground(Color.WHITE);
		setSize(1200, 500);
		setLocation(170, 150);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == next)
		{
			String name = text.getText();
			setVisible(false);
			new Rules(name);
		}
		else if(e.getSource() == exit)
		{
			System.exit(0);
		}
	}
	
	public static void main(String[] args) 
	{
		new Login();
	}

}
