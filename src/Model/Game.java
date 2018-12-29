package Model;

import java.util.ArrayList;

public class Game{

    private String exePath;
    private String screenshotPath;
    private String title;
    private String description;
    private TagList tags;

    private long id;

    public Game(){
        tags = new TagList();
    }

    public String getExePath() { return exePath; }

    public void setExePath(String exePath) {
        this.exePath = exePath;
    }

    public String getScreenshotPath() {
        return screenshotPath;
    }

    public void setScreenshotPath(String screenshotPath) {
        this.screenshotPath = screenshotPath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TagList getTags() {
        return tags;
    }

    public void setTags(TagList tags) {
        this.tags = tags;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void addTag(Tag tag) {
        tags.add(tag);
    }

    public void deleteTag(String tag) {
        for(int i = 0; i < tags.size(); i++){
            if(tag.equals(tags.get(i))){
                tags.remove(i);
            }
        }
    }

    public void play(){

    }
}
