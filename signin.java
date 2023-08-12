package signup;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import userdetails.*;

public class signin extends JFrame
{
	JLabel l1,l2,l3,l4,l5;
	JTextField tf1,tf2,tf3;
	JRadioButton rb1,rb2;
	JButton b;
	JPasswordField pf1,pf2;
	public signin()
	{
		l1 = new JLabel("Enter  name :");
		l1.setBounds(100,100,150,30);
		tf1 = new JTextField("");
		tf1.setBounds(250,100,150,30);

		l2 = new JLabel("Enter username :");
		l2.setBounds(100,150,150,30);
		tf2 = new JTextField("");
		tf2.setBounds(250,150,150,30);

		l3 = new JLabel("Enter password :");
		l3.setBounds(100,200,150,30);
		pf1 = new JPasswordField();
		pf1.setBounds(250,200,150,30);

		l4 = new JLabel("confirm password :");
		l4.setBounds(100,250,150,30);
		pf2 = new JPasswordField();
		pf2.setBounds(250,250,150,30);

		l5= new JLabel(new ImageIcon("signimg.png"));
		l5.setBounds(400,20,1200,700);
		add(l5);

		b= new JButton("sign in");
		b.setBounds(100,300,150,30);
		b.addActionListener(new ActionListener()
								{
									public void	actionPerformed(ActionEvent ae)
									{
											String name = tf1.getText();
											String username = tf2.getText();
											String pass1 = new String(pf1.getPassword());
											String pass2 = new String(pf2.getPassword());
											String s="";
											if((name.equals(s))||(username.equals(s))||(pass1.equals(s))||(pass2.equals(s)))
											{
												JOptionPane.showMessageDialog(new signin(),"enter all details");
											}
											else{
													if((pass1).equals(pass2))
													{
													JOptionPane.showConfirmDialog(new signin(),"Are you sore??");
													JOptionPane.showMessageDialog(new signin(),"sign up successful");
													userdetails.user obj1 = new userdetails.user();
													try{
													obj1.ReadData(username,pass1);
													}
													catch(Exception e){}
													}
													else
													{
														JOptionPane.showMessageDialog(new signin(),"password mismatch");
													}
											}
									}	
								});

		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(tf1);
		add(tf2);
		add(pf1);
		add(pf2);
		add(b);
		setSize(600,600);
		setLayout(null);
	}
}
