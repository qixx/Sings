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
		this.Sname="光年之外";
		this.Sgname="冯提莫";
		this.time=3.15;
	}
	public void music()
	{
		if((Sname==null)&&(Sgname==null)&&time<=0)
			System.out.println("点歌错误");
			else
				System.out.println("/n");
	}
}
