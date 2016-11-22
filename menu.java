import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class A extends JFrame implements ActionListener
{
	JMenuBar mb;	
	JMenu m1,m2;	
	JMenuItem cu,co,ps;

	A()
	{
	Container c=this.getContentPane();
	mb=new JMenuBar();	
	m1=new JMenu("File:");
	m2=new JMenu("Font:");

	cu=new JMenuItem("Cut");
	co=new JMenuItem("Cut");
	ps=new JMenuItem("Paste");	

	c.add(mb);
	mb.add(m1);
	m1.add(cu);
	m1.add(co);
	m1.add(ps);
	m1.addSeparator();
	m1.add(m2);
	m2.add("A");
	m2.add("B");
	m1.addActionListener(this);	
	m2.addActionListener(this);
	
	}	

	public void actionPerformed(ActionEvent ae)
	{
	 if(m1.isArmed())
 		System.out.println();
	}	

	public static void main(String []args)
	{
	A f=new A();
	f.setVisible(true);	
	f.setSize(300,300);
	
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}

}
