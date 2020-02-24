package com.cc.yingBook;

/**
 * Hello world!
 *
 */
public class bookInfo
{
    private String bookName;
    private Integer bookId;
    private Integer bookPrice;

    public String getBookName() {
        System.out.println("123");
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Integer bookPrice) {
        this.bookPrice = bookPrice;
    }

	@Override
	public String toString() {
		return "bookInfo [bookName=" + bookName + ", bookId=" + bookId + ", bookPrice=" + bookPrice + "]";
	}

	public bookInfo(String bookName, Integer bookId, Integer bookPrice) {
		super();
		this.bookName = bookName;
		this.bookId = bookId;
		this.bookPrice = bookPrice;
	}

	public bookInfo() {
		super();
		System.out.println("123456");
		// TODO Auto-generated constructor stub
	}
    
}
