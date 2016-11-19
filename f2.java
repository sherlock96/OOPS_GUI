import java.awt.*;
import java.awt.event.*;

public class f2 extends Frame implements ActionListener
{

Button b1;
Label l1,l2,l3;
TextField t1,t2,t3;
f2()
{
b1= new Button("Back");
l1= new Label("id:");
l2= new Label("Name:");
l3=new Label("Sal:");
t1= new TextField(25);
t2= new TextField(25);
t3= new TextField(25);

setLayout(new FlowLayout());

this.add(l1);
this.add(t1);
this.add(l2);
this.add(t2);
this.add(l3);
this.add(t3);
this.add(b1);

b1.addActionListener(this);
}

public void actionPerformed(ActionEvent a)
{
dispose();   // to close. no need to call using object
}


public static void main(String []args)
{
	/*f2 f= new f2();
	f2.setVisible(true);
	f2.setSize(300,600);

	f2.addWindowListener(
	new WindowAdapter()
{
	public void windowClosing(WindowEvent we)
{
System.exit(0);
}
}


);*/


}
}
