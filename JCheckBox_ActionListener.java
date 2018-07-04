/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showmessage;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author maudud
 */
public class JCheckBoxDemo extends JFrame {
    
    private Container c;
    private JCheckBox javaCheckBox, cCheckBox,mysqlCheckBox;
    private ButtonGroup grp;
    private Font f;
    private JLabel label;
    
    JCheckBoxDemo(){
    initComponents();
    
    }
    
    public void initComponents(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,100,500,300);
        this.setTitle("JCheckBox Demo");
        
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        grp=new ButtonGroup();
        f=new Font("Arial",Font.ITALIC+Font.BOLD,18);
        
        javaCheckBox=new JCheckBox("Java");
        javaCheckBox.setBounds(50,100,100,30);
        javaCheckBox.setBackground(Color.CYAN);
        javaCheckBox.setFont(f);
        c.add(javaCheckBox);
        
        cCheckBox=new JCheckBox("C");
        cCheckBox.setBounds(50,130,100,30);
        cCheckBox.setBackground(Color.CYAN);
        //cCheckBox.setSelected(true);
        cCheckBox.setFont(f);
        c.add(cCheckBox);
        
      //  mysqlCheckBox=new JCheckBox("Mysql",true);
        mysqlCheckBox=new JCheckBox("Mysql");
        mysqlCheckBox.setBounds(50,160,100,30);
        mysqlCheckBox.setBackground(Color.CYAN);
        mysqlCheckBox.setFont(f);
        c.add(mysqlCheckBox);
        
        grp.add(javaCheckBox);
        grp.add(cCheckBox);
        grp.add(mysqlCheckBox);
        
        
        label=new JLabel("you haven't selected anything");
        label.setBounds(50,200,300,30);
        label.setFont(f);
        c.add(label);
        
        Handler handler=new Handler();
        javaCheckBox.addActionListener(handler);
        cCheckBox.addActionListener(handler);
        mysqlCheckBox.addActionListener(handler);
    
    
    }
    
    class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
           // if(javaCheckBox.isSelected())
           
           
           if (e.getSource()==javaCheckBox){
                label.setText("you have selected java");
            
            
            }else if(e.getSource()==cCheckBox){
            
             label.setText("you have selected c");
            }
            else{
             label.setText("you have selected mysql");
            
            }
            
        }
    
    
    }
    
    
    public static void main(String[] args) {
        
        JCheckBoxDemo frame=new JCheckBoxDemo();
        frame.setVisible(true);
        
    }
    
}

