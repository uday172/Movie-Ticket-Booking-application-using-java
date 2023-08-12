package movie;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class booking extends Thread //implementing thread
{

		public void run()
		{
			available("upcoming");
		}
		
		public void available(String s)
		{
			JFrame f = new JFrame();

			final String img1 = "avatar.jpeg";
			final String img2 = "verayya.jpeg";
			final String img3 = "agent.jpeg";

			 
			JLabel l1 = new JLabel(new ImageIcon(img1));
			l1.setBounds(50,50,500,500);
			f.add(l1);

			JLabel l2 = new JLabel(new ImageIcon(img2));
			l2.setBounds(550,50,500,500);
			f.add(l2);

			JLabel l3 = new JLabel(new ImageIcon(img3));
			l3.setBounds(1050,50,500,500);
			f.add(l3);
			
			f.setSize(600,600);
			f.setLayout(null);
			f.setVisible(true);
		}
}
