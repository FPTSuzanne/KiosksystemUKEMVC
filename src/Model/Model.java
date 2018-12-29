package Model;

import java.util.ArrayList;

public class Model {

    private GameList allGames = new GameList();
    private GameList activeGames = new GameList();
    private TagList allTags = new TagList();
    private TagList activeTags = new TagList();

    public Model(){
        initilize();
    }

    public void initilize(){
        Tag t1 = new Tag("0", "age");
        Tag t2 = new Tag("12", "age");
        Tag t3 = new Tag("18","age");
        Tag t4 = new Tag("Entspannung", "genre");
        Tag t5 = new Tag("Simulation","genre");

        getAllTags().add(t1);
        getAllTags().add(t2);
        getAllTags().add(t3);
        getAllTags().add(t4);
        getAllTags().add(t5);

        Game g1 = new Game();
        g1.setExePath("Path zum Spiel");
        g1.setScreenshotPath("Path zum Screenshot");
        g1.setTitle("Minesweeper");
        g1.setDescription("I love this game");
        TagList g1Tags = new TagList();
        g1Tags.add(t1);
        g1Tags.add(t4);
        g1.setTags(g1Tags);
        g1.setId(1);

        Game g2 = new Game();
        g2.setExePath("Path zum Spiel");
        g2.setScreenshotPath("Path zum Screenshot");
        g2.setTitle("Job Simulator");
        g2.setDescription("Lets play having a job, lol");
        TagList g2Tags = new TagList();
        g2Tags.add(t5);
        g2.setTags(g2Tags);
        g2.setId(2);

        allGames.add(g1);
        allGames.add(g2);
        System.out.println(allGames);
    }

    public GameList getAllGames() {
        return allGames;
    }

    public void setAllGames(GameList allGames) {
        this.allGames = allGames;
    }

    public GameList getActiveGames() {
        return activeGames;
    }

    public void setActiveGames(GameList activeGames) {
        this.activeGames = activeGames;
    }

    public TagList getAllTags() {
        return allTags;
    }

    public void setAllTags(TagList allTags) {
        this.allTags = allTags;
    }

    public TagList getActiveTags() {
        return activeTags;
    }

    public void setActiveTags(TagList activeTags) {
        this.activeTags = activeTags;
    }

}

//Kram für Controller maybe
    /*public void updateList(TagList activeTags) {
        if(!(activeTags.getAtLeastOneTagActive())){
            selectedGames = getAllGames();
        }
        for(int i = 0; i < selectedGames.size(); i++){
            for(int j = 0; j < activeTags.getActiveTags().size(); j++){
                if(selectedGames.get(i).getTags() != null){
                    if(checkForTag(activeTags.getActiveTags().get(j), selectedGames.get(i).getTags())){
                    }else{
                        selectedGames.remove(i);
                    }
                }else{
                    selectedGames.remove(i);
                }
            }
        }
    }

    public void updateList(){
        selectedGames = getAllGames();
    }

    private Boolean checkForTag(Tag tag, ArrayList<Tag> gameTag){
        if(gameTag.isEmpty()){
            return false;
        }
        for(int i = 0; i < gameTag.size(); i++){
            if(gameTag.get(i).equals(tag)){
                return true;
            }
        }
        return false;
    }*/

       /* public void activateTag(Tag activeTag) {
        setAtLeastOneTagActive(true);
        activeTags.add(activeTag);
    }

    public void deativateTag(Tag deactivatedTag){
        activeTags.remove(deactivatedTag);
        if(activeTags.isEmpty()){
            setAtLeastOneTagActive(false);
        }
    }*/
