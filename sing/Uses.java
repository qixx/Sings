/**
 * 
 */
package Mypackage;
import java.util.Scanner;
/**
 * @author lenovo
 *
 */
public class Uses 
{
	String Uname;
	Songs s1;
	public Uses() {}
	public void use() 
	{
	this.s1=new Songs();
	Scanner reader=new Scanner (System.in);
	System.out.print("用户：");
	this.Uname=reader.next();
	System.out.print("输入歌名：");
	this.s1.Sname=reader.next();
	System.out.print("歌手：");
	this.s1.Sgname=reader.next();
	System.out.print("时长：");
	this.s1.time=reader.nextDouble();
	//this.s1.music();
	}
	public void usei() {
		System.out.print("输出："+"歌名"+s1.Sname+"歌手"+s1.Sgname+"时长"+s1.time);
	}
}
