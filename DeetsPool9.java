import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.util.*;
import java.sql.*;
import java.lang.*;
import javax.swing.table.DefaultTableModel;
import java .awt.Toolkit;
import java.awt.BorderLayout;
import java.text.*;
import java.awt.print.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


	

class TiFrame extends WelcomeFrame
{
	
	
	JLabel l1,l2,l3,l4;
	JButton bb1;
	
	TiFrame()
	{
		
		setTitle("DEETSPOOL");
		Image img =kit.getImage("Dee17.png");
		//this.setIconImage(logo4.png");
		this.setContentPane(new JLabel(new ImageIcon("D:/java prgms/Dee17.png")));
		setSize(d.width,d.height);
		setLayout(null);
		construct();
		design();
		handleevent();
		
	}
	public void construct()
	{
		
		setSize(d.width,d.height);
		l1=new JLabel("WELCOME  TO  DEETSPOOL-THE DONOR MANAGEMENT SYSTEM");
		l1.setBounds(290,100,1050,35);
		l1.setFont(new Font("Elephant",Font.PLAIN,25));
		l1.setForeground(Color.BLUE);
		
		l2=new JLabel("BY,");
		l2.setBounds(875,600,100,20);
		l2.setFont(new Font("Elephant",Font.PLAIN,25));
		l2.setForeground(Color.RED);
		
		l3=new JLabel("INDHIRA M (202004048)");
		l3.setBounds(875,680,500,20);
		l3.setFont(new Font("Elephant",Font.PLAIN,25));
		l3.setForeground(Color.BLUE);
		
		l4=new JLabel("PRIYADHARSHINI B (202004104)");
		l4.setBounds(875,640,500,20);
		l4.setFont(new Font("Elephant",Font.PLAIN,25));
		l4.setForeground(Color.BLUE);
		
			
		bb1=new JButton("ENTER INTO DEETSPOOL");
		bb1.setBounds(620,380,300,100);
		bb1.setForeground(Color.RED);
		bb1.setFont(new Font("Modern No.20",Font.ITALIC,18));
	}
	public void design()
	{
		//add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(bb1);
		
	}
	public void handleevent()
	{
			bb1.addMouseListener(new MouseAdapter()
			{
				public void mouseClicked(MouseEvent mu)
				{
					bb1.setBackground(Color.GREEN);
					
					WelcomeFrame w1=new WelcomeFrame(3);
					w1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					setVisible(false);
					//w1.setLocation(100,100);
					w1.setSize(d.width,d.height);
					w1.setVisible(true);
					//w1.setVisible(true);
					
				}

			}
			);
		
	}
}
		
	
class WelcomeFrame extends MyFrame1
{
	JButton ba1,bb2,bb3,bb4;
	
	JLabel welcome;
	public int x;
	
	public WelcomeFrame()
	{
		
	}
	public WelcomeFrame(int a)
	{
		Image img =kit.getImage("Dee8.png");
		this.setIconImage(img);
		this.setContentPane(new JLabel(new ImageIcon("D:/java prgms/Dee8.png")));
		
		x=a;
		setTitle("DEETSPOOL");
		setSize(d.width,d.height);
		setLayout(null);
		constructUI();
		designUI();
		handlesevent();
		
	}
	
	
	public void constructUI()
	{
			
		welcome=new JLabel("WELCOME  TO  DEETSPOOL");
		welcome.setBounds(560,50,500,70);
		welcome.setFont(new Font("Elephant",Font.PLAIN,25));
		welcome.setForeground(Color.BLUE);
			
		ba1=new JButton("BECOME A PART OF DEETSPOOL");
		ba1.setBounds(500,280,300,70);
		ba1.setForeground(Color.RED);
		ba1.setFont(new Font("Modern No.20",Font.ITALIC,15));
		
		bb2=new JButton("HELP NEEDED");
		bb2.setBounds(900,280,300,70);
		bb2.setForeground(Color.RED);
		bb2.setFont(new Font("Modern No.20",Font.ITALIC,15));
		
		bb3=new JButton("LOGIN TO YOUR PAGE");
		bb3.setBounds(500,450,300,70);
		bb3.setForeground(Color.RED);
		bb3.setFont(new Font("Modern No.20",Font.ITALIC,15));
		
		bb4=new JButton("ADMIN LOGIN");
		bb4.setBounds(900,450,300,70);
		bb4.setForeground(Color.RED);
		bb4.setFont(new Font("Modern No.20",Font.ITALIC,15));
		
		this.setSize(d.width,d.height);
	}
	public void designUI()
	{
		//add(welcome);
		add(ba1);
		add(bb3);
		add(bb2);
		add(bb4);
		pack();
	}
	public void handlesevent()
	{
		ba1.addMouseListener(new MouseAdapter()//class implements mouselistener
		{
			public void mouseClicked(MouseEvent mu)
			{
				ba1.setBackground(Color.GREEN);
				MyFrame1 jf1=new MyFrame1(x);
				//jf1.setLocation(100,100);
				jf1.setSize(d.width,d.height);
				jf1.setVisible(true);
				setVisible(false);
				//jf1.setVisible(true);
			}

		}
		);
		bb2.addMouseListener(new MouseAdapter()//class implements mouselistener
		{
			public void mouseClicked(MouseEvent mu1)
			{
				bb2.setBackground(Color.GREEN);
				//x=x+1;
				MyFrame1 jf2=new MyFrame1(5);
				jf2.setSize(d.width,d.height);
				//jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setVisible(false);
				//jf2.setVisible(true);
				
			}

		}
		);
		bb3.addMouseListener(new MouseAdapter()//class implements mouselistener
		{
			public void mouseClicked(MouseEvent mu2)
			{
				//bb3.setBackground(Color.GREEN);
				
				MyFrame1 jf3=new MyFrame1(10);
				//jf3.setLocation(100,100);
				jf3.setSize(d.width,d.height);
				
				
			}

		}
		);
		bb4.addMouseListener(new MouseAdapter()//class implements mouselistener
		{
			public void mouseClicked(MouseEvent mu2)
			{
				bb4.setBackground(Color.GREEN);
				
				AdminFrame adm=new AdminFrame();
				//adm.setLocation(100,100);
				adm.setSize(d.width,d.height);
				
				
			}

		}
		);
	}
}


		
class MyFrame1 extends MyFrame2
{

	public String gender,unn,upp;
	public String donarwish;
	public int identity;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,namel,agel,mobnol;	
	JButton submit,back;
	JTextField name,age,email,mobno,bloodgrp,place,username;
	JPasswordField password;
	JComboBox cb1;
	
	ButtonGroup bg1,bg2;

