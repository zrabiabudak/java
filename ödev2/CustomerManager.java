
public class CustomerManager {

	public void Add(Product product) {
		 System.out.println("Müşteri Eklendi" + product.getName());
	}
	
	
	public void Remove(Product product) {
		 System.out.println("Müşteri silindi");
	}
	public void Update(Product product) {
		 System.out.println("Müşteri güncellendi");
	}


}
