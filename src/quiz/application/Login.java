
package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
    
    JButton rules,back;
    JTextField tfname;
    
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/Login.jpeg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,500,500);
        add(image);
        
        JLabel heading=new JLabel("Simple Minds");
        heading.setBounds(650,60,300,45);
        heading.setFont(new Font("Viner Hnad ITC",Font.BOLD,30));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel name=new JLabel("Enter your name");
        name.setBounds(680,150,200,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(Color.BLUE);
        add(name);
        
        tfname=new JTextField();
        tfname.setBounds(600,200,300,25);
        tfname.setFont(new Font("Times new Roman",Font.BOLD,15));
        add(tfname);
        
        rules=new JButton("Rules");
        rules.setBounds(600,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back=new JButton("Back");
        back.setBounds(780,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
        setSize(1000,500);
        setLocation(100,100);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name=tfname.getText();
            setVisible(false);
            new Rules(name);
}
        else if(ae.getSource()==back){
          setVisible(false);
        }
    }
    public static void main(String[] args){
        new Login();
    }
}
