import java.util.Scanner;

public class output {
	double _receive;
	double _charge;
	int[][] _bills;
	public output(){
		int[][] tmp={{2000,1000,500,100,50,25,10,5,1},
				{0,0,0,0,0,0,0,0,0}};
		_bills=tmp;
	}
	public void askInput(){//ask for user to enter	
		try {
			Scanner input = new Scanner (System.in);

			System.out.println("Enter the money given: ");
			_receive= input.nextDouble();
			System.out.println("Enter the money charged: ");
			_charge= input.nextDouble();
		}catch(Exception e) {
			System.out.println("Exception encounterd: "+e.toString());
		}
	}

	// output result
	public void output(double _receive,
			double _charge,int[][] bills){
		double moneyNeededCal=_receive-_charge;	
		try {	
			System.out.printf( "Receied $%.2f and charged $%.2f\nExchange: "
					+ "$%.2f. \n\nDetails: \n", _receive
					,_charge,moneyNeededCal 
					);
			System.out.println("===============");
			System.out.println("Bill\tCnt");

			for(int i=0;i<bills[0].length;i++) {
				System.out.printf("$%.2f \t %d \n",
						bills[0][i]/100.0,bills[1][i]);
			}

			System.out.println("===============");
		}catch(Exception e) {
			System.out.println("Exception encounterd: "+e.toString());
		}
	}


	//Automatically generated getter and setter
	public double get_receive() {
		return _receive;
	}

	public void set_receive(double _receive) {
		this._receive = _receive;
	}

	public double get_charge() {
		return _charge;
	}

	public void set_charge(double _charge) {
		this._charge = _charge;
	}

	public int[][] get_bills() {
		return _bills;
	}

	public void set_bills(int[][] _bills) {
		this._bills = _bills;
	}


}
