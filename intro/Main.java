package intro;

public class Main {
	//main javada başlangıc noktasıdır metodudur.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Hello World!");
		 //değişken isimlendirmeleri java'da camelCase yazılır
		 String ortaMetin ="ilginizi çekebilir";
		 String altMetin ="Vade suresi";
		 System.out.println(ortaMetin);
		 System.out.println(altMetin);
		 //integer
		 int vade =12;
		 //double
		 double dolarDun = 18.25;
		 double dolarBugun = 18.20;
		 
		 boolean dolarDustuMu = true;
		 String okYonu = "";
		 
		 if (dolarBugun < dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun == dolarDun) {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}else {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		
		String[] krediler = {"Hızlı KRedi","Maasını halkbankatan alanlar","mutlu emekli"};
		System.out.println(krediler[0]);
		System.out.println(krediler[1]);
		System.out.println(krediler[2] + "\n");
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);	
		}
		
		 
	}

}
