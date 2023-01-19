import javax.swing.*;
import java.awt.event.*;
import java.awt.*; 
import java.awt.Color;
import java.util.*;
import javax.swing.ImageIcon;

public class MainPage {

	MainPage()
     {

        JFrame frame = new JFrame();
       

        JButton b2 = new JButton();
        b2.setBounds(270,220,200,200);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new Parent();
            	frame.setVisible(false);
               // JOptionPane.showMessageDialog(frame, "Calendar clicked");
            }
        });

        JButton b3 = new JButton();
        b3.setBounds(20,220,200,200);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	//new Laptop();
            	frame.setVisible(false);
                JOptionPane.showMessageDialog(frame, "Clock clicked");
            }
        });

        JButton b4 = new JButton();
        b4.setBounds(500,220,200,200);
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Contact clicked");
            }
        });

        JButton b5 = new JButton();
        b5.setBounds(20,460,200,200);
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Mail clicked");
            }
        });

        JButton b6 = new JButton();
        b6.setBounds(270,460,200,200);
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Messages clicked");
            }
        });

        JButton b7 = new JButton(new ImageIcon("asus3.png"));
        b7.setBounds(500,460,200,200);
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Phone clicked");
            }
        });
       JLabel l2 = new JLabel("Search here");
	   l2.setBounds(270,155,300,20); 		
		
       JTextField tf1=new JTextField();  
        tf1.setBounds(180,150,300,30);
        JButton b1=new JButton("Search"); 
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(80,80,80));		
        b1.setBounds(500,150,150,30);
        b1.addActionListener( new ActionListener()
        { 
        	public void actionPerformed(ActionEvent e) {  
        
            String pass =tf1.getText();
           
                if(pass.equals("asus"))
    			{
    				frame.setVisible(false);
    				new Page1();
    			}
    			else
    			{
    				//showMessageDialogue("Invalid Username and password!");
    			}
    		}
        	
        	});
        frame.add(b1);
        frame.add(l2);
        frame.add(tf1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
       // frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        //frame.getContentPane().add(BorderLayout.PAGE_START);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.decode("#3F2A1D"));
        frame.setSize(800,800);
        frame.setVisible(true);
        
        }
	public static void main(String[] args) {  
		 
		 //new Profile("Test");
		 //new Dashboard("Test");
		 new MainPage();
		} 
     }
    
