/**
 * 
 */
package Mypackage;

/**
 * @author lenovo
 *
 */
public class Songs
{

	public String Sname;
	public String Sgname;
	public double time;
	public  Songs() 
	{
		this.Sname="����֮��";
		this.Sgname="����Ī";
		this.time=3.15;
	}
	public void music()
	{
		if((Sname==null)&&(Sgname==null)&&time<=0)
			System.out.println("������");
			else
				System.out.println("/n");
	}
}
