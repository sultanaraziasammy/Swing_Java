
package showmessage;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JComboBox;
import javax.swing.JFrame;


public class ComboBoxDemo extends JFrame {
    private Container c;
    private JComboBox cb;
    private String[] proLanguage={"c","c++","java","php","python"};
            
    
    ComboBoxDemo(){
    initComponents();
    
    }
    
    
    public void initComponents(){
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setBounds(100,100,500,500);
    this.setTitle("ComboBox Demo");
    
    
    c=this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.CYAN);
    
    
    cb=new JComboBox(proLanguage);
    cb.setBounds(50,150,100,50);
    cb.setEditable(true);
   // cb.setSelectedIndex(3);
   cb.setSelectedItem("java");
   cb.addItem("Fortran");
   cb.removeItem("Fortran");
   cb.removeItemAt(1);
   //cb.removeAllItems();
    c.add(cb);
    
    
       // System.out.println("Total item = "+cb.getItemCount());
    
    }
    
    public static void main(String[] args) {
        
        ComboBoxDemo frame=new ComboBoxDemo();
        frame.setVisible(true);
        
    }
    
}

