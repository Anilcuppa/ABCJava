package Sample;

import java.math.BigDecimal;
import java.util.ArrayList;

// java.math.BigDecimal;

//import org.xml.sax.AttributeList;

public class EcllipseProgram extends Object {

	public static void main(String[] args) {
		System.out.println("Hello ecllipse i am your old friend, Did you remember me?");
		System.out.println();
		BigDecimal bigDecimal = new BigDecimal(23);
		System.out.println(bigDecimal);
		A onj3 = new A();
		onj3.cal(6, 7);
		onj3.setK(35);
		System.out.println(onj3.toString());
		// B onj4 = new A();
		// System.out.println(onj4.toString());

		System.out.println(onj3.getK());

		int[] numb = { 2, 4 };
		int returnvalue = 0;
		for (int number : numb) {
			returnvalue += number;
			System.out.println(returnvalue);
		}

		ArrayList<Integer> obj = new ArrayList<>();
		System.out.println(obj.hashCode());

	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}

class A {
	int k;

	@Override
	public String toString() {
		return "[k=" + k + ", l=" + l + "]";
	}

	int l;

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	void cal(float a, float b) {

		System.out.println(a + b);
		float mul = (int) a * b;
		System.out.print(mul);
	}
}
// public class B
// {
// void calt (float a, float b)
// {
//
// System.out.println(a+b);
// float mul = (int)a*b;
// System.out.print(mul);
//
//
// @Override
// public String toString()
// return "B [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ",
// toString()=" + super.toString() + "]";
// }
// }
//
