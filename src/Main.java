public class Main {
	public static void main(String[] args) {
		//   referans type ---
		//   stack=>...class1 olusur   class2 oluşur 
		//   heap=> clas1 için nesne olusur class2 için nesne add remove update bırada olur
		//		new heapte yeni bir bş-je yapıyordu 
		//value => s tacktır  heap ile işi yok int sayı=5 mesela
		//	diziler referans tiptir
		//encapsulation herhangi bir alanı kullanmaktyı kısıtlama mesela 
		//
		Product product = new Product();
		product.setName("xxxx"); 
		product.setPrice(33.444);
		product.setId(55);
		product.setStockAmount(55);
		product.setDescription("skdfjhjdalsf sldjfdjls ldsdjs dıfdlı dlfd edıfd");
		
		CustomerManager customerManager= new CustomerManager(); //stackte 101 referansı 
	  	customerManager.Add(product);
		//customerManager.Remove();
		//customerManager.Update();
	}
}
