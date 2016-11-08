import java.awt.*;
import java.awt.Graphics.*;
import java.awt.event.*;

class A extends Frame implements ItemListener
{
	Checkbox c1,c2,c3;
	A()
	{
		setLayout(new FlowLayout());
		c1=new Checkbox("A",false);
		c2=new Checkbox("B",false);
		c3=new Checkbox("C",false);
		c1.setBounds(50,50,50,50);
		c2.setBounds(100,50,50,50);
		c3.setBounds(150,50,50,50);
		this.add(c1);
		this.add(c2);
		this.add(c3);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		
	}
	
	public static void main(String []args)
{
	A f= new A();
	f.setVisible(true);
	f.setSize(100,100);
	f.setSize(500,500);

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

public void paint(Graphics p)
{
	p.drawString("curr: ",60,100);
	p.drawString("A: "+c1.getState(),110,100);
	p.drawString("B: "+c2.getState(),160,100);
	p.drawString("C: "+c3.getState(),210,100);
}

public void itemStateChanged(ItemEvent ie)
{
	repaint();
}


}



