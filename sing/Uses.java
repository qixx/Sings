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
	System.out.print("�û���");
	this.Uname=reader.next();
	System.out.print("���������");
	this.s1.Sname=reader.next();
	System.out.print("���֣�");
	this.s1.Sgname=reader.next();
	System.out.print("ʱ����");
	this.s1.time=reader.nextDouble();
	//this.s1.music();
	}
	public void usei() {
		System.out.print("�����"+"����"+s1.Sname+"����"+s1.Sgname+"ʱ��"+s1.time);
	}
}
