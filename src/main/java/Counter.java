package src.main.java;

public class Counter {

	private int count;

	public Counter() {
		this.reset();
	}

	public void reset() {
		count = 0;
	}

	public void increment() {
		count++;
	}

	public void increaseBy(int i) {
		count += i;
	}

	public void decrement() {
		count--;
	}

	public void decreaseBy(int i) {
		count -= i;
	}

	public void multiplyBy(int i) {
		count = count * i;
	}

	public void triple() {
		int i = 3;
		String unusedText = "test"; // ← Code Smell: unused variable
		String unusedText2 = "test2"; // ← tambah lagi
		multiplyBy(i);
	}

	public void powerBy(int i) {
		count = count ^ i; // ← Bug: ^ adalah XOR bukan pangkat!
	}

	public boolean isCountEven() {
		return count % 2 == 0;
	}

	public int getCount() {
		return count;
	}

	// ← Code Smell: empty method
	public void doNothing() {
	}

	// ← Code Smell: method tidak dipakai
	public void unusedMethod() {
		int x = 10;
		int y = 0;
		int z = x / y; // ← Bug: division by zero!
	}
}