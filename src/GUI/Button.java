package GUI;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Button extends JButton{
	
	public static final int NOMAL_BUTTON = 0;
	public static final int CHOOSE_BUTTON = 1;
	
	public Button(int buttonType, ActionListener a, String text){
		if (buttonType == NOMAL_BUTTON) {
			setContentAreaFilled(false);
		}
		else if (buttonType == CHOOSE_BUTTON) {
			setForeground(SystemColor.info);
			setFont(new Font("Tahoma", Font.PLAIN, 14));
			setBackground(SystemColor.activeCaption);
			setBounds(0, 136, 130, 47);
			setBorder(null);
		}
		setText(text);
		addActionListener(a);
	}
	public Button(int buttonType, ActionListener a, String text, ImageIcon icon){
		if (buttonType == NOMAL_BUTTON) {
			setContentAreaFilled(false);
		}
		else if (buttonType == CHOOSE_BUTTON) {
			setForeground(SystemColor.info);
			setFont(new Font("Tahoma", Font.PLAIN, 14));
			setBackground(SystemColor.activeCaption);
			setBounds(0, 136, 130, 47);
			setBorder(null);
		}
		setText(text);
		addActionListener(a);
		setIcon(icon);
	}
}
