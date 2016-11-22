import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class A extends JFrame
{

JLabel l1;

A()
{
	Container c=this.getContentPane();
	l1=new JLabel("Submit");	
	c.add(l1);	

}

	public static void main(String []args)
{
	A f1=new A();
	f1.setVisible(true);
	f1.setTitle("Panel");
	f1.setSize(600,600);
	//f1.add(f);	

	f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  	  
	
}	

}