	MyFrame1(){}
	MyFrame1(String un,String up)
	{
		setSize(d.width,d.height);
		setTitle("DEETSPOOL");
		setLayout(null);
		unn=un;
		upp=up;
		constructUI();
		designUI();
		handlesevent();
	
	}
	MyFrame1(int a)
	{
		if(a==5)	
		{
		MyFrame2 jjjf3=new MyFrame2(3);
		//jjjf3.setLocation(100,100);
		jjjf3.setSize(d.width,d.height);

		jjjf3.setVisible(true);
	
		}
		if(a==10)
		{
		MyFrame2 jjf3=new MyFrame2(33);
		jjf3.setSize(d.width,d.height);

		}
		Image img =kit.getImage("Dee16.png");
		this.setIconImage(img);
		this.setContentPane(new JLabel(new ImageIcon("D:/java prgms/Dee16.png")));

		gender=" ";
		setSize(d.width,d.height);
		setTitle("DEETSPOOL");
		setLayout(null);
		constructUI();
		designUI();
		handlesevent();
		identity=0;
	}
	public void constructUI()
	{
		bg1=new ButtonGroup();
		bg2=new ButtonGroup();

		l1=new JLabel("BECOME A PART OF DEETSPOOL");
		l1.setBounds(550,30,600,45);
		l1.setFont(new Font("Elephant",Font.PLAIN,20));



		name=new JTextField();
		name.setBounds(700,100,300,30);
		l3=new JLabel("Enter your Name:");
		l3.setBounds(400,100,200,30);
		l3.setFont(new Font("Constantia",Font.BOLD,18));
		

		age=new JTextField();
		age.setBounds(700,130,300,30);
		l4=new JLabel("Enter your Age:");
		l4.setBounds(400,130,200,30);
		l4.setFont(new Font("Constantia",Font.BOLD,18));
		agel=new JLabel("Invalid character");
		agel.setBounds(1100,130,200,20);
		agel.setFont(new Font("Constantia",Font.BOLD,18));
		agel.setVisible(false);

		bloodgrp=new JTextField();
		bloodgrp.setBounds(700,160,300,30);
		l5=new JLabel("Enter your Blood Group:");
		l5.setBounds(400,160,250,30);
		l5.setFont(new Font("Constantia",Font.BOLD,18));

		place=new JTextField();
		place.setBounds(700,190,300,30);
		l6=new JLabel("Enter your place:");
		l6.setBounds(400,190,300,30);
		l6.setFont(new Font("Constantia",Font.BOLD,18));

		email=new JTextField();
		email.setBounds(700,220,300,30);
		l7=new JLabel("Enter your Email Id:");
		l7.setBounds(400,220,200,30);
		l7.setFont(new Font("Constantia",Font.BOLD,18));

		mobno=new JTextField();
		mobno.setBounds(700,250,300,30);
		l8=new JLabel("Enter your Mobile No:");
		l8.setBounds(400,250,200,30);
		l8.setFont(new Font("Constantia",Font.BOLD,18));

		username=new JTextField();
		username.setBounds(700,300,300,30);
		l11=new JLabel("Enter your UserName:");
		l11.setBounds(400,300,200,30);
		l11.setFont(new Font("Constantia",Font.BOLD,18));

		password=new JPasswordField();
		password.setBounds(700,330,300,30);
		l12=new JLabel("Enter your Password:");
		l12.setBounds(400,330,200,30);
		l12.setFont(new Font("Constantia",Font.BOLD,18));

		l9=new JLabel("Gender:");
		l9.setBounds(400,360,100,30);
		l9.setFont(new Font("Constantia",Font.BOLD,18));

		male=new JCheckBox("MALE");
		male.setBounds(700,360,100,30);
		female=new JCheckBox("FEMALE");
		female.setBounds(800,360,100,30);




		l2=new JLabel("CHOOSE THE FIELD YOU WISH");
		l2.setBounds(600,400,370,30);
		l2.setFont(new Font("Georgia",Font.BOLD,17));

		l10=new JLabel("FROM NOW YOU ARE A PART OF DEETSPOOL!!!!");
		l10.setBounds(550,760,600,20);
		l10.setFont(new Font("Elephant",Font.PLAIN,15));
		l10.setVisible(false);

		cb1=new JComboBox();
		cb1.setBounds(550,450,370,30);

		submit=new JButton("SUBMIT");
		submit.setBounds(700,660,100,30);

		back=new JButton("BACK");
		back.setBounds(700,710,100,30);
		
		donarwish=" ";

	}
	public void designUI()
	{
		bg1.add(male);
		bg1.add(female);
		cb1.addItem("Choose Any One From Below");
		cb1.addItem("blood");
		cb1.addItem("child_orp");
		cb1.addItem("adult_orp");
		cb1.addItem("volunteer");
		cb1.addItem("caretaker");

		add(l1);


		add(name);
		add(l3);
		
		add(age);
		add(l4);
		add(bloodgrp);
		add(l5);
		add(place);
		add(l6);
		add(email);
		add(l7);
		add(mobno);
		add(l8);

		add(l9);
		add(male);
		add(female);

		add(l2);


		add(l10);
		add(username);
		add(password);
		add(l11);
		add(cb1);
		add(l12);
		
		//add(namel);
		add(agel);
		


		add(submit);
		add(back);

		pack();
	}
	public void handlesevent()
	{
		male.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ae)
			{
				if(male.isSelected())
				{
					gender="Male";
				}
				else
				{
					gender=" ";
				}
			}
		}
		);
		female.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ae)
			{
				if(female.isSelected())
				{
					gender="Female";
				}
				else
				{
					gender=" ";
				}
			}
		}
		);
		

	back.addMouseListener(new MouseAdapter()//class implements mouselistener
	{
		public void mouseClicked(MouseEvent mu)
		{
			back.setBackground(Color.GREEN);
			WelcomeFrame w2=new WelcomeFrame(6);
			w2.setDefaultCloseOperation(EXIT_ON_CLOSE);
			//w2.setLocation(100,100);
			w2.setSize(d.width,d.height);
			w2.setVisible(true);
			setVisible(false);
			dispose();


		}

	}
	);
	cb1.addItemListener(new ItemListener()
	{
		public void itemStateChanged(ItemEvent ae)
		{
			donarwish=cb1.getSelectedItem().toString();
		}
	}
	);
	submit.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
			try
			{
				st.executeUpdate("delete from dlist where username='"+unn+"' and password='"+upp+"'");
				
				PreparedStatement ps=con.prepareStatement("insert into dlist(name,age,bloodgroup,place,email,mob,username,password,gender,donarwish) values(?,?,?,?,?,?,?,?,?,?)");
				//ps.setString(1,name.getText());
				String na=name.getText();
				if(na.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please enter a your name","ERROR",JOptionPane.ERROR_MESSAGE);
					name.setText("");
				}
				else
				{
					
						ps.setString(1,name.getText());
					
				}
				String age1=age.getText();
				if(age1.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please enter a your age","ERROR",JOptionPane.ERROR_MESSAGE);
					age.setText("");
				}
				else
				{
					if(age1.matches("^[0-9]+$"))
					{
						ps.setString(2,age.getText());
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Please enter a valid age","ERROR",JOptionPane.ERROR_MESSAGE);
						age.setText("");
					}
				}
				
				//ps.setString(3,bloodgrp.getText());
				String bl=bloodgrp.getText();
				if(bl.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please enter a your blood group","ERROR",JOptionPane.ERROR_MESSAGE);
					bloodgrp.setText("");
				}
				else
				{
						ps.setString(3,bloodgrp.getText());
					
				}
				//ps.setString(4,place.getText());
				String pl=place.getText();
				if(pl.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please enter a your place","ERROR",JOptionPane.ERROR_MESSAGE);
					place.setText("");
				}
				else
				{
						ps.setString(4,place.getText());
					
				}
				//ps.setString(5,email.getText());
				String regex="^(.+)@(.+)$";
				Pattern pattern=Pattern.compile(regex);
				Matcher matcher=pattern.matcher(email.getText());
				
				if(matcher.matches())
				{
					ps.setString(5,email.getText());
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Please enter a valid email id","ERROR",JOptionPane.ERROR_MESSAGE);
					email.setText("");
				}
				//ps.setString(6,mobno.getText());
				String m=mobno.getText();
				if(m.matches("^[0-9]+$")&& m.length()==10)
				{
					ps.setLong(6,Long.parseLong(mobno.getText()));
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Please enter a valid mobile number","ERROR",JOptionPane.ERROR_MESSAGE);
					mobno.setText("");
				}
					
				
				
				//ps.setString(7,username.getText());
				String us=username.getText();
				if(us.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please enter a your username","ERROR",JOptionPane.ERROR_MESSAGE);
					username.setText("");
				}
				else
				{
					String query1="select *from dlist where username='"+us+"'";
					Statement stm = con.createStatement();
					ResultSet res = stm.executeQuery(query1);
					if(res.next())
					{
						identity=1;
					}
					if(identity!=1)	
						ps.setString(7,username.getText());
					else
					{
						JOptionPane.showMessageDialog(null,"Username already exits!!!","ERROR",JOptionPane.ERROR_MESSAGE);
						username.setText("");
					}
				}
				//ps.setString(8,password.getText());
				String pa=password.getText();
				if(pa.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please enter a your password","ERROR",JOptionPane.ERROR_MESSAGE);
					password.setText("");
				}
				else
				{
						ps.setString(8,password.getText());
					
				}
				if(gender==" ")
					gender="NULL";
				ps.setString(9,gender);
				
				if(donarwish.equals(" "))
				{
					JOptionPane.showMessageDialog(null,"Please choose your wish!!!","ERROR",JOptionPane.ERROR_MESSAGE);
					//place.setText("");
				}
				else
				{
						ps.setString(10,donarwish);
					
				}
				ps.setString(10,donarwish);
				
				ps.executeUpdate();
				JOptionPane.showMessageDialog(null,"Thank You for becoming a part of DeetsPool");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	});
	}
}
class MyFrame2 extends MyFrame3
{
		
