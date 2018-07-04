
package showmessage;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;


public class WindowListenerDemo extends JFrame {
    private Container c;
    
    WindowListenerDemo(){
    initComponents();
    
    }
    public void initComponents(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setBounds(100,100,500,500);
    this.setTitle("WidowListener Demo");
    
    
    c=this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.CYAN);
    
    
    this.addWindowListener(new WindowListener (){
        @Override
        public void windowOpened(WindowEvent e) {
            System.out.println("WindowOpened");
        }

        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("windowClosing");
        }

        @Override
        public void windowClosed(WindowEvent e) {
            System.out.println("windowClosed");
        }

        @Override
        public void windowIconified(WindowEvent e) {
            System.out.println("windowIconified");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            System.out.println("windowDeiconified");
        }

        @Override
        public void windowActivated(WindowEvent e) {
            System.out.println("windowActivated");
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            System.out.println("windowDeactivated");
        }
    
    
    
    });
    
    
    
    }
    
    
    
    public static void main(String[] args) {
        WindowListenerDemo frame=new WindowListenerDemo();
        frame.setVisible(true);
    }
    
}

