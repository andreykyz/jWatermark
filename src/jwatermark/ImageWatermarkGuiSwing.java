package jwatermark;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ImageWatermarkGuiSwing extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	ImageWatermarkGuiSwing() {
		
	JMenuItem miExit = new JMenuItem("Exit");
	JMenuItem miAbout = new JMenuItem("About");
	
	JMenu mFile = new JMenu("File");
	mFile.setMnemonic(KeyEvent.VK_F);
	mFile.add(miExit);
	
	JMenu mHelp = new JMenu("Help");
	mHelp.setMnemonic(KeyEvent.VK_H);
	mHelp.add(miAbout);
	
	JMenuBar menuBar = new JMenuBar();
	menuBar.add(mFile);
	menuBar.add(mHelp);
	
	setJMenuBar(menuBar);
	pack();
	
	}




}
