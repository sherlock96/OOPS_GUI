import java.awt.*;
import java.awt.event.*;

class gui2 extends Frame implements ActionListener
{
	Button b1;
	
	Label l1,l2,l3;	
	TextField t1,t2,t3;

	gui2()
	{
		setLayout(new FlowLayout());
		b1=new Button("Back");
		
		l1=new Label("ID:",Label.LEFT);
		l2=new Label("Name:",Label.LEFT);
		l2=new Label("Salary:",Label.LEFT);

		t1=new TextField(25);
		t2=new TextField(25);
		t3=new TextField(25);

		b1.addActionListener(this);
		
		this.add(l1);
		this.add(t1);
		this.add(l2);
		this.add(t2);
		this.add(l3);
		this.add(t3);
		this.add(b1);
		
	}

	public void actionPerformed(ActionEvent ae)
	{
	 dispose();
	}

	public static void main(String []args)
{
// 	gui1 f=new gui1();
// 	f.setVisible(true);
// 	f.setSize(300,600);

// 	f.addWindowListener(
// 		new WindowAdapter()
// {
// 	public void windowClosing(WindowEvent we)
// {
// System.exit(0);
// }
// }
// );

}





}