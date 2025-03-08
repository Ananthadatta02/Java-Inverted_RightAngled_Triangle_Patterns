package star_patterns;

/*

*****
****
***
**

 */
public class InvertedRightAngledTriangle 
{
	public static void main(String[] args) 
	{
		int star = 5;
		for(int i=0;i<=3;i++)
		{
			for(int j=1;j<star;j++)
			{
				System.out.print("*");
			}
			star--;
			System.out.println();
		}
	}
}
