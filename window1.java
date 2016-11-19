import java.awt.*;
import java.awt.event.*;

class gui1 extends Frame implements ActionListener
{
	Button b1,b2;
	
	Label l1,l2;	
	TextField t1,t2;

	gui1()
	{
		setLayout(new FlowLayout());
		b1=new Button("Submit");
		b2=new Button("Close");

		l1=new Label("Name:",Label.LEFT);
		l2=new Label("Password:",Label.LEFT);

		t1=new TextField(25);
		t2=new TextField(25);
		t2.setEchoChar('*');

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
	 	gui2 f11=new gui2();
	 	f11.setVisible(true);
	 	f11.setSize(300,600);
	 }	
	 else System.exit(0);
	}

	public static void main(String []args)
{
	gui1 f=new gui1();
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