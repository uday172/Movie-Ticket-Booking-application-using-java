import javax.swing.*;
import java.awt.event.*;
import signup.signin;
import userdetails.*;
import java.io.*;
import ticketbooking.TicketBook;


class logDemo extends JFrame
{
	JLabel l1,l2,l3,l4;
	JTextField tf1;
	JPasswordField pf1;
	JButton b,b1;
	logDemo()
	{
		l1=new JLabel("Enter UserName :");
		l1.setBounds(100,100,100,30);
		tf1=new JTextField();
		tf1.setBounds(200,100,200,30);
		l2=new JLabel("Enter Password :");
		l2.setBounds(100,150,100,30);
		pf1=new JPasswordField();
		pf1.setBounds(200,150,200,30);
		b= new JButton("log in");
		b.setBounds(100,200,150,30);
		b.addActionListener(new ActionListener()
						{
								public void actionPerformed(ActionEvent ae)
								{
									userdetails.user obj = new userdetails.user();
									
									try{
									if(obj.verify(tf1.getText(),new String(pf1.getPassword())))
									{
										JOptionPane.showMessageDialog(new logDemo(),"you are logged in...");
										TicketBook tb= new TicketBook();
										tb.setVisible(true);
									}
									else{
										JOptionPane.showMessageDialog(new logDemo(),"enter correct password or username");
									}
									}
									catch(Exception e)
									{	
									}
								}
						});
		l3 = new JLabel("If you are new ? please sign in ");
		l3.setBounds(100,250,400,30);

		l4= new JLabel(new ImageIcon("signimg.png"));
		l4.setBounds(400,20,1200,700);
		add(l4);

		b1 = new JButton("sign up");
		b1.setBounds(100,300,100,30);
		b1.addActionListener(new ActionListener()
						{
								public void actionPerformed(ActionEvent ae)
								{
									signin s= new signin();
									s.setVisible(true);
								}
						});

		add(l1);
		add(tf1);
		add(l2);
		add(pf1);
		add(b);
		add(l3);
		add(b1);
		setLayout(null);
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class login
{
	
	public static void main(String args[])
	{
		new logDemo();
	}
}