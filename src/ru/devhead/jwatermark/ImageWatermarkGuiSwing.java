package ru.devhead.jwatermark;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

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
	
	JPanel panel = new javax.swing.JPanel();
	
    setJMenuBar(menuBar);
	setContentPane(panel);
	setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	pack(); //Adjusting size
	
	}




}
