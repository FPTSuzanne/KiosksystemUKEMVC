package Controller;
import Model.*;
import View.AdminView;

public class AdminController {

    private Model model;
    private AdminView view;

    public Model getModel(){
        return model;
    }

    public void link(Model model, AdminView view){
        this.model = model;
        this.view = view;

        view.getGameList().setItems(model.getAllGames());
        view.getTagList().setItems(model.getAllTags());

        this.deleteGameBtnController();
        this.addNewGameBtnController();
        this.playBtnController();
        this.saveBtnController();
        this.activateTagBtnController();
        this.deactivateTagBtnController();
        this.addTagBtnController();
        this.deleteTagBtnController();
        this.addGameTagBtnController();
        this.removeGameTagBtnController();
        this.display();
    }

    //Button Controller Left BorderPane
    public void deleteGameBtnController(){
        view.deleteGameBtnHandler(e->{
            System.out.println("Delete selected Game");
        });
    }
    public void addNewGameBtnController(){
        view.addNewGameBtnHandler(e->{
            System.out.println("Add new Game");
        });
    }

    //Button Controller Center BorderPane
    public void playBtnController(){
        view.playBtnHandler(e->{
            System.out.println("Play Game");
        });
    }
    public void saveBtnController(){
        view.saveBtnHandler(e->{
            System.out.println("Save changes to current game");
        });
    }

    //Button Controller Right of the BorderPane
    public void activateTagBtnController(){
        view.activateTagBtnHandler(e->{
            System.out.println("Selected Tag is active as Filter");
        });
    }
    public void deactivateTagBtnController(){
        view.deactivateTagBtnHandler(e->{
            System.out.println("Deactivates selected Tag from Filter");
        });
    }
    public void addTagBtnController(){
        view.addTagBtnHandler(e->{
            System.out.println("Add input from the Textfield as a new Tag");
        });
    }
    public void deleteTagBtnController(){
        view.deleteTagBtnHandler(e->{
            System.out.println("Selected Tag is deleted from all Tags");
        });
    }
    public void addGameTagBtnController(){
        view.addGameTagBtnHandler(e->{
            System.out.println("Adds a Tag to a current selected Game");
        });
    }
    public void removeGameTagBtnController(){
        view.removeGameTagBtnHandler(e->{
            System.out.println("Removes a tag from the current selected Game");
        });
    }

    public void disp(Game g){
        if(g != null){
            if(g.getTitle() != null){
                view.getTitleInput().setText(g.getTitle());
            }
            if(g.getExePath() != null){
                view.getPathInput().setText(g.getExePath());
            }
            if(g.getScreenshotPath() != null){
                view.getScreenshotInput().setText(g.getScreenshotPath());
            }
            if(g.getDescription() != null){
                view.getDescriptionInput().setText(g.getDescription());
            }
            if(g.getTags() != null){
                view.getGameTags().setItems(view.getGameListItem().getTags());
            }
        }
    }

    public void display(){
        final Game[] ga = new Game[1];
        view.getGameList().setOnMouseClicked(e->{
            view.clear();
            ga[0] = view.getGameListItem();
            disp(ga[0]);
        });
    }



}
