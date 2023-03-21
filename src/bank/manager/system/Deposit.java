package bank.manager.system;

//import java.awt.Color;
//import java.awt.Font;
//import java.awt.Image;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
////import java.sql.Date;
//import java.util.*;
//
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.text.JTextComponent;

public class Deposit extends JFrame implements ActionListener{
	JButton deposit , back;
	JTextField amount;
	String pinnumber;
	public Deposit(String pinnumber) {
		
		this.pinnumber=pinnumber;
		
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);
		
		JLabel text = new JLabel("Enter the amount you want to deposit ");
		text.setForeground(Color.white);
		text.setFont(new Font("System",Font.BOLD ,16));
		text.setBounds(185, 300, 400, 20);
		image.add(text);
		
		amount = new JTextField();
		amount.setFont(new Font("Raleway" , Font.BOLD , 22));
		amount.setBounds(185, 350, 290, 25);
		image.add(amount);
		
		deposit = new JButton("Deposit");
		deposit.setBounds(355 , 485, 150, 30);
		deposit.addActionListener(this);
		image.add(deposit);
		
		back = new JButton("Back");
		back.setBounds(355 , 518, 150, 30);
		back.addActionListener(this);
		image.add(back);
		
		setSize(900 ,900);
		setLocation(300, 0);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == deposit) {
			String number =amount.getText();
			 Date date = new Date();
			if(number.equals("")) {
				JOptionPane.showMessageDialog(null, "Please Enter the amount you want to deposit");
			}else {
				try {
					Conn conn = new Conn();
					String q1 = "insert into bank values('"+pinnumber+"','"+date+"','Deposit', '"+number+"')";
					conn.s.executeUpdate(q1);
					JOptionPane.showInternalMessageDialog(null, "Rs. "+number  +" Deposit Successfully");
					
					setVisible(false);
					new Transactions(pinnumber).setVisible(true);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
			
		}else if(ae.getSource()== back) {
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		}
	}

	public static void main(String[] args) {
		new Deposit("");
	}

}
	
	

