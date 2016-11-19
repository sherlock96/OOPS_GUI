import java.awt.*;
import java.awt.event.*;

class A extends Frame implements ActionListener
{
	TextField t1,t2;
	Label l1,l2;
	Button b1;
	A()
	{
	 setLayout(new FlowLayout());
	 b1=new Button("Print Details");
	 t1=new TextField(50);
     t2=new TextField(50);	
	 l1=new Label("NAME:  ",Label.LEFT);	
	 l2=new Label("PASSWORD: ",Label.LEFT);
	 
	 add(l1);
	 add(t1);
	 add(l2);
	 add(t2);
	 add(b1);
	 t2.setEchoChar('*');

	 b1.addActionListener(this);
	 t1.addActionListener(this);
	 t2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		Graphics g=this.getGraphics();
		String s1="Name is "+t1.getText();
		String s2="Password: "+t2.getText();
		g.drawString(s1,200,250);
		g.drawString(s2,300,250);		
	}
	
	public static void main(String []args)
	{
		A f=new A();
		f.setVisible(true);
		f.setSize(500,600);
		
		f.addWindowListener(
		new WindowAdapter()
{
	public void windowClosing(WindowEvent we)
{
System.exit(0);
}
}
);
	}
	
}	
	
	