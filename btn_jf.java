import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class A extends JFrame implements ActionListener
{
	JButton b1;
	A()
	{
	Container c=this.getContentPane();
	setLayout(new FlowLayout());
	ImageIcon i=new ImageIcon("<Path>");		
	b1=new JButton("Submit",i);
	c.add(b1);	
	b1.addActionListener(this);

	
	}
	
	public void actionPerformed(ActionEvent ae)
	{
	  if(b1.getModel().isSelected())
		setBackground(Color.RED);	
	}
	
	public static void main(String []args)
	{
	A f=new A();	
	f.setVisible(true);
	f.setSize(300,300);

	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  	
	
	}

}


