package intro;

public class mukemmelsayılar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 28;
		int toplam = 0;
		
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				toplam+=i;
			}
		}
		if(toplam==number) {
		System.out.println("mükemmel sayıdır");
		}else {
			System.out.println("mükemmel sayı degildir");
		}
	}

}
