package marshmallows.view;

import javax.swing.JOptionPane;

public class PopupMonsterDisplay
{
	public class PopupDisplay
	{
		public void showResponse (String wordsFromSomewhere)
		{
			JOptionPane.showMessageDialog(null, wordsFromSomewhere);
		}
	

	public String grabAnswer(String stuff)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, stuff);
		
		return answer;
	}
}
}
