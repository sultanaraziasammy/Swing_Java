import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author maudud
 */



public class FrameDemo extends JFrame {
    
    
    
     FrameDemo(){
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300,400);
  //frame.setLocationRelativeTo(null);
  //frame.setLocation(300,50);
  setBounds(200,50,400,300);
  setTitle("Frame Demo");
  setResizable(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
     
        
  FrameDemo frame=new FrameDemo();
  frame.setVisible(true);
 
        
    }
    
}

