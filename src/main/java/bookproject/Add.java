package bookproject;

public class Add {

	private String isbn;
	@SuppressWarnings("unused")
	private String title;
	@SuppressWarnings("unused")
	private String author;
	@SuppressWarnings("unused")
	private String signature;
	

	public Add(String iSBN2, String title2, String author2, String signature2) {
		setISBN(iSBN2);
		setTitle(title2);
		setAuthor(author2);
		setSignature(signature2);
		
	}
	public String getISBN() {
		return isbn;
	}
	public void setISBN(String iSBN) {
		this.isbn = iSBN;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setSignature(String signature) {
		this.signature = signature;
	}

}
