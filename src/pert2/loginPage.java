package pert2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class loginPage extends JFrame implements ActionListener{

	JPanel north, center, south;
	JLabel header, usernameLabel, passLabel;
	JTextField usernameField;
	JPasswordField passField;
	JButton login;
	
	public loginPage() {
		// TODO Auto-generated constructor stub
		
		//north
		north = new JPanel();
		north.setBorder(new EmptyBorder(10,0,100,0));
		header = new JLabel("Welcome");
		header.setFont(new Font("Serif", Font.BOLD, 25));
		north.add(header);
		
		//center
		center = new JPanel(new GridLayout(2,2,0,10));
		center.setBorder(new EmptyBorder(10,10,10,10));
		usernameLabel = new JLabel("Username");
		passLabel = new JLabel("Password");
		usernameField = new JTextField();
		passField = new JPasswordField();
		passField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyCode() == e.VK_1) {
					System.out.println("INI udh di release");
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode() == e.VK_ENTER) {
					System.out.println("Your Username is " + usernameField.getText());
					System.out.println("Your password is " + String.valueOf(passField.getPassword()));
				}
			}
		});
		
		center.add(usernameLabel);
		center.add(usernameField);
		center.add(passLabel);
		center.add(passField);
		
		//south
		south = new JPanel();
		south.setBorder(new EmptyBorder(100,0,10,0));

		login = new JButton("Login");
		login.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("ini udhd di release");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("INI MASIH DI TEKAN");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				login.setBackground(Color.gray.brighter());
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				login.setBackground(Color.gray.darker());
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("by Mouse click");
				System.out.println("Your Username is " + usernameField.getText());
				System.out.println("Your password is " + String.valueOf(passField.getPassword()));
			}
		});
		login.addActionListener(this);
		south.add(login);
		
		
		add(north, BorderLayout.NORTH);
		add(center, BorderLayout.CENTER);
		add(south, BorderLayout.SOUTH);
		
		setVisible(true);
		setSize(500,500);
		setTitle("Login page");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	public static void main(String[] args) {
		new loginPage();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		if (e.getSource() == login) {
//			System.out.println("Your Username is " + usernameField.getText());
//			System.out.println("Your password is " + String.valueOf(passField.getPassword()));
//		}
	}

}
