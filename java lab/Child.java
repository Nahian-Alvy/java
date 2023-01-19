import javax.swing.*;
import java.awt.event.*;
import java.awt.*; 
import java.awt.Color;
import java.util.*;
public class Child extends Parent
{
	Child()
	{
		
	     JFrame f = new JFrame();
		 JLabel l1;
		 JButton b1,b3;
		 JComboBox cb4;
	     f.add(cb4);
	     f.add(b3);
	     f.add(l1);
	     f.add(b1);
	     //f.add(b2);
         f.setLayout(null);
	     f.setSize(800,800);
	     f.setVisible(true);
	    
	}

}