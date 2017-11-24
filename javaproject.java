import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class javaproject
{
	JFrame jf;
	JLabel jl1,jl2,jl3;
	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7;
	JTextField jt1,jt2,jt3;
	javaproject()
	{
		jf=new JFrame("SWING");
		jl1=new JLabel("ROLL NO");
		jl2=new JLabel("NAME");
		jl3=new JLabel("E-MAIL");
		jb1=new JButton("|<");
		jb2=new JButton("<");
		jb3=new JButton(">");
		jb4=new JButton(">|");
		jb5=new JButton("       ADD       ");
		jb6=new JButton("     DELETE     ");
		jb7=new JButton("UPDATE");
		jt1=new JTextField("1");
		jt2=new JTextField("SURBHI");
		jt3=new JTextField("SURBHI123@GMAIL.COM");
		jf.setSize(500,500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gblayout=new GridBagLayout();		
		GridBagConstraints gbc=new GridBagConstraints();
		jf.setLayout(gblayout);		
		
		gbc.weightx=0.0;
		gbc.weighty=0.0;
		gbc.gridx=1;
		gbc.gridy=1;
		jf.add(jl1,gbc);
		gbc.gridx=1;
		gbc.gridy=2;
		jf.add(jl2,gbc);
		gbc.gridx=1;
		gbc.gridy=3;
		jf.add(jl3,gbc);
	
		gbc.gridx=2;
		gbc.gridy=1;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.gridwidth=11;
		jf.add(jt1,gbc);	
		gbc.gridx=2;
		gbc.gridy=2;
		jf.add(jt2,gbc);	
		gbc.gridx=2;
		gbc.gridy=3;
		jf.add(jt3,gbc);			
		
		gbc.gridx=1;
		gbc.gridy=4;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.gridwidth=3;
		jf.add(jb1,gbc);	
		gbc.gridx=4;
		gbc.gridy=4;
		jf.add(jb2,gbc);
		gbc.gridx=7;
		gbc.gridy=4;
		jf.add(jb3,gbc);
		gbc.gridx=10;
		gbc.gridy=4;
		jf.add(jb4,gbc);
		
		gbc.gridx=1;
		gbc.gridy=5;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.gridwidth=4;
		jf.add(jb5,gbc);
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.gridwidth=4;
		gbc.gridx=5;
		gbc.gridy=5;
		jf.add(jb6,gbc);
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.gridwidth=4;
		gbc.gridx=9;
		gbc.gridy=5;
		jf.add(jb7,gbc);

jb1.addActionListener(this);
                jb2.addActionListener(this);
                jb3.addActionListener(this);
                jb4.addActionListener(this);
                jb5.addActionListener(this);
                jb6.addActionListener(this);
                jb7.addActionListener(this);
				
		//FIRST RECORD:-
try{Class.forName("java.sql.DriverManager");
Connection
   	con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/surbhi","root","1234");
Statement stmt=(Statement)con.createStatement();
String q="Select * from department";
ResultSet rs=stmt.executeQuery(q);
rs.first();
rollno.setText(rs.getString(1));
name.setText(rs.getString(2));
emailid.setText(rs.getString(3));
RecordNo.setText("1");
   	}  catch(Exception e)
	{JOptionPane.showMessageDialog(null,e.getMessage());}

	//LAST RECORD:-
int n = 0;
try{Class.forName("java.sql.DriverManager");
Connection
   	con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sweta","root","1234");
Statement stmt=(Statement)con.createStatement();
String q="select * from department";
ResultSet rs=stmt.executeQuery(q);
rs.last();
int a=rs.getRow();
int r=Integer.parseInt(RecordNo.getText());
if(n==r)
{rs.absolute(r+1);}
rollno.setText(rs.getString(1));
Name.setText(rs.getString(2));
emailid.setText(rs.getString(3));
No_Of_Persons.setText(rs.getString(4));
RecordNo.setText(r+"");
}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());
}

	//NEXT:-
try{Class.forName("java.sql.DriverManager");
Connection
   	con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sweta","root","1234");
Statement stmt=(Statement)con.createStatement();
String q="select * from department";
ResultSet rs=stmt.executeQuery(q);
int n=Integer.parseInt(RecordNo.getText());
if(n==1)
	rs.last();
else{rs.absolute(n-1);}
rollno.setText(rs.getString(1));
Name.setText(rs.getString(2));
emailid.setText(rs.getString(3));
No_Of_Persons.setText(rs.getString(4));
RecordNo.setText(n+"");}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}

//PREVIOUS:-
try{Class.forName("java.sql.DriverManager");
Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sweta","root","1234");
Statement stmt=(Statement)con.createStatement();
String q="Select * from Department;";
ResultSet rs=stmt.executeQuery(q);
rs.last();
int n=Integer.parseInt(RecordNo.getText());
if(n==1)
{rs.last();}
else 
{rs.absolute(n-1);}
rollno.setText(rs.getString(1));
Name.setText(rs.getString(2));
emailid.setText(rs.getString(3));
No_Of_Persons.setText(rs.getString(4));
RecordNo.setText(n+"");}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}


		jf.setVisible(true);
	}
	public static void main(String args[])
	{
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new javaproject();
			}
		});
	}
}

