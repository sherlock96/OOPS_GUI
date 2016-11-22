import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class A extends JFrame
{
	JColorChooser cj;
	A()
	{
	Container c=this.getContentPane();
	cj=new JColorChooser();
	cj.showDialog(this,"Select",Color.red);
	c.add(cj);
	
	}

	public static void main(String []args)
	{
	A f=new A();
	f.setVisible(true);
	f.setSize(300,300);
	
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  		
	}
	
}	
