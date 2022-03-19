package pert3;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class borderlayoutlatihan extends JPanel {

	JButton north, east, south, west, center;
	JButton North, East, South, West, Center;
	JPanel panelCenter;
	public borderlayoutlatihan() {
		// TODO Auto-generated constructor stub
		
		init();
//		JPanel panel = new JPanel(new BorderLayout(10,10));
//		panel.setBorder(new EmptyBorder(10,10,10,10));
//		panel.add(north, BorderLayout.NORTH);
//		panel.add(south, BorderLayout.SOUTH);
//		panel.add(east, BorderLayout.EAST);
//		panel.add(west, BorderLayout.WEST);
//		panel.add(panelCenter, BorderLayout.CENTER);
		
//		JPanel panel = new JPanel(new BorderLayout(10,10));
		setBorder(new EmptyBorder(10,10,10,10));
		setLayout(new BorderLayout(10,10));
		
		add(north, BorderLayout.NORTH);
		add(south, BorderLayout.SOUTH);
		add(east, BorderLayout.EAST);
		add(west, BorderLayout.WEST);
		add(panelCenter, BorderLayout.CENTER);
		
		
		
		
		
//		setVisible(true);
//		setSize(500,500);
//		setTitle("grid layout");
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setLayout(new BorderLayout());
//		setLocationRelativeTo(null);
//		setResizable(false);
	}
	
	private void init() {
		// TODO Auto-generated method stub
		north = new JButton("North");
		south = new JButton("South");
		east = new JButton("East");
		west = new JButton("West");
		center = new JButton("Center");
		
		North = new JButton("North");
		South = new JButton("South");
		East = new JButton("East");
		West = new JButton("West");
		Center = new JButton("Center");
		
		panelCenter =  new JPanel(new BorderLayout(10,10));
		panelCenter.add(North, BorderLayout.NORTH);
		panelCenter.add(South, BorderLayout.SOUTH);
		panelCenter.add(West, BorderLayout.WEST);
		panelCenter.add(Center, BorderLayout.CENTER);
		panelCenter.add(East, BorderLayout.EAST);
	}

}
