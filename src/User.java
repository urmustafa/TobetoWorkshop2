
public class User {
	  private int id;
	    private String uName;

	    public User() {
	    }

	    public User(int id, String uName) {
	        this.id = id;
	        this.uName = uName;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getuName() {
	        return uName;
	    }

	    public void setuName(String uName) {
	        this.uName = uName;
	    }
}
