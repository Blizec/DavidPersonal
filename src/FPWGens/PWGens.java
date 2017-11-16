package FPWGens;

import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PWGens {

	public static void main(String[] args) {
		
		Random GR = new Random();
		String PW = "";
		String PW1 = "";
		int Ex;
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		
	    for (int i = 0; i < 26; i++){
	    	Ex = GR.nextInt(characters.length());
	    	PW1 = PW1 + characters.charAt(Ex);
	    }
	    
	    while(true){
			String Input = JOptionPane.showInputDialog(null, "How many characters do you want for your PW? 8-26");
			int NMR = Integer.valueOf(Input);
				if(NMR >= 8 && NMR <= 26 ){
					PW = PW1.substring(0, NMR);
					break;
				}else{
				JOptionPane.showMessageDialog(null, "You need to pick between 8 and 26");
			}
	    }
	    
	    JTextArea RS = new JTextArea(PW);
		RS.setWrapStyleWord(true);
        RS.setLineWrap(true);
        RS.setCaretPosition(0);
        RS.setEditable(false);
        JOptionPane.showMessageDialog(null, new JScrollPane(RS), "New Password", JOptionPane.INFORMATION_MESSAGE);
	    
	}

}