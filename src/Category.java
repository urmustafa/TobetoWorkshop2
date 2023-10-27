
public class Category {
	
	private int id;
    private String cName;

    public Category() {
    	
    }

    public Category(int id, String cName) {
    	
        this.id = id;
        this.cName = cName;
    }

    public int getId() {
    	
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getcName() {
        return cName;
    }

    public void setCName(String cName) {
        this.cName = cName;
    }
}
