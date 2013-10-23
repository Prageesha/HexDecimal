import java.util.*;
public class TurnhextoDecimal {
	private String str;
public TurnhextoDecimal(String s){
str=s;
}
public String binarytodec(String s){
	StringTokenizer st=new StringTokenizer(s,".");
	String s1=st.nextToken();
	String s2=st.nextToken();
	double sum=0;double sum1=0;
	for (int i=0;i<s1.length();i++){
		int c=s1.charAt(i)-'0';
		int r1=c*(int)(Math.pow(2, s1.length()-(i+1)));
		sum+=r1;
	}
	for (int i=0;i<s2.length();i++){
		int c=s2.charAt(i)-'0';
		double r1=c*(Math.pow(0.5, (i+1)));
		sum1+=r1;
	}
	double total=(double)(sum+sum1);
	StringBuilder sb2=new StringBuilder();
	sb2.append(total);
	
	String s3=sb2.toString();
	return s3;
}
public String Dectobinary(String x){
	double s=Double.parseDouble(x);
	int a=(int)s;
	double b=s-a;
	String s1=D2bInt(a);
	String s2=fracparttobi(b);
	StringBuilder sb=new StringBuilder();
	sb.append(s1);
	sb.append(".");
	sb.append(s2);
	String s3=sb.toString();
	return s3;
	
}
public String D2bInt(int i){
//	int i=Integer.parseInt(s);
	Stack stck=new Stack(8);
	do{
		int d=i/2;
		int r=i%2;
		stck.push(r);
		i=d;
	}while(!stck.isFull());
	StringBuilder sb=new StringBuilder();
	
	while(!stck.isEmpty()){
		sb.append(stck.pop());
	}
	String s2=sb.toString();
	return s2;
}
public String fracparttobi(double s){
	StringBuilder sb=new StringBuilder();
	do{
		double s1=s*2;
		int s2=(int)s1;
		sb.append(s2);
		double s3=s1-s2;
		s=s3;
	}while(s!=0);
	String s4=sb.toString();
	return s4;
}
public int hextoDec(String s){
	int sum=0;
	for(int i=0;i<s.length();i++){
	int r=charChecker(s.charAt(i));
	int a=r*((int)Math.pow(16, s.length()-(i+1)));
	sum+=a;
		
	}
	return sum;
}
public int charChecker(char c){
	if(c>='0' && c <='9')
		return(int)( c-'0');
	else if(c>='a' && c<='f')
		return (int)(c-'a'+10);
	else if(c>='A' && c<='F')
		return (int)(c-'A'+10);
	else return 0;
}
public String DectoBinary(int a){
	Stack st=new Stack(4);
	do{
		int d=a/2;
	int r=a%2;
	st.push(r);
	
	a=d;
	}while(!st.isFull());
	StringBuilder sb=new StringBuilder();
	while(!st.isEmpty()){
		
		
		sb.append(st.pop());
		
	}
	sb.append(" ");
	String s=sb.toString();
	return s;
}
public String hextoBinary(){
	
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<str.length();i++){
		int r=charChecker(str.charAt(i));
	sb.append(DectoBinary(r));
	
		
	}
	String s=sb.toString();
	return s;
	
}
}
