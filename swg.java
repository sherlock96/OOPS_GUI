import javax.swing.*;
import java.awt.event.*;  
import java.awt.*;          

class A extends JPanel  
{
public void paintComponent(Graphics g)
{
	super.paintComponent(g);   					//JVM dependent
	g.drawString("hi",100,150);
}



}

class B extends JFrame  
{

public static void main(String []args)
{
	A f=new A();
	f.setVisible(true);
	//f.setTitle("Panel");
	//f.setSize(600,600);
	B f1=new B();
	f1.setVisible(true);
	f1.setTitle("Frame");
	f1.setSize(600,600);
	f1.add(f);	

	f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  	  
	
}
}
