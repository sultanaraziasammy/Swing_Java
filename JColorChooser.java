
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;




public class ColorChosserDemo extends JFrame {
    
    private Container c;
    private JButton bt;
    
    ColorChosserDemo(){
    initComponents();
    
    }
    
    public void initComponents(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setBounds(200,100,400,500);
    this.setBackground(Color.yellow);
    
    c=this.getContentPane();
    c.setLayout(null);
    
    bt=new JButton("Chosse a color");
    bt.setBounds(100,50,150,50);
    c.add(bt);
    
    bt.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            
            Color color=JColorChooser.showDialog(null,"Select a color", Color.yellow);
            c.setBackground(color);
        }
    
    
    
    
    });
    
    }
    
    public static void main(String[] args) {
        ColorChosserDemo frame=new ColorChosserDemo();
        frame.setVisible(true);
    }
    
}

