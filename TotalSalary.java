import java.util.Scanner;
public class TotalSalary {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double basic =s.nextInt();
        char grade =s.next().charAt(0);
        double TotalSalary,roundoff;
        double da = 20*(basic/100);
    	double hra = 50*(basic/100);
        double allow;
        if(grade=='A'){
             allow=1700;
        }
         else if(grade=='B'){
                allow=1500;
            }
            else{
                 allow=1300;
            }
            double pf = 11*(basic/100);
         	TotalSalary=basic+hra+da+allow-pf;
            roundoff=Math.round(TotalSalary);
            System.out.println((int)roundoff);
    }
}