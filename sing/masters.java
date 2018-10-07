/**
 * 
 */
package Mypackage;

import java.util.Scanner;

/**
 * @author lenovo
 *
 */
public class masters
{
	public masters() {}
	String Master;
	Songs s2;
	public void Master() 
	{
	int i;
	Uses[] use=new Uses[3];
	for(i=0;i<3;i++)
	{
		use[i]=new Uses();
		use[i].use();
		use[i].usei();
	}
	}
	public void lsong() 
	{
		this.s2=new Songs();
		Scanner reader=new Scanner (System.in);
		System.out.print("主持人：：");
		this.Master=reader.next();
		System.out.print("输入歌名：");
		this.s2.Sname=reader.next();
		System.out.print("歌手：");
		this.s2.Sgname=reader.next();
		System.out.print("时长：");
		this.s2.time=reader.nextDouble();
		//reader.close();
	}
}
