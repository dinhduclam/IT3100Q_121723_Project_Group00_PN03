package GUI;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Button extends JButton{
	public Button(ActionListener a, String text){
		setText(text);
		setContentAreaFilled(false);
		addActionListener(a);
	}
	public Button(ActionListener a, String text, ImageIcon icon){
		setText(text);
		setContentAreaFilled(false);
		addActionListener(a);
		setIcon(icon);
	}
}
