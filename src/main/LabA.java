package main;

public class LabA {
	
	private static int three = 3; 
	
	public class Inner{
		
		private int inside = three;
		
		public Inner(int myInnerInt){
			this.inside = myInnerInt;
		}
		public int getMyInnerInt() {
			return this.inside;
		}
	}
	public static void main(String[] args) {
		LabA util = new LabA();
		LabA.Inner In = util.new Inner(3);

	System.out.println(In.inside);
	}

}
