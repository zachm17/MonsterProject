package marshmallows.view;

import javax.swing.JOptionPane;

public class PopupMonsterDisplay
{
	public String grabAnswer(String stuff)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, stuff);
		
		return answer;
	}
}
