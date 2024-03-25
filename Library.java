public class Library {
	private Book[] books;

	public Library() {
		books = new Book[10];
		for (int i = 0; i < 10; i++) {
			books[i] = new Book();
		}
	}

	void borrowing(int n) {
		if (books[n].state == Book.stateType.BORROWED) {
			System.out.println("error: this book is already returned");
			return;
		}

		books[n].state = Book.stateType.BORROWED;
		System.out.println("okay");
	}

	void returning(int n) {
		if (books[n].state == Book.stateType.RETURNED) {
			System.out.println("error: this book is already returned");
			return;
		}

		books[n].state = Book.stateType.RETURNED;
		System.out.println("okay");
	}

	void printState() {
		System.out.println("State: ");
		for (Book book : books) {
			System.out.println(book.state);
		}
	}

	public static void main(String[] args) {
		Library lib = new Library();
		lib.borrowing(6);
		lib.borrowing(9);
		lib.returning(8);
		lib.returning(9);
		lib.returning(9);
		lib.returning(6);
	}
}

class Book {
	public enum stateType {BORROWED, RETURNED};
	public stateType state;

	public Book() {
		state = stateType.RETURNED;
	}
}
