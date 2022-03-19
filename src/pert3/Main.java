package pert3;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Main extends JFrame {

	JTabbedPane tb;
	JPanel grid = new GridLayoutlatihan();
	JPanel border = new borderlayoutlatihan();
	JPanel flow = new Flowlayoutlatihan();
	
	public Main() {
		// TODO Auto-generated constructor stub
		System.out.println("TEST");
		init();
		
		add(tb);
		
		setVisible(true);
		setSize(500,500);
		setTitle("ALL Layout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
	}

	private void init() {
		// TODO Auto-generated method stub
		tb = new JTabbedPane();
		tb.add(grid, "INI GRID Layout");
		tb.add(border, "INI BORDER Layout");
		tb.add(flow, "INI FLOW Layout");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
