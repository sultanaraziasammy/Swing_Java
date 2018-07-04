package showmessage;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author maudud
 */



public class FrameDemo extends JFrame {
    
    private Container c;
    
    private ImageIcon icon;
    
    
    
     FrameDemo(){
    
    initComponents();
    }
     
     public void initComponents()
             
     {
         
     c=this.getContentPane();
     c.setBackground(Color.CYAN);
     icon=new ImageIcon(getClass().getResource("icon.png"));
     this.setIconImage(icon.getImage());
  
     
     }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
     
        
    FrameDemo frame=new FrameDemo();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300,400);
    //frame.setLocationRelativeTo(null);
    //frame.setLocation(300,50);
    frame.setBounds(200,50,400,300);
    frame.setTitle("Frame Demo");
    // frame.setResizable(false);
        
    }
    
}

