package ticketbooking;


import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import userdetails.*;
import movie.booking;

public class TicketBook extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5;
	JTextField tf1,tf2,tf3;
	JRadioButton rb1,rb2;
	JButton b,b1,b2;
	JComboBox cb,cb1;
	JList l;
	public TicketBook()
	{
		super("movie home");
		l1=new JLabel("WELCOME TO MOVIE TICKET BOOKING SYSTEM");
		l1.setBounds(100,100,300,30);
		add(l1);
		
		l2 = new JLabel("Movies Available :");
		l2.setBounds(100,150,150,30);
		add(l2);

		b1 = new JButton("upcoming");
		b1.setBounds(500,100,150,30);
		b1.addActionListener(this);
		add(b1);

		
		String mlist[] = {"ps 1","prince","galodu"};	
	
		l = new JList(mlist);
		l.setBounds(270,150,100,80);
		add(l);

		l3 = new JLabel("Select Movie :");
		l3.setBounds(100,250,100,30);
		add(l3);

		cb = new JComboBox(mlist);
		cb.setBounds(200,250,100,30);
		add(cb);
	
		l4 = new JLabel("select Theator :");
		l4.setBounds(100,300,100,30);
		add(l4);		
		
		String Theator[]={"s-2","amrutha","ashoka","vijaya"};

		cb1 = new JComboBox(Theator);
		cb1.setBounds(200,300,100,30);
		add(cb1);

		l5 = new JLabel("enter no of tickets to be booked :");
		l5.setBounds(100,350,200,30);
		add(l5);
		
		tf1 = new JTextField();
		tf1.setBounds(300,350,100,30);
		add(tf1);

		b = new JButton("Book Tickets");
		b.setBounds(100,400,150,30);
		b.addActionListener(new ActionListener(){
									public void actionPerformed(ActionEvent ae)
									{
										String movie = ""+cb.getSelectedItem();
										String Theator = ""+cb1.getSelectedItem();
										int tickets = Integer.parseInt(tf1.getText());
										int cost = 100*tickets;
										String c = String.valueOf(cost);
										JOptionPane.showMessageDialog(new TicketBook(),"The cost is "+c+"  press ok for paying..........");
										JOptionPane.showInputDialog(new TicketBook(),"enter your credit card no :");
										JOptionPane.showInputDialog(new TicketBook(),"enter the amount :");
										JOptionPane.showMessageDialog(new TicketBook(),tickets+" Tickets booked successfully in "+Theator+" theator for movie "+movie);
									}
								});
		add(b);		

		JLabel l6 = new JLabel(new ImageIcon("movie.jpeg"));
		l6.setBounds(400,100,500,500);
		add(l6);

		this.setSize(600,600);
		this.setLayout(null);
	}

	public void actionPerformed(ActionEvent ae)
	{
			if(ae.getSource()==b1)
			{
				booking obj = new booking();
				obj.start();
			}
	}
}

