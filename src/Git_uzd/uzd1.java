package Git_uzd;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class uzd1 {
	static String failaNosaukums;
	public static void ievadiSk(){
		int cilvSk=0;
		do{
			cilvSk = Integer.parseInt(JOptionPane.showInputDialog("Ievadi cik cilvekiem aprekinat gada vertejumu?"));
			String[] studenti = new String[cilvSk];
		}while(cilvSk<1);
		
		try{
			
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Kluda ierakstot faila!","Kluda",JOptionPane.ERROR_MESSAGE);
		}
		
	}

	public static void main(String[] args) {
		
		String izvele;
		
		do{
			
			izvele = JOptionPane.showInputDialog("1-Ievadit cilveku skaitu kam jaaprekina gada vertejumi | 2-Ievadit kriterijus | 3-Ievadit svaru | 4-Ievadit atzimes | 5-Aprekinat gada vertejumu |stop");
			izvele.toLowerCase();
			
			switch(izvele){
			
			case "1":
				ievadiSk();
				break;
			
			}
			
		}while(!izvele.equals("stop"));
		
	}
}

