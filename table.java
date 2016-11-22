import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class A extends JFrame
{

JTable jt;

	A()
	{
	setLayout(new FlowLayout());
	Container c=this.getContentPane();
	String data[][]={{"1","2","3"},{"4","5","6"},{"7","8","9"}};
	String obj[]={"YO","YES","NO"};
	jt=new JTable(data,obj);
	ScrollPane s=new ScrollPane();
	s.add(jt);
	c.add(s);
	}

	public static void main(String []args)
	{
	A f=new A();
	f.setVisible(true);	
	f.setSize(300,300);
	
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}
}
