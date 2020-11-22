package labb2;
import java.awt.event.*;

import javax.swing.JTextArea;

public class Lyssnare extends WindowAdapter implements ActionListener{
		private Frame l;
		private Logik ll;
	
		protected JTextArea lottoRad;
		public Lyssnare(Frame lin) {
			l=lin;
			ll = new Logik();
		}
		public void actionPerformed(ActionEvent e) {
				int rad = ll.getRad();
				l.fyllRad(rad);
				System.out.println("HEJEHEJE");
			}
		public void windowClosing (WindowEvent e) {
			
		System.out.println("Hej då");
		System.exit(1);
		}

}
