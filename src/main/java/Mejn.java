
public class Mejn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b =new B();
		System.out.println("b.x: "+b.returnInt());
		C c = new C();
		System.out.println("c.x: "+c.returnInt());
		b.triple();
		c.triple();
		System.out.println("b.x posle b.triple(): "+ b.returnInt());
		System.out.println("c.x posle c.triple(): "+ c.returnInt());
	
		
		/*
	se pecati
	b.x: 2
	c.x: 2
	b.x posle b.triple(): 6
	c.x posle c.triple(): 5
	 */
	
	}

}
