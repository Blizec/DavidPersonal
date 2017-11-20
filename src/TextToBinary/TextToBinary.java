package TextToBinary;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextToBinary {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog(null, "Type something you want converted to binary");
		
		  byte[] bytes = input.getBytes();
		  StringBuilder binary = new StringBuilder();
		  for (byte b : bytes){
		     int val = b;
		     for (int i = 0; i < 8; i++){
		        binary.append((val & 128) == 0 ? 0 : 1);
		        val <<= 1;
		     }
		     binary.append(' ');
		  }
		  String output = binary.toString();
		  
		  JTextArea RS = new JTextArea(output);
			RS.setWrapStyleWord(true);
	        RS.setLineWrap(true);
	        RS.setCaretPosition(0);
	        RS.setEditable(false);
	        JOptionPane.showMessageDialog(null, new JScrollPane(RS), "Binary", JOptionPane.PLAIN_MESSAGE);
		  
	}

}