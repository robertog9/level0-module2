import javax.swing.JOptionPane;

public class Horoscope {


public static void main(String[] args) {
	
	String name = JOptionPane.showInputDialog("What is your star sign? ");
	if (name.equals("Aries")) {
	 JOptionPane.showMessageDialog(null, "Grab opportunities in your work life today, The Moon has left behind strong energy for this.");
	
}	else if (name.equals("Taurus")) {
	JOptionPane.showMessageDialog(null,"As The Moon enters your house today youll notice something odd in a group situation, look closer.");

}	else if (name.equals("Gemini")){
	JOptionPane.showMessageDialog(null, "Check in with your work goals and ambitions today and see if things need altering and adjusting.");

}	else if (name.equals("You can put your financial plans into action today, you have the energy to push forward.")) {
	
	
	
}
}
}