package ru.devhead.jwatermark;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
	          UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	      } catch (Exception ex) {
	          ex.printStackTrace();
	      }
			SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	            	new ImageWatermarkGuiSwing().setVisible(true);
	            }
	        });
	}

}
