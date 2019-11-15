package _04_knock_knock;

import javax.swing.JOptionPane;

public class KnockItOff {
	
	public static void main(String[] args) {
		int Continuer = 0;
		String [] options = {"Who's there?", "I'm lame and don't do knock knock jokes."};
		int Starter = JOptionPane.showOptionDialog(null, "Knock Knock", null, JOptionPane.ERROR_MESSAGE, JOptionPane.DEFAULT_OPTION, null, options, "Who's there?");
		//JOptionPane.showMessageDialog(null, Starter);
		if (Starter == 0) {
			for (int bannanasLasted = 0; Continuer == 0; bannanasLasted++) {
				String [] options2 = {"Bannana who?", "I grow weary. Who in the nine (possibly offensive word) are you?"};
				Continuer = JOptionPane.showOptionDialog(null, "Bannana.", null, JOptionPane.ERROR_MESSAGE, JOptionPane.DEFAULT_OPTION, null, options2, "Bannana who?");
				if (Continuer == 1) {
					String name = "";
					for (int i=0; i<bannanasLasted; i++) {
						name = name + " Bannana";
					}
					
					JOptionPane.showMessageDialog(null, "My name is" + name + ". You lasted " + bannanasLasted + " bannanas!" );
				}
				else if (bannanasLasted >= 120) {
					
					String [] options3 = {"What?"};
					JOptionPane.showOptionDialog(null, "It's thyme.", null, JOptionPane.ERROR_MESSAGE, JOptionPane.DEFAULT_OPTION, null, options3, "What?");
					JOptionPane.showMessageDialog(null, "It's thyme to grow. Leatuce leaf.");
					break;
				}
			}
		}
	}

}
