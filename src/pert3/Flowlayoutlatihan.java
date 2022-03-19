package pert3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Flowlayoutlatihan extends JPanel {
	
	JButton[] butt = new JButton[20];
	
	public Flowlayoutlatihan() {
		// TODO Auto-generated constructor stub
		
		init();
//		JPanel scrollJPanel = new JPanel();
//		JScrollPane jsp = new JScrollPane(scrollJPanel);
		for (JButton jButton : butt) {
			add(jButton);
		}
		
//		setVisible(true);
//		setSize(500,500);
//		setTitle("grid layout");
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
////		setLayout(new GridLayout(1,1));
//		setLayout(new FlowLayout(FlowLayout.TRAILING));
//		setLocationRelativeTo(null);
//		setResizable(false);
	}
	
	private void init() {
		// TODO Auto-generated method stub
		for (int i = 0; i < butt.length; i++) {
			butt[i] = new JButton(String.valueOf(i+1));
			butt[i].setPreferredSize(new Dimension(75,30));
		}
	}

}
