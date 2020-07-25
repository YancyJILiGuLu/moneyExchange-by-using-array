import java.util.Scanner;
public class moneyChange{
	
	public static void main(String arg[]) {
		output o= new output();
		o.askInput();	
		
		calculateMoney c= new calculateMoney();

		int[][] ans=c.cal(o.get_receive(),o.get_charge(),o.get_bills());
		
		o.output(o.get_receive(),o.get_charge(),ans);

	}

}