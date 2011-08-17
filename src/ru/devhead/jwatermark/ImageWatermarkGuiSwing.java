package ru.devhead.jwatermark;

import java.awt.event.KeyEvent;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

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

		JLabel sourceImageLabel = new JLabel("Source image:");
		JLabel watermarkImageLabel = new JLabel("Watermark image:");
		JLabel watermarkTypeLabel = new JLabel("Watermark image:");
		
		JTextField sourceImagePath = new JTextField();
		JTextField watermarkPath = new JTextField();
		
		

		JButton browseSourceButton = new JButton("Browse");
		JButton browseWatermarkButton = new JButton("Browse");
		JButton saveButton = new JButton("Save");

		JComboBox watermarkTypeCombo = new JComboBox(new DefaultComboBoxModel(new String[]{"Repeat","Left Top","Right Top","Center","Left Bottom","Rigth Bottom"}));


		JPanel panel = new javax.swing.JPanel();
		
		GroupLayout layout = new GroupLayout(panel);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		panel.setLayout(layout);
		layout.setHorizontalGroup(
				layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(sourceImageLabel)
						.addComponent(watermarkImageLabel)
						.addComponent(watermarkTypeLabel))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(sourceImagePath)
						.addComponent(watermarkPath)
						.addComponent(watermarkTypeCombo)
						.addComponent(saveButton))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(browseSourceButton)
						.addComponent(browseWatermarkButton)));
				
		layout.setVerticalGroup(
				layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(sourceImageLabel)
						.addComponent(sourceImagePath)
						.addComponent(browseSourceButton))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(watermarkImageLabel)
						.addComponent(watermarkPath)
						.addComponent(browseWatermarkButton))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(watermarkTypeLabel)
						.addComponent(watermarkTypeCombo))
				.addComponent(saveButton)						
				);
				

		
		setJMenuBar(menuBar);
		setContentPane(panel);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		pack(); // Adjusting size

	}

}
