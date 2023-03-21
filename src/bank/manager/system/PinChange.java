package bank.manager.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import javax.swing.*;

public class PinChange extends JFrame implements ActionListener {
	
	JPasswordField pin, repin;
	JLabel text , pintext , repintext;
	JButton change ,back;
	String pinnumber;
	
	public PinChange(String pinnumber) {
		
		this.pinnumber = pinnumber;
		
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 =i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0,0,900,900);
		add(image);
		
		text = new JLabel("Change your pin");
		text.setForeground(Color.white);
		text.setFont(new Font("System" , Font.BOLD , 16));
		text.setBounds(250 , 200 , 500 , 25);
		image.add(text);
		
		pintext = new JLabel("new pin");
		pintext.setForeground(Color.white);
		pintext.setFont(new Font("System" , Font.BOLD , 16));
		pintext.setBounds(165 , 320 , 180 , 20);
		image.add(pintext);
		
		pin = new JPasswordField();
		pin.setFont(new Font("Raleway" , Font.BOLD , 25));
		pin.setBounds(330 , 320 , 180 ,25);
		image.add(pin);
		
		repintext = new JLabel("Re-Enter new pin");
		repintext.setForeground(Color.white);
		repintext.setFont(new Font("System" , Font.BOLD , 16));
		repintext.setBounds(165 , 370 , 180 , 20);
		image.add(repintext);
		
		repin = new JPasswordField();
		repin.setFont(new Font("Raleway" , Font.BOLD , 25));
		repin.setBounds(330 , 370 , 180 ,25);
		image.add(repin);
		
		
		change = new JButton("CHANGE");
		change.setBounds(355 , 485  , 150 , 30);
		change.addActionListener(this);
		image.add(change);
		
		back = new JButton("BACK");
		back.setBounds(355 , 520  , 150 , 30);
		back.addActionListener(this);
		image.add(back);
		
		
		setSize(900 , 900);
		setLocation(300, 0);
		 setUndecorated(true);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==change) {
			
			try {
					String npin =pin.getText();
					String rpin = repin.getText();
					
					if(!npin.equals(rpin)) {
						JOptionPane.showInternalMessageDialog(null, "ENTER PIN DOESN'T MATCH");
						return;
					}
					
					if(npin.equals("")) {
						JOptionPane.showInternalMessageDialog(null, "ENTER PIN");
						return;
					}
					
					if(rpin.equals("")) {
						JOptionPane.showInternalMessageDialog(null, "RE-ENTER PIN ");
						return;
					}
					
					Conn c1 = new Conn();
					String q1 = "update bank set pin = '"+rpin+"' where pin = '"+pinnumber+"' ";
	                String q2 = "update login set pinnumber = '"+rpin+"' where pinnumber = '"+pinnumber+"' ";
	                String q3 = "update signupthree set pinnumber = '"+rpin+"' where pinnumber = '"+pinnumber+"' ";

	                c1.s.executeUpdate(q1);
	                c1.s.executeUpdate(q2);
	                c1.s.executeUpdate(q3);

	                JOptionPane.showMessageDialog(null, "PIN changed successfully");
	                
	                setVisible(false);
	                new Transactions(rpin).setVisible(true);
			} 
		
			catch (Exception e) {
				e.printStackTrace();
				System.out.println(e);
			}
		
		}else {
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new PinChange("").setVisible(true);
	}

}
