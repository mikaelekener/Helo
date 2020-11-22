package labb2;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class Frame{
	private Lyssnare ly;
	private JFrame frame;
	private JButton b1;
	private JTextArea lottoRad;
	private JMenuBar mb;
	private JMenu settings;
	private JMenuItem save;
	private JMenuItem clear;
	private JMenuItem exit;
	
	
	public Frame() {
		frame = new JFrame("Lotto");
		ly = new Lyssnare(this);
		frame.addWindowListener(ly);
		frame.setSize(600,600);
		
		b1 = new JButton("Slumpa rad");
		b1.addActionListener(ly);
		frame.getContentPane().add(b1);
		
		mb = new JMenuBar();
		frame.setJMenuBar(mb);
		settings = new JMenu("Settings");
		mb.add(settings);
		
		save = new JMenuItem("save"); 
		settings.add(save);
		
		clear = new JMenuItem("clear");
		settings.add(clear);
		
		exit = new JMenuItem("exit");
		settings.add(exit);
		
		lottoRad = new JTextArea("");
		frame.add(lottoRad);
		
		lottoRad.setBounds(150,200,300,17);
		b1.setBounds(200,300,200,50);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
	
		public void fyllRad(int rad) {
			
			lottoRad.append(" "+rad);
		}
		
		public static void main(String[] args) {
			new Frame();
			
			
		}
}
