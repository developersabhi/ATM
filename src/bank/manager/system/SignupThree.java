package bank.manager.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class SignupThree extends JFrame implements ActionListener{
	
	JRadioButton r1, r2, r3, r4;
	JCheckBox c1, c2 , c3 , c4 , c5 , c6 , c7;
	JButton submit, cancel;
	String formno;
	
	public SignupThree(String formno) {
		this.formno =formno;
		
		setLayout(null);
		
		JLabel l1 = new JLabel("Page 3: Account Details");
		l1.setFont(new Font("Raleway" , Font.BOLD ,22));
		l1.setBounds(280, 40, 400, 40);
		add(l1);
		
		JLabel type = new JLabel("Account Type");
		type.setFont(new Font("Raleway" , Font.BOLD ,22));
		type.setBounds(100, 140, 200, 30);
		add(type);
		
		r1 = new JRadioButton("Saving Account");
//		r1 = new JRadioButton("Fixed Deposite Account");
		r1.setFont(new Font("Raleway",Font.BOLD, 16));
		r1.setBackground(Color.white);
		r1.setBounds(100, 180, 250, 20);
		add(r1);
		
		r2 = new JRadioButton("Current Account");
		r2.setFont(new Font("Raleway",Font.BOLD, 16));
		r2.setBackground(Color.white);
		r2.setBounds(400, 220, 250, 20);
		add(r2);
		
//		r3 = new JRadioButton("Saving Account");
		r3 = new JRadioButton("Fixed Deposite Account");
		r3.setFont(new Font("Raleway",Font.BOLD, 16));
		r3.setBackground(Color.white);
		r3.setBounds(100, 220, 250, 20);
		add(r3);
		
		r4 = new JRadioButton("Recurring Account");
		r4.setFont(new Font("Raleway",Font.BOLD, 16));
		r4.setBackground(Color.white);
		r4.setBounds(400, 180, 250, 20);
		add(r4);
		
		ButtonGroup groupaccount = new ButtonGroup();
		groupaccount.add(r1);
		groupaccount.add(r2);
		groupaccount.add(r3);
		groupaccount.add(r4);
		
		JLabel card = new JLabel("Card Number: ");
		card.setFont(new Font("Raleway" , Font.BOLD ,22));
		card.setBounds(100, 260, 200, 30);
		add(card);
		
		JLabel number = new JLabel("XXXX-XXXX-XXXX-1234");
		number.setFont(new Font("Raleway" , Font.BOLD ,22));
		number.setBounds(300, 260, 250, 30);
		add(number);
		
		JLabel carddetail = new JLabel("Your 16 digit Card Number");
		carddetail.setFont(new Font("Raleway" , Font.BOLD ,12));
		carddetail.setBounds(100, 300, 350, 20);
		add(carddetail);
		
		JLabel pin = new JLabel("PIN: ");
		pin.setFont(new Font("Raleway" , Font.BOLD ,22));
		pin.setBounds(100, 340, 200, 30);
		add(pin);
		
		JLabel pnumber = new JLabel("XXXX");
		pnumber.setFont(new Font("Raleway" , Font.BOLD ,22));
		pnumber.setBounds(300, 340, 250, 30);
		add(pnumber);
		
		JLabel pindetail = new JLabel("Your 4 Digit password");
		pindetail.setFont(new Font("Raleway" , Font.BOLD ,12));
		pindetail.setBounds(100, 380, 400, 20);
		add(pindetail);
		
		
		JLabel services = new JLabel("Services Required: ");
		services.setFont(new Font("Raleway" , Font.BOLD ,22));
		services.setBounds(100, 420, 200, 30);
		add(services);
		
		c1 = new JCheckBox("ATM CARD");
		c1.setBackground(Color.white);
		c1.setFont(new Font("Raleway" ,Font.BOLD, 16));
		c1.setBounds(100, 470, 150, 30);
		add(c1);
		
		c2 = new JCheckBox("Internate Banking");
		c2.setBackground(Color.white);
		c2.setFont(new Font("Raleway" ,Font.BOLD, 16));
		c2.setBounds(350, 470, 200, 30);
		add(c2);
		
		c3 = new JCheckBox("Mobile Banking");
		c3.setBackground(Color.white);
		c3.setFont(new Font("Raleway" ,Font.BOLD, 16));
		c3.setBounds(100, 520, 150, 30);
		add(c3);
		
		c4 = new JCheckBox("Email  & SMS  Alerts");
		c4.setBackground(Color.white);
		c4.setFont(new Font("Raleway" ,Font.BOLD, 16));
		c4.setBounds(350, 520, 200, 30);
		add(c4);
		
		c5 = new JCheckBox("Cheque Book");
		c5.setBackground(Color.white);
		c5.setFont(new Font("Raleway" ,Font.BOLD, 16));
		c5.setBounds(100, 570, 150, 30);
		add(c5);
		
		c6 = new JCheckBox("E-statement");
		c6.setBackground(Color.white);
		c6.setFont(new Font("Raleway" ,Font.BOLD, 16));
		c6.setBounds(350, 570, 200, 30);
		add(c6);
		
		c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best  of my knowledge");
		c7.setBackground(Color.orange);
		c7.setFont(new Font("Raleway" ,Font.BOLD, 12));
		c7.setBounds(100, 620, 600, 30);
		add(c7);
		
		submit = new JButton("Submit");
		submit.setBackground(Color.black);
		submit.setForeground(Color.white);
		submit.setFont(new Font("Raleway", Font.BOLD, 14));
		submit.setBounds(220, 670, 100, 30);
		submit.addActionListener(this); // action tag
		add(submit);
		
		cancel = new JButton("Cancel");
		cancel.setBackground(Color.black);
		cancel.setForeground(Color.white);
		cancel.setFont(new Font("Raleway", Font.BOLD, 14));
		cancel.setBounds(420, 670, 100, 30);
		cancel.addActionListener(this); // action tag
		add(cancel);
		
		getContentPane().setBackground(Color.BLUE);
		
		setSize(850, 820);
		setLocation(350, 0);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()== submit) {
			String  accountType = null;
			if(r1.isSelected()) {
				accountType ="Saving Account";
			}else if(r2.isSelected()){
				accountType= "Fixed Deposit Account";
			}else if(r3.isSelected()){
				accountType= "Current Account";
			}else if(r4.isSelected()){
				accountType= "Reccuring Deposit Account";
			}
			
			Random random = new Random();
			String cardnumber ="" + Math.abs(( random.nextLong()% 90000000L) + 5040936000000000L);
			String pinnumber ="" + Math.abs( (random.nextLong()% 9000L) + 1000L);
			
			String facility ="";
			if(c1.isSelected()){ 
	            facility = facility + " ATM Card";
	        }
	        if(c2.isSelected()){ 
	            facility = facility + " Internet Banking";
	        }
	        if(c3.isSelected()){ 
	            facility = facility + " Mobile Banking";
	        }
	        if(c4.isSelected()){ 
	            facility = facility + " EMAIL & SMS Alerts";
	        }
	        if(c5.isSelected()){ 
	            facility = facility + " Cheque Book";
	        }
	        if(c6.isSelected()){ 
	            facility = facility + " E-Statement";
	        }
			
	        try {
	        	if(accountType.equals("")) {
	        		JOptionPane.showMessageDialog(null, "Account Type is required");
	        	}else {
	        		Conn conn = new Conn();
	        		 String q1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";  
	                    String q2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
	                    
	                    conn.s.executeUpdate(q1);
	                    conn.s.executeUpdate(q2);
	                    
	                    JOptionPane.showMessageDialog(null, "Card Number: "+ cardnumber + "\n Pin: "+pinnumber);
	        	
	                    setVisible(false);
	                    new Deposit(pinnumber).setVisible(false);;
                 
	        	}
	        	
	        	
	        }catch (Exception e) {
	        	System.out.println(e);
	        }
			
			
		}else if(ae.getSource() == cancel) {
			setVisible(false);
			new Login().setVisible(true);
		}
	}
	
	
	public static void main(String[] args) {
		 new SignupThree("");
	}

}
