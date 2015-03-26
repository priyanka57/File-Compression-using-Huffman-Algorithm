
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class EveAbout extends JPanel {
	JLabel splashImage;
	
	EveAbout(JFrame parent,boolean isDblBuf){
		super(isDblBuf);
		
		setLayout(new BorderLayout());
        splashImage = new JLabel(new ImageIcon(getClass().getResource(
                   "resources/images/eve_about.jpg")));
        
                   
        add(splashImage, BorderLayout.CENTER);
        
        splashImage.setBorder(BorderFactory.createLineBorder(
                          new Color(75, 75, 75)));

		}
		
		
} 

