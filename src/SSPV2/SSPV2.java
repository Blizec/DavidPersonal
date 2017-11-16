package SSPV2;

import java.util.Random;

import javax.swing.JOptionPane;

public class SSPV2 {

	public static void main(String[] args) {
		
		Random RG = new Random();
		int win = 0;
		int loss = 0;
		
		JOptionPane.showMessageDialog(null, "Dax att spela sten sax påse.");
		
		while(true){
			Object[] options = {"Sten", "Sax", "Påse"};
			int n = JOptionPane.showOptionDialog(null, win +  " Wins\n" + loss + " Losses", "Sten Sax Påse", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]) + 1;
			
			int bot = RG.nextInt(3) +1;
			
			if(n != 1 && n != 2 && n != 3){
				break;
			}
			
			if(bot == 1){
				if(n == 1){
					JOptionPane.showMessageDialog(null, "Ni både valde sten");
				}else if(n == 2){
					JOptionPane.showMessageDialog(null, "Du förlorade, din motståndare valde sten");
					loss++;
				}else if(n == 3){
					JOptionPane.showMessageDialog(null, "Du vann, din motståndare valde sten");
					win++;
				}
			}else if(bot == 2){
				if(n == 1){
					JOptionPane.showMessageDialog(null, "Du vann, din motståndare valde sax");
					win++;
				}else if(n == 2){
					JOptionPane.showMessageDialog(null, "Ni både valde sax");
				}else if(n == 3){
					JOptionPane.showMessageDialog(null, "Du förlorade, din motståndare valde sax");
					loss++;
				}
			}else if(bot == 3){
				if(n == 1){
					JOptionPane.showMessageDialog(null, "Du förlorade, din motståndare valde påse");
					loss++;
				}else if(n == 2){
					JOptionPane.showMessageDialog(null, "Du vann, din motståndare valde påse");
					win++;
				}else if(n == 3){
					JOptionPane.showMessageDialog(null, "Ni både valde påse");
				}
			}
		}	
	}
}