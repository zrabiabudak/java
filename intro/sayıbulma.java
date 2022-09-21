package intro;

public class sayıbulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sayılar = new int[] {1,2,3,4,5,6,7};
		int aranacak =9;
		boolean varMı=false;
		for(int sayı: sayılar) {
			if(sayı == aranacak) {
				varMı=true;
				break;
			}
		}
		if(varMı == true) {
			System.out.println("sayı bulundu");
		}else {
			System.out.println("sayı bulunamadı");
		}
		
	}

}
