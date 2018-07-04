
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class StudentTable extends JFrame {
    
    private Container c;
    private JLabel titleLabel,fnLabel,lnLabel,phLabel,gpLabel;
    private JTextField fnTf,lnTf,phTf,gpTf;
    private JButton addButton,updateButton,deleteButton,clearButton;
    
    StudentTable (){
    initComponents();
    
    } 
    
    public void initComponents(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(780,690);
    this.setLocationRelativeTo(null);
    this.setTitle("Student Table");
    
    c=this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.CYAN);
    
    Font font=new Font("Arial",Font.BOLD,16);
    
    titleLabel=new JLabel("Student Registration");
    titleLabel.setFont(font);
    titleLabel.setBounds(140,10,250,50);
    c.add(titleLabel);
    
    fnLabel=new JLabel("First Name ");
    fnLabel.setBounds(10,80,140,30);
    fnLabel.setFont(font);
    c.add(fnLabel);
    
    fnTf=new JTextField();
    fnTf.setBounds(110,80,200,30);
    fnTf.setFont(font);
    c.add(fnTf);
    
    addButton=new JButton("Add");
    addButton.setBounds(400,80,100,30);
    addButton.setFont(font);
    c.add(addButton);
    
    lnLabel=new JLabel("Last Name");
    lnLabel.setBounds(10,130,150,30);
    lnLabel.setFont(font);
    c.add(lnLabel);

    lnTf=new JTextField();
    lnTf.setBounds(110,130,200,30);
    lnTf.setFont(font);
    c.add(lnTf);
    
    updateButton=new JButton("Update");
    updateButton.setBounds(400,130,100,30);
    updateButton.setFont(font);
    c.add(updateButton);
    
    
    
    phLabel=new JLabel("Phone");
    phLabel.setBounds(10,180,150,30);
    phLabel.setFont(font);
    c.add(phLabel);

    phTf=new JTextField();
    phTf.setBounds(110,180,200,30);
    phTf.setFont(font);
    c.add(phTf);
    
    deleteButton=new JButton("Delete");
    deleteButton.setBounds(400,180,100,30);
    deleteButton.setFont(font);
    c.add(deleteButton);
    
    
    
    gpLabel=new JLabel("GPA  ");
    gpLabel.setBounds(10,230,150,30);
    gpLabel.setFont(font);
    c.add(gpLabel);

    gpTf=new JTextField();
    gpTf.setBounds(110,230,200,30);
    gpTf.setFont(font);
    c.add(gpTf);
    
    clearButton=new JButton("Clear");
    clearButton.setBounds(400,230,100,30);
    clearButton.setFont(font);
    c.add(clearButton);
    
    }
    
    
    
    
    public static void main(String[] args) {
        StudentTable frame=new StudentTable();
        frame.setVisible(true);
    }
    
}

