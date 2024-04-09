package javaProject.samples;

public class assignments /*{
	public int price( int amount, int quantity ) {
	int totalamount = amount * quantity;
	System.out.println( "you have pay:" + totalamount );
	return totalamount;
	
	}
	
	public double discountpersant (int price, int dispersant) {
		double disprice = (price/100)* dispersant;
		System.out.println( "discounted price:" + disprice );
		return price-disprice;
	}
	
	public double finelprice (int totalamount, int dispersant) {
		double lastprice = totalamount - dispersant;
		System.out.println( "last price is:" + lastprice );
		return lastprice;
	}
	public static void main( String[] args ) {
		assignments ag = new assignments();
		double price = ag.price(5000,5);
		double discountpersant = ag.discountpersant(25000,5);
		//double finelamount = price-discountpersant;
		//double finelprice = ag.finelprice();
		
		//System.out.println( "price:" + totalamount );
		//System.out.println( "dicount amount:" + disprice);
		//System.out.println( "" ); 
		ag.price(1000,5);
		ag.discountpersant(5000,5);
		ag.finelprice(0, 0);
		

	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	{
		public int price( int amount, int quantity ) {
		int totalamount = 1000 * 5;
		System.out.println( "you have pay:" + totalamount );
		return totalamount;
		
		}
		
		public double discountpersant (int totalamount, int dispersant) {
			double disprice = (totalamount/100)* 5;
			System.out.println( "discounted price:" + disprice );
			return totalamount-disprice;
		}
		
		public double finelprice (int totalamount, int disprice) {
			double lastprice = totalamount - disprice;
			System.out.println( "last price is:" + lastprice );
			return lastprice;
		}
		public static void main( String[] args ) {
			assignments ag = new assignments();
		//	double price = ag.price(5000,5);
			//double discountpersant = ag.discountpersant();
			//double finelamount = price-discountpersant;
			//double finelprice = ag.finelprice();
			
			System.out.println( "price:" +  );
			System.out.println( "dicount amount:" +);
			System.out.println( "" ); 
		//	ag.price();
		//	ag.discountpersant(5000,5);
		//	ag.finelprice(5000, 250);
			

		}


}

