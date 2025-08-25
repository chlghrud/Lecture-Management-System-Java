package util;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class BaseFrame extends JFrame{
	
	public JFrame backForm;
	
	public BaseFrame() {
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				backForm.setVisible(true);
			}
		});
		
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				setLocationRelativeTo(null);
			}
		});
		
	}
	
	public void openForm(BaseFrame goForm) {
		goForm.backForm = this;
		setVisible(false);
		goForm.setVisible(true);
	}
	
}