		JLabel l1,l2,l3,l4,l5,l6,l7,l;
		JButton submit,back,tbutton,print;
		JTextField name,age,mob_no,place;
		JCheckBox blood,child_orp,adult_orp,volunteer,caretaker,male,female;
		ResultSet rs;
		ButtonGroup bg1,bg2;
		public String gender,donarreq,req;
		MyFrame2()
		{
			
		}
			
		MyFrame2(int b)
		{
			if(b==33)
			{
				
				MyFrame3 jf3=new MyFrame3(3);
				setVisible(false);
				
				jf3.setVisible(true);
				jf3.setSize(d.width,d.height);
			}
			Image img =kit.getImage("Dee16.png");
			this.setIconImage(img);
			this.setContentPane(new JLabel(new ImageIcon("D:/java prgms/Dee16.png")));
			setVisible(false);
			setTitle("DEETSPOOL");
			setSize(d.width,d.height);
			setLayout(null);
			constructUi();
			designUi();
			handlesevents();
			
		}
		
		public void constructUi()
		{
			print=new JButton("PRINT");
			print.setBounds(650,600,200,30);

			bg1=new ButtonGroup();
			bg2=new ButtonGroup();
			
			l=new JLabel("DEETSPOOL  IS  HERE  TO  LIGHTEN  YOUR  DIFFICULTIES");
			l.setBounds(430,35,800,40);
			l.setFont(new Font("Elephant",Font.PLAIN,20));
			
			
			
			name=new JTextField();
			name.setBounds(700,100,300,30);
			l1=new JLabel("Enter your Name:");
			l1.setBounds(500,100,200,30);
			l1.setFont(new Font("Modern No.20",Font.BOLD,18));
			
			age=new JTextField();
			age.setBounds(700,150,300,30);
			l2=new JLabel("Enter your Age:");
			l2.setBounds(500,150,200,30);
			l2.setFont(new Font("Modern No.20",Font.BOLD,18));
			
			mob_no=new JTextField();
			mob_no.setBounds(700,200,300,30);
			l3=new JLabel("Enter your Mobile No:");
			l3.setBounds(500,200,200,30);
			l3.setFont(new Font("Modern No.20",Font.BOLD,18));
			
			place=new JTextField();
			place.setBounds(700,250,300,30);
			l4=new JLabel("Enter your place:");
			l4.setBounds(500,250,300,30);
			l4.setFont(new Font("Modern No.20",Font.BOLD,18));
			
			l6=new JLabel("Gender:");
			l6.setBounds(500,300,100,30);
			l6.setFont(new Font("Modern No.20",Font.BOLD,18));
			
			male=new JCheckBox("MALE");
			male.setBounds(700,300,100,50);
			female=new JCheckBox("FEMALE");
			female.setBounds(800,300,100,50);
			
			l5=new JLabel("WHAT DO YOU NEED");
			l5.setBounds(600,350,250,30);
			l5.setFont(new Font("Elephant",Font.BOLD,18));
			
			
			blood=new JCheckBox("BLOOD DONAR");
			blood.setBounds(300,400,300,50);
			blood.setFont(new Font("Modern No.20",Font.BOLD,18));
			
			volunteer=new JCheckBox("VOLUNTEER");
			volunteer.setBounds(700,400,300,50);
			volunteer.setFont(new Font("Modern No.20",Font.BOLD,18));
			
			caretaker=new JCheckBox("CARETAKER");
		    caretaker.setBounds(1000,400,300,50);
			caretaker.setFont(new Font("Modern No.20",Font.BOLD,18));
			
			child_orp=new JCheckBox("DONATION FOR CHILD ORPHANAGE");
			child_orp.setBounds(250,450,450,50);
			child_orp.setFont(new Font("Modern No.20",Font.BOLD,18));
			
			adult_orp=new JCheckBox("DONATION FOR OLDAGE HOME");
			adult_orp.setBounds(750,450,450,50);
			adult_orp.setFont(new Font("Modern No.20",Font.BOLD,18));
			

			
			submit=new JButton("SUBMIT");
			submit.setBounds(650,500,200,30);
			l6.setFont(new Font("Modern No.20",Font.BOLD,18));

			back=new JButton("BACK");
			back.setBounds(650,550,200,30);
			
			tbutton=new JButton("BACK");
			tbutton.setBounds(500,500,50,50);
			
			l7=new JLabel("HERE ARE YOUR DETAILS");
			l7.setBounds(500,440,300,30);
			l7.setVisible(false);
			req=" ";			print=new JButton("PRINT");
			print.setBounds(650,600,200,30);

			bg1=new ButtonGroup();
			bg2=new ButtonGroup();
			
			l=new JLabel("DEETSPOOL  IS  HERE  TO  LIGHTEN  YOUR  DIFFICULTIES");
			l.setBounds(430,35,800,40);
			l.setForeground(Color.BLUE);
			l.setFont(new Font("Elephant",Font.PLAIN,20));
			
			name=new JTextField();
			name.setBounds(700,100,300,30);
			l1=new JLabel("Enter your Name:");
			l1.setBounds(500,100,200,30);
			l1.setFont(new Font("Modern No.20",Font.BOLD,18));
			l1.setForeground(Color.RED);
			
			age=new JTextField();
			age.setBounds(700,150,300,30);
			l2=new JLabel("Enter your Age:");
			l2.setBounds(500,150,200,30);
			l2.setFont(new Font("Modern No.20",Font.BOLD,18));
			l2.setForeground(Color.RED);
			
			mob_no=new JTextField();
			mob_no.setBounds(700,200,300,30);
			l3=new JLabel("Enter your Mobile No:");
			l3.setBounds(500,200,200,30);
			l3.setFont(new Font("Modern No.20",Font.BOLD,18));
			l3.setForeground(Color.RED);
			
			place=new JTextField();
			place.setBounds(700,250,300,30);
			l4=new JLabel("Enter your place:");
			l4.setBounds(500,250,300,30);
			l4.setFont(new Font("Modern No.20",Font.BOLD,18));
			l4.setForeground(Color.RED);
			
			l6=new JLabel("Gender:");
			l6.setBounds(500,300,100,30);
			l6.setFont(new Font("Modern No.20",Font.BOLD,18));
			l6.setForeground(Color.RED);
			
			male=new JCheckBox("MALE");
			male.setBounds(700,300,100,50);
			male.setForeground(Color.RED);
			female=new JCheckBox("FEMALE");
			female.setBounds(800,300,100,50);
			female.setForeground(Color.RED);
			
			l5=new JLabel("WHAT DO YOU NEED");
			l5.setBounds(600,350,250,30);
			l5.setFont(new Font("Elephant",Font.BOLD,18));
			l5.setForeground(Color.BLUE);
						
			blood=new JCheckBox("BLOOD DONAR");
			blood.setBounds(300,400,300,50);
			blood.setFont(new Font("Modern No.20",Font.BOLD,18));
			blood.setForeground(Color.RED);
			
			volunteer=new JCheckBox("VOLUNTEER");
			volunteer.setBounds(700,400,300,50);
			volunteer.setFont(new Font("Modern No.20",Font.BOLD,18));
			volunteer.setForeground(Color.RED);
			
			caretaker=new JCheckBox("CARETAKER");
		    caretaker.setBounds(1000,400,300,50);
			caretaker.setFont(new Font("Modern No.20",Font.BOLD,18));
			caretaker.setForeground(Color.RED);
			
			child_orp=new JCheckBox("DONATION FOR CHILD ORPHANAGE");
			child_orp.setBounds(250,450,450,50);
			child_orp.setFont(new Font("Modern No.20",Font.BOLD,18));
			child_orp.setForeground(Color.RED);
			
			adult_orp=new JCheckBox("DONATION FOR OLDAGE HOME");
			adult_orp.setBounds(750,450,450,50);
			adult_orp.setFont(new Font("Modern No.20",Font.BOLD,18));
			adult_orp.setForeground(Color.RED);

			submit=new JButton("SUBMIT");
			submit.setBounds(650,500,200,30);
			l6.setFont(new Font("Modern No.20",Font.BOLD,18));

			back=new JButton("BACK");
			back.setBounds(650,550,200,30);
			
			tbutton=new JButton("BACK");
			tbutton.setBounds(500,500,50,50);
			
			l7=new JLabel("HERE ARE YOUR DETAILS");
			l7.setBounds(500,440,300,30);
			l7.setVisible(false);
			req=" ";
		}
		
		
		public void designUi()
		{
			bg1.add(male);
			bg1.add(female);
			
			bg2.add(blood);
			bg2.add(child_orp);
			bg2.add(adult_orp);
			bg2.add(volunteer);
			bg2.add(caretaker);
			
			add(l);
			add(name);
			add(l1);
			add(age);
			add(l2);
			add(l3);
			add(l4);
			add(l5);
			add(l6);
			add(male);
			add(female);
			add(mob_no);
			add(place);
			add(l4);
			add(blood);
			add(child_orp);
			add(adult_orp);
			add(volunteer);
			add(caretaker);
			add(l7);
			add(submit);
			add(back);
			pack();
		}
		
