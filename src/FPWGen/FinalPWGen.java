package FPWGen;

import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FinalPWGen {

	public static void main(String[] args) {
		
		Random GR = new Random();
		int Ex;
		String a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
		a = b = c = d = e = f = g = h = i = j = k = l = m = n = o = p = q = r = s = t = u = v = w = x = y = z = "";
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		
		Ex = GR.nextInt(characters.length());
	    a = a + characters.charAt(Ex);
	    Ex = GR.nextInt(characters.length());
	    b = b + characters.charAt(Ex);
	    Ex = GR.nextInt(characters.length());
	    c = c + characters.charAt(Ex);
	    Ex = GR.nextInt(characters.length());
	    d = d + characters.charAt(Ex);
	    Ex = GR.nextInt(characters.length());
	    e = e + characters.charAt(Ex);
	    Ex = GR.nextInt(characters.length());
	    f = f + characters.charAt(Ex);
	    Ex = GR.nextInt(characters.length());
	    g = g + characters.charAt(Ex);
	    Ex = GR.nextInt(characters.length());
	    h = h + characters.charAt(Ex);
	    Ex = GR.nextInt(characters.length());
	    i = i + characters.charAt(Ex);
	    Ex = GR.nextInt(characters.length());
	    j = j + characters.charAt(Ex);
	    Ex = GR.nextInt(characters.length());
	    k = k + characters.charAt(Ex);
	    Ex = GR.nextInt(characters.length());
	    l = l + characters.charAt(Ex);
	    Ex = GR.nextInt(characters.length());
	    m = m + characters.charAt(Ex);
	    Ex = GR.nextInt(characters.length());
	    n = n + characters.charAt(Ex);
	    Ex = GR.nextInt(characters.length());
	    o = o + characters.charAt(Ex);
	    Ex = GR.nextInt(characters.length());
	    p = p + characters.charAt(Ex);
	    Ex = GR.nextInt(characters.length());
	    q = q + characters.charAt(Ex);
	    Ex = GR.nextInt(characters.length());
	    r = r + characters.charAt(Ex);
	    Ex = GR.nextInt(characters.length());
	    s = s + characters.charAt(Ex);
	    Ex = GR.nextInt(characters.length());
	    t = t + characters.charAt(Ex);
	    Ex = GR.nextInt(characters.length());
	    u = u + characters.charAt(Ex);
	    Ex = GR.nextInt(characters.length());
	    v = v + characters.charAt(Ex);
	    Ex = GR.nextInt(characters.length());
	    w = w + characters.charAt(Ex);
	    Ex = GR.nextInt(characters.length());
	    x = x + characters.charAt(Ex);
	    Ex = GR.nextInt(characters.length());
	    y = y + characters.charAt(Ex);
	    Ex = GR.nextInt(characters.length());
	    z = z + characters.charAt(Ex);
	    
	    String PW = "";
	    String PW8 = a+b+c+d+e+f+g+h;
	    String PW9 = a+b+c+d+e+f+g+h+i;
	    String PW10 = a+b+c+d+e+f+g+h+i+j;
	    String PW11 = a+b+c+d+e+f+g+h+i+j+k;
	    String PW12 = a+b+c+d+e+f+g+h+i+j+k+l;
	    String PW13 = a+b+c+d+e+f+g+h+i+j+k+l+m;
	    String PW14 = a+b+c+d+e+f+g+h+i+j+k+l+m+n;
	    String PW15 = a+b+c+d+e+f+g+h+i+j+k+l+m+n+o;
	    String PW16 = a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p;
	    String PW17 = a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p+q;
	    String PW18 = a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p+q+r;
	    String PW19 = a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p+q+r+s;
	    String PW20 = a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t;
	    String PW21 = a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t+u;
	    String PW22 = a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t+u+v;
	    String PW23 = a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t+u+v+w;
	    String PW24 = a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t+u+v+w+x;
	    String PW25 = a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t+u+v+w+x+y;
	    String PW26 = a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t+u+v+w+x+y+z;
	    
	    while(true){
			String Input = JOptionPane.showInputDialog(null, "How many characters do you want for your PW? 8-26");
			int NMR = Integer.valueOf(Input);
				if(NMR == 8){
					PW = PW + PW8;
					break;
				}else if(NMR == 9){
					PW = PW + PW9;
					break;
				}else if(NMR == 10){
					PW = PW + PW10;
					break;
				}else if(NMR == 11){
					PW = PW + PW11;
					break;
				}else if(NMR == 12){
					PW = PW + PW12;
					break;
				}else if(NMR == 13){
					PW = PW + PW13;
					break;
				}else if(NMR == 14){
					PW = PW + PW14;
					break;
				}else if(NMR == 15){
					PW = PW + PW15;
					break;
				}else if(NMR == 16){
					PW = PW + PW16;
					break;
				}else if(NMR == 17){
					PW = PW + PW17;
					break;
				}else if(NMR == 18){
					PW = PW + PW18;
					break;
				}else if(NMR == 19){
					PW = PW + PW19;
					break;
				}else if(NMR == 20){
					PW = PW + PW20;
					break;
				}else if(NMR == 21){
					PW = PW + PW21;
					break;
				}else if(NMR == 22){
					PW = PW + PW22;
					break;
				}else if(NMR == 23){
					PW = PW + PW23;
					break;
				}else if(NMR == 24){
					PW = PW + PW24;
					break;
				}else if(NMR == 25){
					PW = PW + PW25;
					break;
				}else if(NMR == 26){
					PW = PW + PW26;
					break;
			}else{
				JOptionPane.showMessageDialog(null, "You need to pick between 8 and 26.");
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