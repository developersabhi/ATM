package bank.manager.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import javax.swing.GroupLayout.SequentialGroup;

//import java.sql.*;
//import com.toedter.calendar.JDateChooser;
//import java.util.*;


public class SignupTwo extends JFrame implements ActionListener{
	
	;
	JTextField aadhar , pan;
	JButton next;
	JRadioButton male , female , married , unmarried , other , syes , sno, eyes, eno;
	JComboBox religion, category , income , education , occupation;
	String formno;
	
	
	SignupTwo(String formno){
		this.formno = formno;
		setLayout(null);
		
		setTitle("New Account Application Form - Page 2");
		
		
		
		JLabel additionalDetails = new  JLabel("Page 2: Additional Details ");
		additionalDetails.setFont(new  Font("Raleway", Font.BOLD,22));
		additionalDetails.setBounds(290, 80, 400, 30);
		add(additionalDetails);
		
		
		
		JLabel religionLabel = new  JLabel("Religion: ");
		religionLabel.setFont(new  Font("Raleway", Font.BOLD,22));
		religionLabel.setBounds(100, 140, 200, 30);
		add(religionLabel);
		
		String valReligion[] ={"Hindu", "Muslim", "Sikh" , "Other"};
		religion = new JComboBox(valReligion);
		religion.setBounds(300,140,400,30);
		religion.setBackground(Color.white);
		add(religion);
		

		
		
		JLabel categoryLabel = new  JLabel("Category: ");
		categoryLabel.setFont(new  Font("Raleway", Font.BOLD,22));
		categoryLabel.setBounds(100, 190, 200, 30);
		add(categoryLabel);
		
		String valcategory[]= {"General" , "Sc" , "Obc" , "Sc", "Other"};
		category = new JComboBox(valcategory);
		category.setBounds(300,190,400,30);
		category.setBackground(Color.white);
		add(category);
		
		
		
		
		JLabel dob = new  JLabel("Income: ");
		dob.setFont(new  Font("Raleway", Font.BOLD,22));
		dob.setBounds(100, 240, 200, 30);
		add(dob);
		
		String incomecstegory[] = {"null","<1,50,000","<2,00,000", "<5,00,00" ,"upto 10,00,000"};
		income = new JComboBox(incomecstegory);
		income.setBounds(300,240,400,30);
		income.setBackground(Color.white);
		add(income);
		
		
		
		
		JLabel educationLabel = new  JLabel("Education : ");
		educationLabel.setFont(new  Font("Raleway", Font.BOLD,22));
		educationLabel.setBounds(100, 290, 200, 30);
		add(educationLabel);
		
		
		JLabel qualificationLabel = new  JLabel("Qualification: ");
		qualificationLabel.setFont(new  Font("Raleway", Font.BOLD,22));
		qualificationLabel.setBounds(100, 330, 200, 30);
		add(qualificationLabel);
		
		String educationValues[] = {"Non Graduation" , "Graduation", "Post Graduation" ,"Other"};
		education = new JComboBox(educationValues);
		education.setBounds(300, 310, 400, 30);
		education.setBackground(Color.white);
		add(education);
		
		

		
		
		JLabel occcupationLabel = new  JLabel("Occupation : ");
		occcupationLabel.setFont(new  Font("Raleway", Font.BOLD,22));
		occcupationLabel.setBounds(100, 390, 200, 30);
		add(occcupationLabel);
		
		String occupationValues[] = {"Salaried" , "Self Employ", "Businessman" ,"Student" , "Other"};
		occupation = new JComboBox(educationValues);
		occupation.setBounds(300, 390, 400, 30);
		occupation.setBackground(Color.white);
		add(occupation);
	
		
		
	
		
		JLabel panLabel = new  JLabel("Pan Number: ");
		panLabel.setFont(new  Font("Raleway", Font.BOLD,22));
		panLabel.setBounds(100, 440, 200, 30);
		add(panLabel);
		
		pan = new JTextField();
		pan.setFont(new Font("Raleway" ,Font.BOLD,14));
		pan.setBounds(300,440,400,30);
		add(pan);
		
		JLabel aadharLabel = new  JLabel("Aadhar Number: ");
		aadharLabel.setFont(new  Font("Raleway", Font.BOLD,22));
		aadharLabel.setBounds(100, 490, 200, 30);
		add(aadharLabel);
		
		aadhar = new JTextField();
		aadhar.setFont(new Font("Raleway" ,Font.BOLD,14));
		aadhar.setBounds(300,490,400,30);
		add(aadhar);
		
		JLabel scitizenLabel = new  JLabel("Senior Citizen: ");
		scitizenLabel.setFont(new  Font("Raleway", Font.BOLD,22));
		scitizenLabel.setBounds(100, 540, 200, 30);
		add(scitizenLabel);
		
		syes = new  JRadioButton("Yes");
		syes.setBounds(300, 540, 100, 30);
		syes.setBackground(Color.white);
		add(syes);
		
		sno = new  JRadioButton("No");
		sno.setBounds(450, 540, 100, 30);
		sno.setBackground(Color.white);
		add(sno);

		
		
		ButtonGroup scitizengroup = new ButtonGroup();
		scitizengroup.add(syes);
		scitizengroup.add(sno);
		
		

		
		JLabel eaccountLabel = new  JLabel("Exisiting Account: ");
		eaccountLabel.setFont(new  Font("Raleway", Font.BOLD,22));
		eaccountLabel.setBounds(100, 590, 200, 30);
		add(eaccountLabel);
		
		eyes = new  JRadioButton("Yes");
		eyes.setBounds(300, 590, 100, 30);
		eyes.setBackground(Color.white);
		add(eyes);
		
		eno = new  JRadioButton("No");
		eno.setBounds(450, 590, 100, 30);
		eno.setBackground(Color.white);
		add(eno);

		
		
		ButtonGroup eaccountgroup = new ButtonGroup();
		eaccountgroup.add(eyes);
		eaccountgroup.add(eno);
		
		
//		
//		pincodeTextField = new JTextField();
//		pincodeTextField.setFont(new Font("Raleway" ,Font.BOLD,14));
//		pincodeTextField.setBounds(300,590,400,30);
//		add(pincodeTextField);
		
		JButton next =new JButton("Next");
		next.setBackground(Color.black);
		next.setForeground(Color.white);
		next.setFont(new Font("Raleway" , Font.BOLD , 14));
		next.setBounds(620, 660, 80, 30);
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(Color.WHITE);
		setSize(850,800);
		setLocation(350,10);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		String sreligion = (String) religion.getSelectedItem();
		String scategory =(String) category.getSelectedItem();
		String sincome =(String) income.getSelectedItem();
		String seducation =(String) education.getSelectedItem();
		String soccupation =(String) occupation.getSelectedItem();
		
		
		String span = pan.getText();
		String saadhar =aadhar.getText();
		
		String seniorcitizen = null;
		
		if(syes.isSelected()) {
			seniorcitizen = "Yes";
		}else if(sno.isSelected()){
			seniorcitizen = "No";
		}
		
		String exisitingaccount = null;
		
		if(eyes.isSelected()) {
			exisitingaccount = "Yes";
		}else if(sno.isSelected()) {
			exisitingaccount ="No";
		}
		
		try {
				 Conn c = new Conn();
				 String query =  "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"'"+ ",'"+seniorcitizen+"','"+exisitingaccount+"')";
	                c.s.executeUpdate(query);
	             c.s.executeUpdate(query);
	             
	            // Signup 3 object
	             setVisible(false);
	             new SignupThree(formno).setVisible(true);
			 
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
		
		
	public static void main(String[] args) {
		new SignupTwo("");
	}
}