		public void handlesevents()
		{
			
		
		back.addMouseListener(new MouseAdapter()//class implements mouselistener
		{
				public void mouseClicked(MouseEvent mu)
				{
					back.setBackground(Color.GREEN);
					WelcomeFrame w3=new WelcomeFrame(66);
					w3.setDefaultCloseOperation(EXIT_ON_CLOSE);
					w3.setSize(d.width,d.height);
					w3.setVisible(true);
					setVisible(false);
					dispose();
					
				
				}
				
		}
		);
		male.addItemListener(new ItemListener()
			{
				public void itemStateChanged(ItemEvent ae)
				{
					if(male.isSelected())
					{
						gender="Male";
					}
					else
					{
						gender=" ";
					}
				}
			}
			);
			female.addItemListener(new ItemListener()
			{
				public void itemStateChanged(ItemEvent ae)
				{
					if(female.isSelected())
					{
						gender="Female";
					}
					else
					{
						gender=" ";
					}
				}
			}
			);
			blood.addItemListener(new ItemListener()
			{
				public void itemStateChanged(ItemEvent ae)
				{
					if(blood.isSelected())
					{
						donarreq="Blood";
						req="Blood";
					}
					else
					{
						donarreq=" ";
						req="";
					}
				}
			}
			);
			child_orp.addItemListener(new ItemListener()
			{
				public void itemStateChanged(ItemEvent ae)
				{
					if(child_orp.isSelected())
					{
						donarreq="child_orp";
						req="child_orp";
					}
					else
					{
						donarreq=" ";
						req="";
					}
				}
			}
			);
			adult_orp.addItemListener(new ItemListener()
			{
				public void itemStateChanged(ItemEvent ae)
				{
					if(adult_orp.isSelected())
					{
						donarreq="adult_orp";
						req="adult_orp";
					}
					else
					{
						donarreq=" ";
						req="";
					}
				}
			}
			);
			volunteer.addItemListener(new ItemListener()
			{
				public void itemStateChanged(ItemEvent ae)
				{
					if(volunteer.isSelected())
					{
						donarreq="volunteer";
						req="volunteer";
					}
					else
					{
						donarreq=" ";
						req="";
					}
				}
			}
			);
			caretaker.addItemListener(new ItemListener()
			{
				public void itemStateChanged(ItemEvent ae)
				{
					if(caretaker.isSelected())
					{
						donarreq="Caretaker";
						req="caretaker";
					}
					else
					{
						donarreq=" ";
						req="";
					}
				}
			}
			);
			submit.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent ae)
			{
				try
				{
					
					PreparedStatement ps=con.prepareStatement("insert into hlist(name,age,mob,place,gender,donarRequest) values(?,?,?,?,?,?)");
					String na=name.getText();
					if(na.equals(""))
					{
						JOptionPane.showMessageDialog(null,"Please enter a your name","ERROR",JOptionPane.ERROR_MESSAGE);
						name.setText("");
					}
					else
					{
					
							ps.setString(1,name.getText());
					
					}
					//ps.setString(1,name.getText());
					String age1=age.getText();
					if(age1.equals(""))
					{
						JOptionPane.showMessageDialog(null,"Please enter a your age","ERROR",JOptionPane.ERROR_MESSAGE);
						age.setText("");
					}
					else
					{
						if(age1.matches("^[0-9]+$"))
						{
							ps.setString(2,age.getText());
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Please enter a valid age","ERROR",JOptionPane.ERROR_MESSAGE);
							age.setText("");
						}
					}
					//ps.setString(2,age.getText());
					String m=mob_no.getText();
					if(m.matches("^[0-9]+$")&& m.length()==10)
					{
						ps.setLong(3,Long.parseLong(mob_no.getText()));
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Please enter a valid mobile number","ERROR",JOptionPane.ERROR_MESSAGE);
						mob_no.setText("");
					}
					//ps.setString(3,mob_no.getText());
					String pl=place.getText();
					if(pl.equals(""))
					{
						JOptionPane.showMessageDialog(null,"Please enter a your place","ERROR",JOptionPane.ERROR_MESSAGE);
						place.setText("");
					}
					else
					{
							ps.setString(4,place.getText());
					
					}
					//ps.setString(4,place.getText());
					ps.setString(5,gender);
					if(req.equals(" "))
					{
						JOptionPane.showMessageDialog(null,"Please choose what do you need!!!","ERROR",JOptionPane.ERROR_MESSAGE);
					}
					else
					{
					
							ps.setString(6,donarreq);
					
					}
					ps.setString(6,donarreq);													
					ps.executeUpdate();
			
					ListDeetsPool l1=new ListDeetsPool(req);
					l1.setVisible(true);

					
			
				}catch(Exception e)
				{
					System.out.println(e);
				}
			}
			});
				
			
		}	
			

		
}
class ListDeetsPool extends Connect implements ActionListener
{
	JTable j1;
	JButton b1;
	
