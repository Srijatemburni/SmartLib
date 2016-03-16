package com.lib;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import javax.swing.text.MaskFormatter;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class Forgotpwd extends javax.swing.JFrame {
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JButton jButton1;
	private JButton jButton2;
	private JLabel jLabel4;
	private JFormattedTextField jFormattedTextField1;
	private JTextField jTextField3;
	private JTextField jTextField1;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Forgotpwd inst = new Forgotpwd();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public Forgotpwd() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("Name");
				jLabel1.setBounds(94, 103, 117, 19);
				jLabel1.setForeground(new java.awt.Color(255,255,255));
				jLabel1.setFont(new java.awt.Font("Algerian",0,16));
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Phone Number");
				jLabel2.setBounds(94, 166, 117, 19);
				jLabel2.setForeground(new java.awt.Color(255,255,255));
				jLabel2.setFont(new java.awt.Font("Algerian",0,16));
			}
			{
				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("Email-id");
				jLabel3.setBounds(94, 229, 117, 19);
				jLabel3.setForeground(new java.awt.Color(255,255,255));
				jLabel3.setFont(new java.awt.Font("Algerian",0,16));
			}
			{
				jTextField1 = new JTextField();
				getContentPane().add(jTextField1);
				jTextField1.setBounds(237, 107, 172, 23);
			}
			{
				jTextField3 = new JTextField();
				getContentPane().add(jTextField3);
				jTextField3.setBounds(237, 227, 172, 23);
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("Submit");
				jButton1.setBounds(267, 327, 112, 36);
				jButton1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						try {
							jButton1ActionPerformed(evt);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});
			}
			{
				MaskFormatter mf= new MaskFormatter("##########");
				jFormattedTextField1 = new JFormattedTextField(mf);
				getContentPane().add(jFormattedTextField1);
				jFormattedTextField1.setBounds(237, 164, 172, 23);
			}
			{
				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("jLabel4");
				jLabel4.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/t5.jpg")));
				jLabel4.setBounds(1, -2, 908, 577);
			}
			{
				jButton2 = new JButton();
				getContentPane().add(jButton2);
				jButton2.setText("Go to Admin Page");
				jButton2.setBounds(497, 231, 168, 21);
				jButton2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton2ActionPerformed(evt);
					}
				});
			}
			pack();
			this.setSize(1300, 750);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	private void jButton2ActionPerformed(ActionEvent evt) {
		System.out.println("jButton2.actionPerformed, event="+evt);
		//TODO add your code for jButton2.actionPerformed
		
		AdminPage obj=new AdminPage();
		obj.setVisible(true);
		this.dispose();
		
		
		}
	private void jButton1ActionPerformed(ActionEvent evt) throws Exception {
		System.out.println("jButton1.actionPerformed, event="+evt);
		//TODO add your code for jButton1.actionPerformed
		
		String name= jTextField1.getText();
		String num= jFormattedTextField1.getText();
		String emailid=jTextField3.getText();
		Dbcon.retrievePassword(name,num,emailid);
		jTextField1.setText("");
		jTextField3.setText("");
		jFormattedTextField1.setText("");
		
		
	}

}