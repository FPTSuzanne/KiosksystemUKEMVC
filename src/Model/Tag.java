package Model;

public class Tag {

    private int id;
    private String tagName;
    private String category;

    public Tag(){
    }

    public Tag(String tagName, String category){
        this.tagName = tagName;
        this.category = category;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
