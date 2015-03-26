
 
 
import javax.swing.*;

public class Eve {
	
	private static void  createAndShowGUI(){
		
		EveFrame mainframe = new EveFrame();
		mainframe.setVisible(true);
		}
	
    
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
				createAndShowGUI();
            }
        });
        
    }
}

