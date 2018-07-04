
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class MultiplicationTable extends JFrame {
    private Container c;
    private JLabel imgLabel, textLabel;
    private JTextArea ta;
    private JTextField tf;
    private JButton clearButton;
    private ImageIcon img;
    private Font f;
    private Cursor cursor;
    
    
    MultiplicationTable(){
    c=this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.ORANGE);
    f=new Font ("Tahoma",Font.BOLD,20);
    img=new ImageIcon(getClass().getResource("images2.jpg"));
    
    imgLabel=new JLabel(img);
    imgLabel.setBounds(20,10,img.getIconWidth(),img.getIconHeight());
    c.add(imgLabel);
    
    
    textLabel=new JLabel("Enter any number: ");
    textLabel.setBounds(20,200,250,50);
    textLabel.setForeground(Color.BLUE);
    textLabel.setFont(f);
    c.add(textLabel);
    
    
    tf=new JTextField();
    tf.setBounds(230,200,90,50);
    tf.setBackground(Color.GREEN);
    tf.setFont(f);
    tf.setHorizontalAlignment(JTextField.CENTER);
    c.add(tf);
    
    
    cursor=new Cursor(Cursor.HAND_CURSOR);
    
    clearButton=new JButton ("Clear");
    clearButton.setBounds(230,260,90,50);
    clearButton.setBackground(Color.GREEN);
    clearButton.setCursor(cursor);
    clearButton.setFont(f);
    c.add(clearButton);
    
    
    ta=new JTextArea();
    ta.setBounds(20,350,300,300);
    ta.setFont(f);
    ta.setBackground(Color.GREEN);
    c.add(ta);
    
    
    tf.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e)
   
    {
        
        ta.setText("");
    int num=Integer.parseInt(tf.getText());
    
    for(int i=1;i<10; i++){
    int result=num*i;
    
    
    String r=String.valueOf(result);
    String n=String.valueOf(num);
    String incr=String.valueOf(i);
    
    
    ta.append(n+"X"+incr+"="+r+"\n");
    
    
    }
    
    
    }
    
    
    
    
    });
    
    
    
    }
    
    
    public static void main(String[] args) {
        
        
        MultiplicationTable frame =new MultiplicationTable();
        frame.setVisible(true);
        frame.setBounds(300,20,360,700);
        frame.setTitle("MultiplicationTable Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    } 
    
}

