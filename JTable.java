
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;




public class TableDemo extends JFrame {
    
    private Container c;
    private JLabel label;
    private Font font;
    private JTable table;
    private JScrollPane scroll;
    
    private String[] cols={"ID","Name","GPA"};
    private String[][]rows={
        {"101","suvo","3.33"},
        {"102","sujh","73.33"},
        {"103","suvohhg","38.33"},
        {"104","suvotf","783.33"},
        
         {"101","suvo","3.33"},
        {"102","sujh","73.33"},
        {"103","suvohhg","38.33"},
        {"104","suvotf","783.33"},
        
         {"101","suvo","3.33"},
        {"102","sujh","73.33"},
        {"103","suvohhg","38.33"},
        {"104","suvotf","783.33"},
    
    };
    
    TableDemo(){
    initComponents();
    
    }
    
    public void initComponents(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setBounds(100,100,750,400);
    this.setTitle("Table Demo");
    
    c=this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.CYAN);
    
    font=new Font("Arial",Font.BOLD,22);
    
    
    label=new JLabel("Student Details");
    label.setFont(font);
    label.setBounds(250,20,200,50);
    c.add(label);
    
    table=new JTable(rows,cols);
    table.setSelectionBackground(Color.BLUE);
   // table.setEnabled(false);
    
    scroll=new JScrollPane(table);
    scroll.setBounds(50,80,600,150);
    c.add(scroll);
    
    }
    public static void main(String[] args) {
        TableDemo frame=new TableDemo();
        frame.setVisible(true);
    }
    
}

