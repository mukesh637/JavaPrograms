package constructor_programs;

public class B extends A{
		int b;
		B(int a, int b){
		super(a);
		this.b = b;
		}

		 public void getB(){
		System.out.println(this.b);
		}

		 public static void main(String args[]){
		A obj = new B(10, 20);
		obj.getB();

		B obj2 = new B(30, 40);
		obj2.getNum();
		}
		}

