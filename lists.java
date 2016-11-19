import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics.*;


class gui3 extends Frame implements ItemListener
{
	List c1;
	int msg[];
	gui3()
	{
		c1 = new List(4,false);
		setLayout(new FlowLayout());
		c1.add("ENG");  // adding to object c1 instead of 'this' which would add to frame
		c1.add("HIN");
		c1.add("TEL");
		c1.add("GUJ");
		c1.add("c");

		this.add(c1);// adding choice to frame 
		c1.addItemListener(this);
		
	}
	
	public  void itemStateChanged(ItemEvent e)
	{
		repaint();
}

public void paint(Graphics g)
{
	msg=c1.getSelectedIndexes();
for(int i=0;i<msg.length;i++)
{
	String s1= c1.getItem(msg[i]);
	g.drawString(s1,100*i+10,40*i+40);
}

}
	public static void main(String []args)
	{
	
	gui3 f= new gui3();
		
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

}
