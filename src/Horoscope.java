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

}	else if (name.equals( "Cancer")){
	JOptionPane.showMessageDialog(null, "Work to be flexible today, amid your strong emotions, and show others you are thoughtful. ");
	
}	else if (name.equals("Leo")) {
	JOptionPane.showMessageDialog(null, "You need to balance your internal energies today and find a way forward with kindness and thought.");
	
}	else if (name.equals("Virgo")) {
	JOptionPane.showMessageDialog(null, "Make sure you have clear air between you and others today and say anything that needs to be said. ");
	
}	else if (name.equals("Libra")) {
	JOptionPane.showMessageDialog(null, "Being determined is great, but dont wander into obsessive thinking to the detriment of other areas of life.");
	
}	else if (name.equals("Scorpio")) {
	JOptionPane.showMessageDialog(null, "When you feel claustrophobic today, whether physically or emotionally, take a break from what makes you feel this way.");
	
}	else if (name.equals("Sagittarius")) {
	JOptionPane.showMessageDialog(null, "To set out a good game plan at work today you need to understand what you want from this.");
	
}	else if (name.equals("Capricorn")) {
	JOptionPane.showMessageDialog(null, "When someone wears a mask or hides who they really are today, you can discover the truth in time.");
	
}	else if (name.equals("Aquarius")) {
	JOptionPane.showMessageDialog(null, "When your unlocked potential is released today this will trigger other things to finally come out too.");
	
}	else if (name.equals("Pisces")) {
	JOptionPane.showMessageDialog(null, "");
}

	
}
}

