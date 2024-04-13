package oops.part5;

class Table {
	synchronized void printTable(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
		}
	}
}

class A extends Thread {
	Table t;

	public A(Table t) {
		super();
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class B extends Thread {
	Table t;

	public B(Table t) {
		super(); // To access the superclass constructor
		this.t = t; // To access a global variable of the current class.
	}

	public void run() {
		t.printTable(10);
	}

}

public class Synch {
	public static void main(String[] args) {
		Table obj = new Table();

		A t1 = new A(obj);
		B t2 = new B(obj);
		t1.start();
		t2.start();
	}
}
