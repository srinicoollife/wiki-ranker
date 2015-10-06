package locus.task.rank;

import java.util.Scanner;

public class Spidermain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	Scanner input =new Scanner(System.in);
	System.out.println("enter the url");
	String url=input.next();
	SpiderHelper helpobj=new SpiderHelper();
		try {
				if(helpobj.isValidUrl(url))
				{
					String title = url.substring(url.lastIndexOf("/")+1);
					helpobj.gettitles(title);
					helpobj.printtitles();
					helpobj.getpopularity();
					System.out.println("The popular links are");
					helpobj.printpoprank();
				}
				else
						System.out.println("not a valid link");
				input.close();
			} 
			catch (Exception e) 
			{
					// TODO Auto-generated catch block
					System.out.println("Error" +e);
			}
	
	} // end of Main

}
