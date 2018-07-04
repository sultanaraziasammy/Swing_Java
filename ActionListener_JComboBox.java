
package showmessage;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ComboBoxDemo extends JFrame {
    private Container c;
    private JComboBox cb;
    private String[] proLanguage={"c","c++","java","php","python"};
    private JLabel label;
    private JButton btn;
            
    
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
    cb.addItem("Basic");
    //  cb.removeItem("Fortran");
    //  cb.removeItemAt(1);
    //cb.removeAllItems();
    c.add(cb);
    
    btn=new JButton("show");
    btn.setBounds(50,250,80,50);
    c.add(btn);
    
    
    label=new JLabel();
    label.setBounds(160,150,200,50);
    c.add(label);
    
    
       // System.out.println("Total item = "+cb.getItemCount());
       
       btn.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            
            String s=cb.getSelectedItem().toString();
            label.setText("You have selected : "+s);
            
        }
       
       
       });
       
       
    
    }
    
    public static void main(String[] args) {
        
        ComboBoxDemo frame=new ComboBoxDemo();
        frame.setVisible(true);
        
    }
    
}

