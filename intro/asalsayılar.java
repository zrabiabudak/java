package intro;

public class asalsayılar {

	public static void main(String[] args) {
		 int number=41;
		 boolean asalMı=true; 
		 for(int i = 2;i<number;i++) {
			 if(number%i==0) {
				 asalMı=false;
				 break;
			 }
		 }
		 System.out.println(asalMı);

	}

}
