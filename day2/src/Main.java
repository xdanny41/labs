//day4
public class Main {

	private int main() {

		System.out.println("Read the Book!!!");

		return 42 + notMain("18");
	}

	private int notMain(String str) {

		return Integer.valueOf(str);

	}

	public static void main(String[] args) {

		Main test = new Main();

		int aha = test.main();

		System.out.println(aha);

	}

}