	int i=0,j=0,identify=0;
	ListDeetsPool(){}
	ListDeetsPool(String req)
	{
		String columns[] = { "Name","Age","BloodGroup","Place","E-Mail","MobileNO","Gender","Donarwish" };
		String data[][] = new String[100][8];
		setSize(1000,400);
        setLocation(200,100);
		try
        {
			String query1="select *from dlist where donarwish='"+req+"'";
			Statement stm = con.createStatement();
			ResultSet res = stm.executeQuery(query1);
			while (res.next())
			{
					identify=1;
					String name=res.getString("name");
					String age= res.getString("age");
					String bd = res.getString("bloodgroup");
					String place = res.getString("place");
					String email = res.getString("email");
					String mob = res.getString("mob");
					String gen = res.getString("gender");
					String donarwish = res.getString("donarwish");
					data[i][j++] = name;
					data[i][j++] = age+"";
					data[i][j++] = bd;
					data[i][j++] = place;
					data[i][j++] = email;
					data[i][j++] = mob+"";
					data[i][j++] = gen;
					data[i][j++] = donarwish;
					i++;
					j=0;
			}
			j1=new JTable(data,columns);
			if(identify!=1)
					{
					
						JOptionPane.showMessageDialog(null,"NO DONARS AVAILABLE!");
							
					}
		}
		catch(Exception ae){}
		b1=new JButton("print");
		b1.setFont(new Font("Arial",Font.BOLD,22));
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.BLACK);
        add(b1,"South");
		JScrollPane s1=new JScrollPane(j1);
        add(s1);
		b1.addActionListener(this);
	}
	
	ListDeetsPool(String req,int x)
	{
		
		String columns[] = { "Name","Age","BloodGroup","Place","E-Mail","MobileNO","Gender","Donarwish" };
		String data[][] = new String[20][8];
		setSize(1000,400);
        setLocation(200,100);
		try
        {
			String query1="select *from dlist where gender='"+req+"'";
			Statement stm = con.createStatement();
			ResultSet res = stm.executeQuery(query1);
			while (res.next())
			{
					identify=1;
					String name=res.getString("name");
					String age= res.getString("age");
					String bd = res.getString("bloodgroup");
					String place = res.getString("place");
					String email = res.getString("email");
					String mob = res.getString("mob");
					String gen = res.getString("gender");
					String donarwish = res.getString("donarwish");
					data[i][j++] = name;
					data[i][j++] = age+"";
					data[i][j++] = bd;
					data[i][j++] = place;
					data[i][j++] = email;
					data[i][j++] = mob+"";
					data[i][j++] = gen;
					data[i][j++] = donarwish;
					i++;
					j=0;
			}
			j1=new JTable(data,columns);
			if(identify!=1)
					{
					
						JOptionPane.showMessageDialog(null,"NO DONARS AVAILABLE!");
							
					}
		}
		catch(Exception ae){}
		b1=new JButton("print");
		b1.setFont(new Font("Arial",Font.BOLD,22));
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.BLACK);
        add(b1,"South");
		JScrollPane s1=new JScrollPane(j1);
        add(s1);
		b1.addActionListener(this);
	}
	ListDeetsPool(int a)
	{
		
		String columns[] = { "Name","Age","BloodGroup","Place","E-Mail","MobileNO","Gender","Donarwish" };
		String data[][] = new String[20][8];
		setSize(1000,400);
        setLocation(200,100);
		try
        {
			String query1="select *from dlist";
			Statement stm = con.createStatement();
			ResultSet res = stm.executeQuery(query1);
			while (res.next())
			{
					identify=1;
					String name=res.getString("name");
					String age= res.getString("age");
					String bd = res.getString("bloodgroup");
					String place = res.getString("place");
					String email = res.getString("email");
					String mob = res.getString("mob");
					String gen = res.getString("gender");
					String donarwish = res.getString("donarwish");
					data[i][j++] = name;
					data[i][j++] = age+"";
					data[i][j++] = bd;
					data[i][j++] = place;
					data[i][j++] = email;
					data[i][j++] = mob+"";
					data[i][j++] = gen;
					data[i][j++] = donarwish;
					i++;
					j=0;
			}
			j1=new JTable(data,columns);
			if(identify!=1)
					{
					
						JOptionPane.showMessageDialog(null,"NO DONARS AVAILABLE!");
							
					}
		}
		catch(Exception ae){}
		
		b1=new JButton("print");
		b1.setFont(new Font("Arial",Font.BOLD,22));
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.BLACK);
        add(b1,"South");
		JScrollPane s1=new JScrollPane(j1);
        add(s1);
		b1.addActionListener(this);
		
	}
	
	ListDeetsPool(String a,String b)
	{
		
		String columns[] = { "Name","Age","BloodGroup","Place","E-Mail","MobileNO","Gender","Donarwish" };
		String data[][] = new String[20][8];
		setSize(1000,400);
        setLocation(200,100);
		try
        {
			String query1="select *from dlist where username='"+a+"' and password='"+b+"'";
			Statement stm = con.createStatement();
			ResultSet res = stm.executeQuery(query1);
			while (res.next())
			{
					identify=1;
					
					String name=res.getString("name");
					String age= res.getString("age");
					String bd = res.getString("bloodgroup");
					String place = res.getString("place");
					String email = res.getString("email");
					String mob = res.getString("mob");
					String gen = res.getString("gender");
					String donarwish = res.getString("donarwish");
					data[i][j++] = name;
					data[i][j++] = age+"";
					data[i][j++] = bd;
					data[i][j++] = place;
					data[i][j++] = email;
					data[i][j++] = mob+"";
					data[i][j++] = gen;
					data[i][j++] = donarwish;
					i++;
					j=0;
			}
			j1=new JTable(data,columns);
			if(identify!=1)
					{
					
						JOptionPane.showMessageDialog(null,"NO DONARS AVAILABLE!");
							
					}
		}
		catch(Exception ae){}
		
		b1=new JButton("print");
		b1.setFont(new Font("Arial",Font.BOLD,22));
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.BLACK);
        add(b1,"South");
		JScrollPane s1=new JScrollPane(j1);
        add(s1);
		b1.addActionListener(this);
		
	}
	
	ListDeetsPool(int xx,int x,int y)
	{
		
		String columns[] = { "Name","Age","Place","Mobile NO","Gender","Donar Request"};
		String data[][] = new String[100][6];
		setSize(1000,400);
        setLocation(200,100);
		try
        {
			String query1="select *from hlist";
			Statement stm = con.createStatement();
			ResultSet res = stm.executeQuery(query1);
			while (res.next())
			{
					identify=1;
					String name=res.getString("name");
					String age= res.getString("age");
					
					String mob = res.getString("mob");
					String place = res.getString("place");
					String gen = res.getString("gender");
					String donarreq = res.getString("donarRequest");
					data[i][j++] = name;
					data[i][j++] = age+"";
					data[i][j++] = place;
					data[i][j++] = mob+"";
					data[i][j++] = gen;
					data[i][j++] = donarreq;
					i++;
					j=0;
			}
			j1=new JTable(data,columns);
			if(identify!=1)
			{
					
				JOptionPane.showMessageDialog(null,"NO DONARS AVAILABLE!");						
			}
		}
		catch(Exception ae){}
		b1=new JButton("print");
		b1.setFont(new Font("Arial",Font.BOLD,22));
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.BLACK);
        add(b1,"South");
		JScrollPane s1=new JScrollPane(j1);
        add(s1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
    {
        try
        {
           j1.print();
        }
        catch(Exception e){}
    }

}
class MyFrame3 extends ModifyFrame
{
	
	
	JButton submit,back,ttbutton,b1,delete,print,chpass;
	JLabel l1,l2,l3;
	JPasswordField password;
	JTextField username;
	private String uname,upass;
	private int identify=0;
	
