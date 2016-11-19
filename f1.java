import java.awt.*;
import java.awt.event.*;

class f1 extends Frame implements ActionListener
{

Button b1;
Button b2;

Label l1,l2;
TextField t1,t2;

f1()
{
	setLayout(new FlowLayout());
	b1= new Button("Submit");
	b2= new Button("Close");

	l1=new Label("Name:",Label.LEFT);
	t1=new TextField(25);
	l2=new Label("Pswd",Label.LEFT);
	t2=new TextField(25);

	b1.addActionListener(this);
	b2.addActionListener(this);
	
	this.add(l1);
	this.add(t1);
	this.add(l2);
	this.add(t2);
	this.add(b1);
	this.add(b2);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
	f2 f11 = new f2();
	f11.setVisible(true);
	f11.setSize(300,600);
}
else
{
System.exit(0);
}
}
public static void main(String []args)
	{
		f1 f= new f1();
		f.setVisible(true);
	
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
