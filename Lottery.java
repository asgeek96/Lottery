import java.io.*;
import java.util.*;
class Project1
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		{
			while(true)
			{
				int count=0;
				Random r = new Random();
				int user_num[]=new int[5];
				int Random_num[]=new int[5];
				System.out.println("Enter five numbers");
				for(int i=0;i<5;i++)
					user_num[i]=Integer.parseInt(in.readLine());
				System.out.println("Enter Betting Amount");
				Scanner sc = new Scanner(System.in);
				int Bid = sc.nextInt();
				for(int i=0;i<5;i++)
					Random_num[i]=r.nextInt(14);
				for(int i=0;i<5;i++)
					System.out.println("user="+user_num[i]+"\t"+"PC"+Random_num[i]);
				for(int i=0;i<5;i++)
				{
					for(int j=0;j<5;j++)
					{
						if(Random_num[i]==user_num[j])
							count++;
					}
				}
				if(count==0||count==1)
				{
					System.out.println("Sorry You Loose");
					System.out.println("Kangal");
				}
				else if(count==2)
				{
					Bid=Bid*2;
					System.out.println("You won!!!!");
					System.out.println("Winning Amount="+Bid);
				}
				else if(count==3)
				{
					Bid=Bid*30;
					System.out.println("Congratulation!! You won mini Jackpot");
					System.out.println("Winning Amount="+Bid);
				}
				else if(count==4)
				{
					Bid=Bid*100;
					System.out.println("Congratulation!!! You have Won the jackpot");
					System.out.println("Winning Amount="+Bid);
				}
				else if(count==5)
				{
					System.out.println("Congratulation!! You won the Mega Jackpot");
					Bid=Bid*200;
					System.out.println("Winning Amount="+Bid);
				}
				System.out.println("Want to play again!!! Enter 0 to play again or Enter 1 to exit");
				int c = sc.nextInt();
				if(c==1)
				{
					break;
				}
			}
		}
	}
}