	MyFrame3()
	{
		Connect c=new Connect();
	}
	MyFrame3(int z)
	{
			Image img =kit.getImage("Dee16.png");
			this.setIconImage(img);
			this.setContentPane(new JLabel(new ImageIcon("D:/java prgms/Dee16.png")));
			setVisible(false);
			setTitle("DEETSPOOL");
			setSize(d.width,d.height);
			setLayout(null);
			constructui();
			designui();
			handlesevents();
	}
	public void constructui()
	{
		l1=new JLabel("LOGIN TO VIEW YOUR PAGE ");
		l1.setBounds(550,35,500,20);
		l1.setFont(new Font("Elephant",Font.PLAIN,20));
		//l1.setForeground(Color.BLUE);
		
		l2=new JLabel("Enter Your Username:");
		l2.setBounds(350,100,500,20);
		l2.setFont(new Font("Constantia",Font.BOLD,18));
		//l2.setForeground(Color.BLUE);
		
		l3=new JLabel("Enter Your Password:");
		l3.setBounds(350,150,500,20);
		l3.setFont(new Font("Constantia",Font.BOLD,18));
		//l3.setForeground(Color.BLUE);	
		
		username=new JTextField();
		username.setBounds(700,100,300,30);
		
		password=new JPasswordField();
		password.setBounds(700,150,300,30);
		
		submit=new JButton("SUBMIT");
		submit.setBounds(600,200,220,30);
		//submit.setForeground(Color.BLACK);
		submit.setFont(new Font("Modern No.20",Font.ITALIC,15));
		
		b1=new JButton("MODIFY MY ACCOUNT");
		b1.setBounds(600,250,220,30);
		//b1.setForeground(Color.GREEN);
		b1.setFont(new Font("Modern No.20",Font.ITALIC,15));
		
		delete=new JButton("DELETE MY ACCOUNT");
		delete.setBounds(600,300,220,30);
		//delete.setForeground(Color.GREEN);
		delete.setFont(new Font("Modern No.20",Font.ITALIC,15));
		
		chpass=new JButton("CHANGE 	MY PASSWORD");
		chpass.setBounds(600,350,220,30);
		//delete.setForeground(Color.GREEN);
		delete.setFont(new Font("Modern No.20",Font.ITALIC,15));
		
		back=new JButton("BACK");
		back.setBounds(600,400,220,30);
		//back.setForeground(Color.GREEN);
		back.setFont(new Font("Modern No.20",Font.ITALIC,15));
		
		ttbutton=new JButton("BACK");
		ttbutton.setBounds(600,410,50,10);
		
		print=new JButton("PRINT");
		print.setBounds(650,600,200,30);

		
		
		
		
		
	}
	public void designui()
	{
		add(submit);
		add(l1);
		add(l2);
		add(l3);
		add(username);
		add(password);
		add(back);
		add(b1);
		add(delete);
		add(chpass);
	}
	public void handlesevents()
	{
		back.addMouseListener(new MouseAdapter()//class implements mouselistener
		{
				public void mouseClicked(MouseEvent mu)
				{
					back.setBackground(Color.GREEN);
					WelcomeFrame w4=new WelcomeFrame(666);
					w4.setDefaultCloseOperation(EXIT_ON_CLOSE);
					//w4.setLocation(100,100);
					w4.setSize(d.width,d.height);
					w4.setVisible(true);
					setVisible(false);
					dispose();
					
				
				}
				
		}
		);
		submit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent aee)
			{
				
					uname=username.getText();
					upass=password.getText();
					ListDeetsPool l8=new ListDeetsPool(uname,upass);
					l8.setVisible(true);
					
					
			}
		});
		
		delete.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent aee)
			{
				try
				{
				
					un=username.getText();
					up=password.getText();
					
					String str="select *from dlist where username='"+un+"' and password='"+up+"'";
					rs=st.executeQuery(str);
					if(rs.next())
					{
							st.executeUpdate("delete from dlist where username='"+un+"' and password='"+up+"'");
							JOptionPane.showMessageDialog(null,"Deleted");
					
					}
					else
					{
							JOptionPane.showMessageDialog(null,"Invalid Login");
							
					}
					
					
				}catch(Exception ae){}
				
			}
				
			
		});
		
	
					b1.addMouseListener(new MouseAdapter()
					{
					public void mouseClicked(MouseEvent mu)
					{
						b1.setBackground(Color.GREEN);
						ModifyFrame mf=new ModifyFrame(5);
						mf.setSize(d.width,d.height);
						mf.setVisible(true);
						
						dispose();
					
				
					}
				
					}
					);
					
					chpass.addMouseListener(new MouseAdapter()
					{
					public void mouseClicked(MouseEvent m)
					{
						//b1.setBackground(Color.GREEN);
						PassFrame pf=new PassFrame(5);
						pf.setSize(d.width,d.height);
						pf.setVisible(true);
						
						dispose();
					
				
					}
				
					}
					);
				
		
		
	}
}
class PassFrame extends Connect
{
	JButton s,back;
	JPasswordField pasword,cpasword;
	JTextField usname;
	JLabel la2,la3,la4,la5;
	public String un,up;
	PassFrame()
	{
		Connect c1=new Connect();
	}
	PassFrame(int a)
	{
		Image img =kit.getImage("Dee16.png");
		this.setIconImage(img);
		this.setContentPane(new JLabel(new ImageIcon("D:/java prgms/Dee16.png")));
		setVisible(true);
		setSize(d.width,d.height);
		setTitle("DeetsPool");
		setLayout(null);
		constructs();
		designing();
		handle();
	}
	public void constructs()
	{
		s=new JButton("SUBMIT");
		s.setBounds(600,280,200,30);
		//s.setForeground(Color.GREEN);
		s.setFont(new Font("Modern No.20",Font.ITALIC,15));
		
		back=new JButton("BACK");
		back.setBounds(600,230,200,30);
		//back.setForeground(Color.GREEN);
		back.setFont(new Font("Modern No.20",Font.ITALIC,15));
		
		
		la2=new JLabel("Re-Enter Your Username:");
		la2.setBounds(350,80,500,20);
		la2.setFont(new Font("Constantia",Font.PLAIN,18));
		//la2.setForeground(Color.BLUE);
		
		la3=new JLabel("Enter Your New Password:");
		la3.setBounds(350,110,500,20);
		la3.setFont(new Font("Constantia",Font.PLAIN,18));
		//la3.setForeground(Color.BLUE);
		
		la5=new JLabel("Confirm Password:");
		la5.setBounds(350,150,500,20);
		la5.setFont(new Font("Constantia",Font.PLAIN,18));
		
		
		la4=new JLabel("Login Fails");
		la4.setBounds(600,190,500,25);
		la4.setFont(new Font("Constantiat",Font.PLAIN,15));
		la4.setForeground(Color.BLUE);
		la4.setVisible(false);
		
		usname=new JTextField();
		usname.setBounds(700,80,300,30);
		
		pasword=new JPasswordField();
		pasword.setBounds(700,110,300,30);
		
		cpasword=new JPasswordField();
		cpasword.setBounds(700,150,300,30);
	}
	public void designing()
	{
		add(s);
		add(back);
		add(la2);
		add(la3);
		add(la4);
		add(usname);
		add(pasword);
		add(la5);
		add(cpasword);
	}
	public void handle()
	{
		back.addMouseListener(new MouseAdapter()
		{
		 public void mouseClicked(MouseEvent mu)
				{
					back.setBackground(Color.GREEN);
					WelcomeFrame ww=new WelcomeFrame(666);
					ww.setDefaultCloseOperation(EXIT_ON_CLOSE);
					
					ww.setSize(d.width,d.height);
					ww.setVisible(true);
					setVisible(false);
					dispose();
					
				
				}
				
		}
		);
		
		s.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent aee)
			{
				try
				{
				
					String na=usname.getText();
					if(na.equals(""))
					{
						JOptionPane.showMessageDialog(null,"Please enter a your username","ERROR",JOptionPane.ERROR_MESSAGE);
						usname.setText("");
					}
					
					String pa=pasword.getText();
					if(pa.equals(""))
					{
						JOptionPane.showMessageDialog(null,"Please enter a your password","ERROR",JOptionPane.ERROR_MESSAGE);
						pasword.setText("");
					}
					
					String paa=cpasword.getText();
					if(paa.equals(""))
					{
						JOptionPane.showMessageDialog(null,"Please enter a your confirm password","ERROR",JOptionPane.ERROR_MESSAGE);
						cpasword.setText("");
					}
					
					if(pa.equals(paa))
					{
					
						ResultSet r;
						String stt="update dlist set password='"+pa+"' where username='"+na+"'";
						String str="select *from dlist where username='"+na+"'";
						rs=st.executeQuery(str);
						//st.executeUpdate(stt);
						if(rs.next())
						{
							st.executeUpdate(stt);
							JOptionPane.showMessageDialog(null,"Password changed!!!");
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Username not exists!!!");
							
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Password and confirm password Differs!!!","ERROR",JOptionPane.ERROR_MESSAGE);
						cpasword.setText("");
						pasword.setText("");
					}
				}
				catch(Exception e5){}
	
	
			}
		}
		);
	}
}

