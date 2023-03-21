package bank.manager.system;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.*;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame implements ActionListener{
	
	JButton login,singup, clear;
	JTextField cardTextField ;
	JPasswordField pinTextField;
	
	 Login(){
		 
		 
		 setTitle("Automatic Teller Machine");// frame title
		 setLayout(null);// default layout null
		 
		 ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
		 Image i2 =i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		 ImageIcon i3 = new ImageIcon(i2);
		 JLabel laber = new JLabel(i3);
		 laber.setBounds(70, 10, 100, 100); // new layout
		 
		 JLabel text = new JLabel("Welcome to ATM");
		 text.setFont(new Font("Osward" , Font.BOLD, 38));
		 text.setBounds(200 , 40 , 400 , 40);
		 add(text);
		 
		 JLabel cardno = new JLabel("Card No:");
		 cardno.setFont(new Font("Raleway", Font.BOLD, 28));
	     cardno.setBounds(125,150,375,30);
		 add(cardno);
		 
		 cardTextField = new JTextField();
		 cardTextField.setBounds(300, 150, 230, 30);
		 cardTextField.setFont(new Font("Arial",Font.BOLD,14));
		 add(cardTextField);
		 
		 JLabel pin = new JLabel("PIN:");
		 pin.setFont(new Font("Raleway", Font.BOLD, 28));
		 pin.setBounds(125,220,375,30);
		 add(pin);
		 
		 pinTextField = new JPasswordField();
		 pinTextField.setBounds(300, 220, 230, 30);
		 pinTextField.setFont(new Font("Arial",Font.BOLD,14));
		 add(pinTextField);
		 
		 login = new JButton("SIGN IN");
		 login.setBounds(300,300 , 100 ,30);
		 login.setBackground(Color.BLACK);
		 login.setForeground(Color.white);
		 login.addActionListener(this);
		 add(login);
		 
		 clear = new JButton("CLEAR");
		 clear.setBounds(430,300 , 100 ,30);
		 clear.setBackground(Color.BLACK);
		 clear.setForeground(Color.white);
		 clear.addActionListener(this);
		 add(clear);
		 
		 singup = new JButton("SIGN Up");
		 singup.setBounds(370,350 , 100 ,30);
		 singup.setBackground(Color.BLACK);
		 singup.setForeground(Color.white);
		 singup.addActionListener(this);
		 add(singup);
		 
		 getContentPane().setBackground(Color.white);
		 
		 add(laber);
		 
		 setSize(800, 480);//frame witdh hight
		 setVisible(true);// frame visibility
		 setLocation(350, 200);//  fram opne location
		
	 }
	 
	 public void actionPerformed(ActionEvent ae) {
		 if(ae.getSource() == clear) {
			 cardTextField.setText("");
			 pinTextField.setText("");
		 }else if(ae.getSource()== login) {
			 Conn conn =new Conn();
			 String cardnumber = cardTextField.getText();
			 String pinnumber = pinTextField.getText();
			 String query = "select * from login where cardnumber ='"+cardnumber+"'and pinnumber ='"+pinnumber+"'";
			 
			 try {
				  ResultSet rs = conn.s.executeQuery(query);
				  if(rs.next()) {
					  setVisible(false);
					  new Transactions(pinnumber).setVisible(true);;
				  }else {
					  JOptionPane.showMessageDialog(null, "Incorrect Card Number  or PIN ");
				  }
			 }catch (Exception e) {
				 System.out.println(e);
			 }
		 }else if(ae.getSource()== singup) {
			 setVisible(false);
			 new SignupOne().setVisible(true);
		 }
	 }
	 
	 public static void main(String[] args) {
		new Login();
	}
}