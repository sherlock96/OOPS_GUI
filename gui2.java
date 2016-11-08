import java.awt.*;
import java.awt.Graphics.*;
import java.awt.event.*;

class A extends Frame implements ActionListener
{
	Button b1,b2,b3;
	A()
	{
		setLayout(null);
		b1=new Button("Blue");
		b2=new Button("Green");
		b3=new Button("White");
		
		b1.setBounds(50,100,100,50);
		b2.setBounds(150,100,100,50);
		b3.setBounds(250,100,100,50);
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
	     this.setBackground(Color.BLUE);
	    if(ae.getSource()==b2)
	     this.setBackground(Color.GREEN);
	    if(ae.getSource()==b3)
	     this.setBackground(Color.WHITE);
	}
	
	public static void main(String []args)
{
	A f= new A();
	f.setSize(800,800);
        f.setVisible(true);
 
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
	
	