class ModifyFrame extends Connect
{
	JButton s,back;
	JPasswordField pasword;
	JTextField usname;
	JLabel la2,la3,la4;
	public String un,up;
	
	ModifyFrame()
	{
		Connect c1=new Connect();
	}
	ModifyFrame(int a)
	{
		Image img =kit.getImage("Dee16.png");
		this.setIconImage(img);
		this.setContentPane(new JLabel(new ImageIcon("D:/java prgms/Dee16.png")));
		setVisible(true);
		setSize(d.width,d.height);
		setTitle("DeetsPool");
		setLayout(null);
		constructs();
		designs();
		handle();
		//Connection con;
		//Statement stt;
		//ResultSet rss;
	}
	
	public void designs()
	{
		add(s);
		add(back);
		add(la2);
		add(la3);
		add(la4);
		add(usname);
		add(pasword);
	}
	
	public void constructs()
	{
		s=new JButton("SUBMIT");
		s.setBounds(600,150,200,30);
		//s.setForeground(Color.GREEN);
		s.setFont(new Font("Modern No.20",Font.ITALIC,15));
		
		back=new JButton("BACK");
		back.setBounds(600,190,200,30);
		//back.setForeground(Color.GREEN);
		back.setFont(new Font("Modern No.20",Font.ITALIC,15));
		
		
		la2=new JLabel("Re-Enter Your Username:");
		la2.setBounds(350,80,500,20);
		la2.setFont(new Font("Constantia",Font.PLAIN,18));
		//la2.setForeground(Color.BLUE);
		
		la3=new JLabel("Re-Enter Your Password:");
		la3.setBounds(350,110,500,20);
		la3.setFont(new Font("Constantia",Font.PLAIN,18));
		//la3.setForeground(Color.BLUE);
		
		la4=new JLabel("Login Fails");
		la4.setBounds(600,150,500,25);
		la4.setFont(new Font("Constantiat",Font.PLAIN,15));
		la4.setForeground(Color.BLUE);
		la4.setVisible(false);
		
		usname=new JTextField();
		usname.setBounds(700,80,300,30);
		
		pasword=new JPasswordField();
		pasword.setBounds(700,110,300,30);
	}
	
	public void handle()
	{
		
		
		s.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent aee)
			{
				try
				{
				
					un=usname.getText();
					up=pasword.getText();
					
					String str="select *from dlist where username='"+un+"' and password='"+up+"'";
					rs=st.executeQuery(str);
					if(rs.next())
					{
							setVisible(false);
							//st.executeUpdate("delete from dlist where username='"+un+"' and password='"+up+"'");
							JOptionPane.showMessageDialog(null,"To modify fill up the upcoming form");
							
							MyFrame1 w7=new MyFrame1(un,up);
							w7.setDefaultCloseOperation(EXIT_ON_CLOSE);
							w7.l1.setVisible(false);
							//w7.setLocation(100,100);
							w7.setSize(d.width,d.height);
							w7.setVisible(true);
							setVisible(false);
					
					}
					else
					{
							JOptionPane.showMessageDialog(null,"Invalid Login");
							
					}
					
					
				}catch(Exception ae){}
				
			}
				
			
		});
		
		back.addMouseListener(new MouseAdapter()//class implements mouselistener
		{
				public void mouseClicked(MouseEvent mu)
				{
					back.setBackground(Color.GREEN);
					WelcomeFrame ww=new WelcomeFrame(666);
					ww.setDefaultCloseOperation(EXIT_ON_CLOSE);
					//ww.setLocation(100,100);
					ww.setSize(d.width,d.height);
					ww.setVisible(true);
					setVisible(false);
					dispose();
					
				
				}
				
		}
		);
	}
			
}


class AdminFrame extends Connect
{
	
	JButton s,back;
	JPasswordField pasword;
	JTextField usname;
	JLabel la2,la3,la1;
	String un,up;
	AdminFrame()
	{
		Image img =kit.getImage("Dee16.png");
		this.setIconImage(img);
		this.setContentPane(new JLabel(new ImageIcon("D:/java prgms/Dee16.png")));
		setVisible(true);
		setSize(1200,1200);
		setTitle("DeetsPool");
		setLayout(null);
		constructs();
		designs();
		handle();
	}
	public void constructs()
	{
		
		la1=new JLabel("ADMIN LOGIN");
		la1.setBounds(600,30,800,40);
		la1.setFont(new Font("ELEPHANT",Font.PLAIN,20));
		la1.setForeground(Color.BLACK);
		
		
		la2=new JLabel("Enter Your Username:");
		la2.setBounds(350,110,500,15);
		la2.setFont(new Font("Constantia",Font.PLAIN,15));
		la2.setForeground(Color.BLACK);
		
		la3=new JLabel("Enter Your password:");
		la3.setBounds(350,140,500,15);
		la3.setFont(new Font("Constantiat",Font.PLAIN,15));
		la3.setForeground(Color.BLACK);
		
		usname=new JTextField();
		usname.setBounds(700,110,300,30);
		
		pasword=new JPasswordField();
		pasword.setBounds(700,140,300,30);
		
		s=new JButton("SUBMIT");
		s.setBounds(600,180,200,30);
		s.setForeground(Color.RED);
		s.setFont(new Font("Modern No.20",Font.ITALIC,15));
		
		back=new JButton("BACK");
		back.setBounds(600,220,200,30);
		back.setForeground(Color.RED);
		back.setFont(new Font("Modern No.20",Font.ITALIC,15));
	
	}
	public void designs()
	{
		add(la2);
		add(la1);
		add(la3);
		add(usname);
		add(pasword);
		add(s);
		add(back);
		
	}
	public void handle()
	{
			
		s.addMouseListener(new MouseAdapter()//class implements mouselistener
		{
				public void mouseClicked(MouseEvent mu)
				{
					try
					{
				
					un=usname.getText();
					up=pasword.getText();
					
					//String str="select *from dlist where username='"+un+"' and password='"+up+"'";
					//rs=st.executeQuery(str);
					if(un.equals("DeetsPool") && up.equals("DeetsPool"))
					{
							back.setBackground(Color.GREEN);
							AdminFrame2 a2=new AdminFrame2();
							//ww.setDefaultCloseOperation(EXIT_ON_CLOSE);
							//a2.setLocation(100,100);
							a2.setSize(d.width,d.height);
							a2.setVisible(true);
							setVisible(false);
							dispose();
					}
					else
					{
							JOptionPane.showMessageDialog(null,"Invalid Login");
							
					}
					
					
					}catch(Exception ae){}
					
					
					
				
				}
				
		}
		);
		
		back.addMouseListener(new MouseAdapter()//class implements mouselistener
		{
				public void mouseClicked(MouseEvent mu)
				{
					back.setBackground(Color.GREEN);
					WelcomeFrame www=new WelcomeFrame(666);
					www.setDefaultCloseOperation(EXIT_ON_CLOSE);
					//ww.setLocation(100,100);
					www.setSize(d.width,d.height);
					www.setVisible(true);
					setVisible(false);
					dispose();
					
				
				}
				
		}
		);
		
	}
	
}


class AdminFrame2 extends Connect
{
	JButton showAll,caretaker,blood,adu_orp,chi_orp,vol,male,female,users,back,ttbutton,print,print1,print2,print3,print4,print5,print6,print7;
	JLabel la1;
	
	
	
	
	
