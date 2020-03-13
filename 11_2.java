import java.io.*;
import java.lang.*;

class pmt extends Thread
{
String text; int n;
public pmt(String text,int n)
{
this.text=text;
this.n=n;

}

	public void run()
	{
	
		for(int i=1;i<=n;i++)
		{
		System.out.println(text+""+i);
		}
	}

}

class demo
{
	public static void main(String []args) 
	{
		new pmt("FY",10).start();
		new pmt("SY",20).start();
		new pmt("TY",30).start();
		
	}
	
}
