import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.text.*;
public class hextodecimaldectohexMain extends JApplet implements ActionListener{

	JTextField input;
	JRadioButton h2d;
	JRadioButton h2b;
	JRadioButton b2d;
	JRadioButton d2b;
	JRadioButton nd2b;
	JRadioButton b2nd;
	JButton showResult;
	JLabel lbl;
	JTextField Result;
	public void init(){
		Container conpane =getContentPane();
		conpane.setLayout(new FlowLayout());
		
		input=new JTextField(" ",30);
		conpane.add(input);
		
		h2d=new JRadioButton("hextoDecimal",true);
		conpane.add(h2d);
		
		h2b=new JRadioButton("hextobinary",false);
		conpane.add(h2b);
		
		b2d=new JRadioButton("binarytoDecimal",false);
		conpane.add(b2d);
		
		d2b=new JRadioButton("DecimaltoBinary",false);
		conpane.add(d2b);
		

		nd2b=new JRadioButton("NegativeDecimaltoBinary",false);
		conpane.add(nd2b);
		
		b2nd=new JRadioButton("BinaryToNegativeDecimal",false);
		conpane.add(b2nd);
		 ButtonGroup g=new ButtonGroup();
		 g.add(h2d);
		 g.add(h2b);
		 g.add(b2d);
		 g.add(d2b);
		 g.add(nd2b);
		 g.add(b2nd);
		 
		 showResult=new JButton("ShowResult");
		 showResult.addActionListener(this);
		 conpane.add(showResult);
		 lbl=new JLabel("Enter the Number You want to Convert and then select operation click show Result");
			conpane.add(lbl);
			
			Result=new JTextField("",40);
			conpane.add(Result);
		 
		
	}
	public void actionPerformed(ActionEvent e){
		TurnhextoDecimal t=new TurnhextoDecimal(input.getText());
		if(h2d.isSelected()){
			int s=t.hextoDec(input.getText());
			StringBuilder sb=new StringBuilder();
			sb.append(s);
			Result.setText(sb.toString());
			
		}
		else if(h2b.isSelected()){
			String s=t.hextoBinary();
			
			Result.setText(s);
			
		}
		else if(b2d.isSelected()){
			String s=t.binarytodec(input.getText());
			
			Result.setText(s);
			
		}
		else if(d2b.isSelected()){
			
			String s=t.Dectobinary(input.getText());
			
			Result.setText(s);
			
		}
		else if(nd2b.isSelected()){
			NegativeBinary n=new NegativeBinary();
			double d=Double.parseDouble(input.getText());
		Result.setText(n.ND2B(d));
		}
		else if(b2nd.isSelected()){
			NegativeBinary n=new NegativeBinary();
			//double d=Double.parseDouble(input.getText());
		Result.setText(n.B2ND(input.getText()));
		}
	}
}