	private int identify=0;
	AdminFrame2()
	{
		//setVisible(true);
		//setLocation(600,100);
		Image img =kit.getImage("Dee16.png");
		this.setIconImage(img);
		this.setContentPane(new JLabel(new ImageIcon("D:/java prgms/Dee16.png")));
		setTitle("DeetsPool");
		setLayout(null);
		constructs();
		designs();
		handle();
		//Connect c=new Connect();
	}
	public void constructs()
	{
		
		la1=new JLabel("ADMIN LOGIN");
		la1.setBounds(650,50,500,35);
		la1.setFont(new Font("ELEPHANT",Font.PLAIN,30));
		la1.setForeground(Color.BLUE);
		
		
		showAll=new JButton("SHOW ALL DONOR LIST");
		showAll.setBounds(600,150,300,30);
		showAll.setForeground(Color.RED);
		showAll.setFont(new Font("Modern No.20",Font.ITALIC,15));
		
		male=new JButton("DONAR LIST - MALE");
		male.setBounds(600,200,300,30);
		male.setForeground(Color.RED);
		male.setFont(new Font("Modern No.20",Font.ITALIC,15));
		
		female=new JButton("DONAR LIST - FEMALE");
		female.setBounds(600,250,300,30);
		female.setForeground(Color.RED);
		female.setFont(new Font("Modern No.20",Font.ITALIC,15));
		
		
		
		
		caretaker=new JButton("CARETAKER LIST");
		caretaker.setBounds(600,300,300,30);
		caretaker.setForeground(Color.RED);
		caretaker.setFont(new Font("Modern No.20",Font.ITALIC,15));
		
		chi_orp=new JButton("CHILD ORPHANAGE DONAR LIST");
		chi_orp.setBounds(600,350,300,30);
		chi_orp.setForeground(Color.RED);
		chi_orp.setFont(new Font("Modern No.20",Font.ITALIC,15));
		
		adu_orp=new JButton("ADULT ORPHANAGE DONAR LIST");
		adu_orp.setBounds(600,400,300,30);
		adu_orp.setForeground(Color.RED);
		adu_orp.setFont(new Font("Modern No.20",Font.ITALIC,15));
		
		
		blood=new JButton("BLOOD DONAR LIST");
		blood.setBounds(600,500,300,30);
		blood.setForeground(Color.RED);
		blood.setFont(new Font("Modern No.20",Font.ITALIC,15));
		
		
	
		vol=new JButton("VOLUNTEERS LIST");
		vol.setBounds(600,450,300,30);
		vol.setForeground(Color.RED);
		vol.setFont(new Font("Modern No.20",Font.ITALIC,15));
		
		users=new JButton("USERS LIST");
		users.setBounds(600,500,300,30);
		users.setForeground(Color.RED);
		users.setFont(new Font("Modern No.20",Font.ITALIC,15));
		
		
		back=new JButton("BACK");
		back.setBounds(700,600,100,30);
		back.setForeground(Color.RED);
		back.setFont(new Font("Modern No.20",Font.ITALIC,15));
		
		
		
		
		print=new JButton("PRINT");
		print.setBounds(650,600,200,30);
		
		print1=new JButton("PRINT");
		print1.setBounds(650,600,200,30);
		
		
		print2=new JButton("PRINT");
		print2.setBounds(650,600,200,30);
		
		print3=new JButton("PRINT");
		print3.setBounds(650,600,200,30);
		
		print4=new JButton("PRINT");
		print4.setBounds(650,600,200,30);
		
		print5=new JButton("PRINT");
		print5.setBounds(650,600,200,30);
		
		print6=new JButton("PRINT");
		print6.setBounds(650,600,200,30);
		
		print7=new JButton("PRINT");
		print7.setBounds(650,600,200,30);
		
		ttbutton=new JButton("BACK");
		ttbutton.setBounds(600,410,50,10);
	
	}
	
	
	public void designs()
	{
		
		add(la1);
		add(male);
		add(female);
		add(caretaker);
		add(adu_orp);
		add(chi_orp);
		add(vol);
		add(users);
		add(blood);
		add(showAll);
		add(back);
		
	}
	
	public void handle()
	{
		back.addMouseListener(new MouseAdapter()//class implements mouselistener
		{
				public void mouseClicked(MouseEvent mu)
				{
					back.setBackground(Color.GREEN);
					WelcomeFrame we=new WelcomeFrame(666);
					we.setDefaultCloseOperation(EXIT_ON_CLOSE);
					//ww.setLocation(100,100);
					we.setSize(d.width,d.height);
					we.setVisible(true);
					setVisible(false);
					dispose();
					
				
				}
				
		}
		);
		
		showAll.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent mu)
			{
				 
				ListDeetsPool l2=new ListDeetsPool(1);
				l2.setVisible(true);
			}
					
				
				
		}
		);
		
		male.addMouseListener(new MouseAdapter()
		{
				public void mouseClicked(MouseEvent mu)
				{
							
					String m="Male";	 
					ListDeetsPool l3=new ListDeetsPool(m,6);
					l3.setVisible(true);
				
				
				}			
		}
		);
		
		female.addMouseListener(new MouseAdapter()//class implements mouselistener
		{
				public void mouseClicked(MouseEvent mu)
				{
					String f="Female";	 
					ListDeetsPool l4=new ListDeetsPool(f,5);
					l4.setVisible(true);
			
			}
					
				
				
		}
		);
		
		caretaker.addMouseListener(new MouseAdapter()//class implements mouselistener
		{
				public void mouseClicked(MouseEvent mu)
				{
				
					String c="Caretaker";	 
					ListDeetsPool l2=new ListDeetsPool(c);
					l2.setVisible(true);
				}
					
				
				
		}
		);
		
		chi_orp.addMouseListener(new MouseAdapter()//class implements mouselistener
		{
			public void mouseClicked(MouseEvent mu)
			{
		
				String ch="Child_orp";	 
				ListDeetsPool l2=new ListDeetsPool(ch);
				l2.setVisible(true);
			}
				
		}
		);
		
		adu_orp.addMouseListener(new MouseAdapter()//class implements mouselistener
		{
			public void mouseClicked(MouseEvent mu)
			{
				
				
				String ad="adult_orp";	 
				ListDeetsPool l2=new ListDeetsPool(ad);
				l2.setVisible(true);
			}
					
				
				
		}
		);
		
		blood.addMouseListener(new MouseAdapter()//class implements mouselistener
		{
			public void mouseClicked(MouseEvent mu)
			{
					
				String b="Blood";	 
				ListDeetsPool l2=new ListDeetsPool(b);
				l2.setVisible(true);
			
			}
					
				
				
		}
		);
		
		vol.addMouseListener(new MouseAdapter()//class implements mouselistener
		{
			public void mouseClicked(MouseEvent mu)
			{
				String v="volunteer";	 
				ListDeetsPool l2=new ListDeetsPool(v);
				l2.setVisible(true);
				
			}	
				
		}
		);
		
		users.addMouseListener(new MouseAdapter()//class implements mouselistener
		{
				public void mouseClicked(MouseEvent mu)
				{
				
						 
					ListDeetsPool l3=new ListDeetsPool(1,2,3);
					l3.setVisible(true);
					
					
					
			
				}
					
				
				
		}
		);
		
	
	}
	
}


class Connect extends JFrame
{
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension d = kit.getScreenSize();
		
		Statement st;
		
		Connection con;
		ResultSet rs;
		Connect()
		{
			makeconnection();
			
		}
		public void makeconnection()
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/deetspool","root","");
				st=con.createStatement();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}	
		
}


public class DeetsPool9
{
	public static void main(String[] args)
	{
		TiFrame tf1=new TiFrame();
		//MyCanvas m=new MyCanvas();
		//tf1.add(m);
		tf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//tf1.setLocation(100,100);
		//tf1.setSize(1400,700);
		tf1.setVisible(true);
		
		
	}
}
