package prob02;

public class Book {
	private int bookNum;
	private String bookName;
	private String author;
	private int StateCode = 1;
	
	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return StateCode;
	}

	public void setStateCode(int stateCode) {
		StateCode = stateCode;
	}

	public Book(int booNum, String bookName, String author) {
		this.bookNum = bookNum;
		this.bookName = bookName;
		this.author = author;
	}
}
