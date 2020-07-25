
public class calculateMoney {


	public static int[][] cal(double receive, double charge,int[][] bills) {

		int amount=(int)((receive-charge)*100.0);
		for(int i=0;i<bills[0].length;i++) {
			bills[1][i]= (int) (amount/bills[0][i]);
			amount=amount%bills[0][i];
		}

		return bills;
	}

}
