package bookproject;

public class Add {

	private String ISBN;
	private String Title;
	private String Author;
	private String Signature;
	

	public Add(String iSBN2, String title2, String author2, String signature2) {
		ISBN=iSBN2;
		Title=title2;
		Author=author2;
		Signature=signature2;
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
			
		
		// TODO Auto-generated method stub

	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getSignature() {
		return Signature;
	}
	public void setSignature(String signature) {
		Signature = signature;
	}

}
