package Model;
import java.util.ArrayList;

public class Category{

    private String question;
    private ArrayList<String> tagList = new ArrayList<>();
    private ArrayList<String> activeTags = new ArrayList<>();
    private Boolean oneActiveTag;

    public Category(){
        oneActiveTag = false;
    }

    public Category(ArrayList<String> tagList){
        this.setTagList(tagList);
        oneActiveTag = false;
    }



    public void addTag(String tag) {
        getTagList().add(tag);
    }


    public void removeTag(String tag) {
        for(int i = 0; i < getTagList().size(); i++){
            if(tag.equals(getTagList().get(i))){
                getTagList().remove(i);
            }
        }
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getTagList() {
        return tagList;
    }

    public void setTagList(ArrayList<String> tagList) {
        this.tagList = tagList;
    }

    public ArrayList<String> getActiveTags() {
        return activeTags;
    }

    public void setActiveTags(ArrayList<String> activeTags) {
        this.activeTags = activeTags;
    }

    public void setTagActive(String tag){
        for(int i = 0; i < tagList.size(); i++){
            if(tagList.get(i).equals(tag)){
                activeTags.add(tag);
                oneActiveTag = true;
                break;
            }
        }
    }


    public Boolean getOneActiveTag() {
        return oneActiveTag;
    }

    public void setOneActiveTag(Boolean oneActiveTag) {
        this.oneActiveTag = oneActiveTag;
    }
}
