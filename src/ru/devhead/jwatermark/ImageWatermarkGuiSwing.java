package ru.devhead.jwatermark;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ImageWatermarkGuiSwing extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JTextField sourceImagePath;
	JTextField watermarkPath;
	JPanel panel;
	
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
		
		sourceImagePath = new JTextField();
		watermarkPath = new JTextField();
		
		JButton browseSourceButton = new JButton("Browse");
		browseSourceButton.addActionListener(new ActionListener() {
			@Override
	        public void actionPerformed(ActionEvent e) {
	        	JFileChooser chooser = new JFileChooser();
	            FileNameExtensionFilter filter = new FileNameExtensionFilter(
	                "*.jpg, *.jpeg, *.gif, *.png", "jpg", "gif", "jpeg", "png");
	            chooser.setFileFilter(filter);
	            int returnVal = chooser.showOpenDialog(panel);
	            if(returnVal == JFileChooser.APPROVE_OPTION) {
	       	        	sourceImagePath.setText(chooser.getSelectedFile().getAbsolutePath());
	            }


	            }
	    });
		
		JButton browseWatermarkButton = new JButton("Browse");
		browseWatermarkButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
	        	JFileChooser chooser = new JFileChooser();
	            FileNameExtensionFilter filter = new FileNameExtensionFilter(
	                "*.jpg, *.jpeg, *.gif, *.png", "jpg", "gif", "jpeg", "png");
	            chooser.setFileFilter(filter);
	            int returnVal = chooser.showOpenDialog(panel);
	            if(returnVal == JFileChooser.APPROVE_OPTION) {
	            	watermarkPath.setText(chooser.getSelectedFile().getAbsolutePath());
	            }
			}
			
		});
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!sourceImagePath.equals("") | !watermarkPath.equals("")) {
					JFileChooser chooser = new JFileChooser();
					FileNameExtensionFilter filter = new FileNameExtensionFilter(
							"*.jpg, *.jpeg", "jpg", "jpeg");
					chooser.setFileFilter(filter);
					int returnVal = chooser.showOpenDialog(panel);
					if (returnVal == JFileChooser.APPROVE_OPTION) {
						jwatermark.ImageWatermark.markImage(new File(sourceImagePath.getText()), new File(watermarkPath.getText()), chooser.getSelectedFile(), jwatermark.Constant.MARK_RIGHT_BOTTOM);
					}
				} else {
					
				}
			}
		});

		JComboBox watermarkTypeCombo = new JComboBox(new DefaultComboBoxModel(new String[]{"Repeat","Left Top","Right Top","Center","Left Bottom","Rigth Bottom"}));


		panel = new javax.swing.JPanel();
		
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
						.addComponent(sourceImagePath, 330, GroupLayout.DEFAULT_SIZE, 600)
						.addComponent(watermarkPath, 330, GroupLayout.DEFAULT_SIZE, 600)
						.addComponent(watermarkTypeCombo, 330, GroupLayout.DEFAULT_SIZE, 600)
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
