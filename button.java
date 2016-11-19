import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics.*;

class A extends Frame implements ActionListener
{
Button b1,b2,b3;
A()
{
	setLayout(null);
	b1=new Button("YELLOW");
	b2=new Button("RED");
	b3=new Button("GREEN");
	
	this.add(b1);
	this.add(b2);
	this.add(b3);

	b1.setBounds(100,150,60,50);
	b2.setBounds(160,150,60,50);
	b3.setBounds(220,150,60,50);

	b1.addActionListener(this);
	b2.addActionListener(this);	
	b3.addActionListener(this);		
}

public static void main(String []args)
{
	A f= new A();
	f.setVisible(true);
	f.setSize(100,100);
	f.setSize(300,600);

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

public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b1)
	this.setBackground(Color.YELLOW);
if(ae.getSource()==b2)
	this.setBackground(Color.RED);
if(ae.getSource()==b3)
	this.setBackground(Color.GREEN);
}


	}
