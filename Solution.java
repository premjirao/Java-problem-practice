import java.util.Scanner;
//import java.lang.Math;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		
       Scanner Solution = new Scanner(System.in);
          char name = Solution.next().charAt(0);
          int m1 = Solution.nextInt();
          int m2 = Solution.nextInt();
          int m3 = Solution.nextInt();
          double avg = (m1+m2+m3)/3;
        System.out.println(name);
        System.out.println(avg);
		
    int i=0;
    while(i<10){
      i=i+1;
      System.out.print(i);
      i=i+1;//output: 13579 
    }

      int x=5;
      int y=5;
      if the condition is while(x==y) output: infinite line Hello;
      while((x=5)==y){
        System.out.println("Hello");
        x++;
        y++;//output:one time print Hello;
      }
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        int srt=(int)Math.sqrt(n);
        System.out.println(srt);*/
      
          int n=10,r=6;
          int factn=1,factr=1,factnr=1;
          for(int i=2;i<=n;i++)
          {
              factn*=i;
              if(i<=r)
                  factr*=i;
              if(i<=n-r)
                  factnr*=i;
          }
          int ncr=factn/(factr*factnr);
          System.out.print(ncr);

	}
}