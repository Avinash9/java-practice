package FirstApp.FirstApp;

public class Greeting {

	long id;
	String content;
	
	public Greeting(long id, String content) {
		// TODO Auto-generated constructor stub
		this.id = id;
        this.content = content;
	}
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getContent() {
		return content;
	}

}
