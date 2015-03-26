

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


public class EveFrame extends JFrame{
	private EveSplash splash;
	private JTabbedPane tabbedPane = new JTabbedPane();
	private EveComp  panCompression;
	private EveAbout panAbout;
	private JLabel  lblBanner;
	
	
	void centerWindow(){
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        
        setLocation((screensize.width / 2) - (getSize().width / 2),
                    (screensize.height / 2) - (getSize().height / 2));
		}
	
	EveFrame(){
		 setVisible(false);
		 splash = new EveSplash(this);  //uncomment on release
		 splash.doSplashStuff();
		 
		 
		 setTitle("EVE - Compress Better, Compress Faster!");
		 setSize(425,390);
		 centerWindow();
		 setLayout(new BorderLayout(5,5));

		 lblBanner = new JLabel("PRPZip",SwingConstants.CENTER);
		 lblBanner.setSize(400,25);
		 lblBanner.setFont(new Font("Monotype Corsiva",Font.BOLD & Font.ITALIC,42));
		 
		 
		 panCompression = new EveComp(this,false);
		 panAbout = new EveAbout(this,false);
		 
		 tabbedPane.addTab("Compressor/Decompressor",panCompression);
		 tabbedPane.addTab("About PRPZip",panAbout);
		 
		 
		 //The following line enables to use scrolling tabs.
         tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
         
		
		 getContentPane().add(lblBanner,BorderLayout.NORTH );
		 getContentPane().add(tabbedPane,BorderLayout.CENTER);
        
         setResizable(false);

		 setVisible(true);
		 
		}
		
	
	
		    
    protected void processWindowEvent(WindowEvent e) {

        if (e.getID() == WindowEvent.WINDOW_CLOSING) {
        
        	//System.exit(0); //remove on release
        	
            int exit = JOptionPane.showConfirmDialog(this, "Are you sure?","Confirm Exit?",JOptionPane.YES_NO_OPTION);
            if (exit == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
            
        } else {

            super.processWindowEvent(e);
        }
    }
    
    }

