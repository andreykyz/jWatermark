package jwatermark;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;


public class Main {

	public static void main(String[] args) {
//		new ImageWatermarkGui().run();
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
