
package showmessage;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class MouseListenerDemo extends JFrame {
    
    private Container c;
    private JTextField tf;
    private JTextArea ta;
    private JScrollPane scroll;
    
    
    MouseListenerDemo (){
    initComponents();
    
    }
    
    
    public void initComponents(){
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setBounds(100,100,500,500);
    this.setTitle("MouseListener Demo");
    
    
    c=this.getContentPane();
    c.setLayout(null);
    
    
    tf=new JTextField();
    tf.setBounds(20,20,150,50);
    c.add(tf);
    
    ta=new JTextArea();
    
    ta.setBackground(Color.CYAN);
   
    
    
    scroll=new JScrollPane(ta);
    scroll.setBounds(10,80,300,300);
    c.add(scroll);
    
    
    tf.addMouseListener(new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent e) {
            ta.append("Mouse Clicked\n");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            ta.append("Mouse Pressed\n");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            ta.append("Mouse Released\n");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            ta.append("Mouse Entered\n");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            ta.append("Mouse Exited\n");
        }
    
    
    
    });
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    public static void main(String[] args) {
        MouseListenerDemo frame=new MouseListenerDemo();
        frame.setVisible(true);
    }
    
}

