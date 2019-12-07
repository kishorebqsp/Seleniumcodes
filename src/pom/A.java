package pom;

public class A {
	 int a=10;
	 int b=20;
	
	A(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(this.a);
		System.out.println(this.b);
	}

	public static void main(String[] args) {
		A a=new A(30,40);
		

	}

}
