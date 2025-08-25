package util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class UIUtil {
	
	public static void initStyle() {
		UIManager.put("defaultFont", new FontUIResource("맑은 고딕", Font.PLAIN, 12));
		UIManager.put("OptionPane.background", Color.white);
		UIManager.put("Panel.background", Color.white);
	}
	
	public static ImageIcon getImageIcon(String path, int width, int height) {
        return new ImageIcon(new ImageIcon(path.replaceAll("/Project", ".")).getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
    }
	
	public static boolean mes(boolean b, String message) {
		if(b)
			JOptionPane.showMessageDialog(null, message, "정보", JOptionPane.INFORMATION_MESSAGE);
		return b;
	}

	public static boolean errMes(boolean b, String message) {
		if(b)
			JOptionPane.showMessageDialog(null, message, "경고", JOptionPane.ERROR_MESSAGE);
		return b;
	}
	
	public static void mes(String message) {
		JOptionPane.showMessageDialog(null, message, "정보", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void errMes(String message) {
		JOptionPane.showMessageDialog(null, message, "경고", JOptionPane.ERROR_MESSAGE);
	}	
}
