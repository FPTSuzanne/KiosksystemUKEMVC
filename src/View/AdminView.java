package View;

import Model.Game;
import Model.Tag;
import Model.TagList;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxListCell;
import javafx.scene.layout.*;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.util.Callback;

import java.util.List;

public class AdminView extends BorderPane {

    //Top of BorderPane
    private Button delete = new Button("Delete");
    private Button login = new Button("Login");
    private Label languages = new Label("Eng/De/Arab");
    private TextField search = new TextField();
    private HBox topHBox = new HBox();

    //Left of BorderPane
    private ListView<Game> gameList = new ListView<>();
    private Button deleteGame = new Button("Delete Game");
    private Button addNewGame = new Button("Add Game");
    private HBox leftButtons = new HBox();
    private VBox leftSide = new VBox();

    //Center of BorderPane
    private TextField titleInput = new TextField();
    private TextField screenshotInput = new TextField();
    private TextArea descriptionInput = new TextArea();
    private TextField pathInput = new TextField();
    private Button play = new Button("Play");
    private Button save = new Button("Save");
    private HBox centerButtons = new HBox();
    private VBox center = new VBox();

    //Right of BoderPane
    private Label allTagsLabel = new Label ("All Tags");
    private Label activeTagsLabel = new Label ("Active Tags");
    private Label currentGameTagsLabel = new Label("Game Tags");
    private Button activateTag = new Button("Activate Tag");
    private Button deactivateTag = new Button("Deactivate Tag");
    private Button addTag = new Button ("Add new Tag");
    private Button deleteTag = new Button("Delete Tag");
    private Button addGameTag = new Button("Add tag to Game");
    private Button removeGameTag = new Button("Remove Tag from Game");
    private ListView<Tag> activeTags = new ListView<>();
    private ListView<Tag> tagList = new ListView<>();
    private ListView<Tag> gameTags = new ListView<>();
    private TextField newTagName = new TextField();
    private VBox completeTags = new VBox();
    private VBox filter = new VBox();
    private VBox currentGameTags = new VBox();
    private HBox rightSide = new HBox();

    public AdminView(){

        //Top of BorderPane
        search.setPromptText("search for Game");
        topHBox.getChildren().addAll(search, login, languages);
        topHBox.setPadding(new Insets(10,10,10,20));
        topHBox.setSpacing(30);
        topHBox.setAlignment(Pos.BASELINE_RIGHT);

        //Left of BorderPane
        gameList.setCellFactory(c ->{
            ListCell<Game> cell = new ListCell<Game>(){
                @Override
                protected void updateItem(Game myObject, boolean b){
                    super.updateItem(myObject, b);
                    if(myObject != null){
                        setText(myObject.getTitle());
                    }else{
                        setText("");
                    }
                }
            };
            return cell;
        });
        gameList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        gameList.getSelectionModel().selectedItemProperty().addListener(l ->{

        });

        leftButtons.getChildren().addAll(deleteGame, addNewGame);
        leftButtons.setPadding(new Insets(10,10,10,20));
        leftButtons.setSpacing(30);
        leftButtons.setAlignment(Pos.BASELINE_LEFT);
        leftSide.getChildren().addAll(gameList, leftButtons);
        leftSide.setPadding(new Insets(10,10,10,20));
        leftSide.setSpacing(30);

        //Center of BorderPane
        titleInput.setPromptText("Title");
        screenshotInput.setPromptText("Pfad zum Screenshot");
        descriptionInput.setPromptText("Description");
        pathInput.setPromptText("Pfad zur .exe eingeben");
        centerButtons.getChildren().addAll(play, save);
        centerButtons.setPadding(new Insets(10,10,10,20));
        centerButtons.setSpacing(30);
        center.getChildren().addAll(titleInput, screenshotInput, descriptionInput, pathInput, centerButtons);
        center.setPadding(new Insets(10,10,10,20));
        center.setSpacing(30);

        //Right of BorderPane
        tagList.setCellFactory(c ->{
            ListCell<Tag> cell = new ListCell<Tag>(){
                @Override
                protected void updateItem(Tag myObject, boolean b){
                    super.updateItem(myObject, b);
                    if(myObject != null){
                        setText(myObject.getTagName());
                    }else{
                        setText("");
                    }
                }
            };
            return cell;
        });
        tagList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        tagList.getSelectionModel().selectedItemProperty().addListener(l ->{
        });

        activeTags.setCellFactory(c ->{
            ListCell<Tag> cell = new ListCell<Tag>(){
                @Override
                protected void updateItem(Tag myObject, boolean b){
                    super.updateItem(myObject, b);
                    if(myObject != null){
                        setText(myObject.getTagName());
                    }else{
                        setText("");
                    }
                }
            };
            return cell;
        });
        activeTags.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        activeTags.getSelectionModel().selectedItemProperty().addListener(l ->{
        });

        gameTags.setCellFactory(c ->{
            ListCell<Tag> cell = new ListCell<Tag>(){
                @Override
                protected void updateItem(Tag myObject, boolean b){
                    super.updateItem(myObject, b);
                    if(myObject != null){
                        setText(myObject.getTagName());
                    }else{
                        setText("");
                    }
                }
            };
            return cell;
        });
        gameTags.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        gameTags.getSelectionModel().selectedItemProperty().addListener(l ->{

        });
        newTagName.setPromptText("Neuer Tag Name");
        completeTags.getChildren().addAll(allTagsLabel, tagList, addTag, deleteTag, newTagName);
        completeTags.setPadding(new Insets(10,10,10,20));
        filter.getChildren().addAll(activeTagsLabel, activeTags, activateTag, deactivateTag);
        filter.setPadding(new Insets(10,10,10,20));
        currentGameTags.getChildren().addAll(currentGameTagsLabel, gameTags, addGameTag, removeGameTag);
        currentGameTags.setPadding(new Insets(10,10,10,20));
        rightSide.getChildren().addAll(completeTags, filter, currentGameTags);
        rightSide.setPadding(new Insets(5,5,5,5));

        //whole BorderPane
        this.setCenter(center);
        this.setRight(rightSide);
        this.setLeft(leftSide);
        this.setTop(topHBox);
    }

    //Left of BorderPane
    public ListView<Game> getGameList(){
        return gameList;
    }
    public Game getGameListItem(){ return gameList.getSelectionModel().getSelectedItem(); }
    public void deleteGameBtnHandler(EventHandler<ActionEvent> eventHandler){
        deleteGame.setOnAction(eventHandler);
    }
    public void addNewGameBtnHandler(EventHandler<ActionEvent> eventHandler){
        addNewGame.setOnAction(eventHandler);
    }

    //Center of the BorderPane
    public TextField getTitleInput(){
        return titleInput;
    }
    public TextField getScreenshotInput(){
        return screenshotInput;
    }
    public TextArea getDescriptionInput(){
        return descriptionInput;
    }
    public TextField getPathInput(){
        return pathInput;
    }
    public void playBtnHandler(EventHandler<ActionEvent> eventHandler){
        play.setOnAction(eventHandler);
    }
    public void saveBtnHandler(EventHandler<ActionEvent> eventHandler){
        save.setOnAction(eventHandler);
    }

    //Right of the BorderPane
    //ListViews
    public ListView<Tag> getTagList(){
        return tagList;
    }
    public Tag getTagListItem(){
        return tagList.getSelectionModel().getSelectedItem();
    }
    public ListView<Tag> getActiveTags(){
        return activeTags;
    }
    public Tag getActiveTagListItem(){
        return activeTags.getSelectionModel().getSelectedItem();
    }
    public ListView<Tag> getGameTags(){
        return gameTags;
    }
    public Tag getActiveGameTag(){
        return gameTags.getSelectionModel().getSelectedItem();
    }
    public void activateTagBtnHandler(EventHandler<ActionEvent> eventHandler){
        activateTag.setOnAction(eventHandler);
    }
    public void deactivateTagBtnHandler(EventHandler<ActionEvent> eventHandler){
        deactivateTag.setOnAction(eventHandler);
    }
    public  void addTagBtnHandler(EventHandler<ActionEvent> eventHandler){
        addTag.setOnAction(eventHandler);
    }
    public void deleteTagBtnHandler(EventHandler<ActionEvent> eventHandler){
        deleteTag.setOnAction(eventHandler);
    }
    public void addGameTagBtnHandler(EventHandler<ActionEvent> eventHandler){
        addGameTag.setOnAction(eventHandler);
    }
    public void removeGameTagBtnHandler(EventHandler<ActionEvent> eventHandler){
        removeGameTag.setOnAction(eventHandler);
    }
    public TextField getNewTagName(){
        return newTagName;
    }

    public void clear(){
        titleInput.clear();
        pathInput.clear();
        screenshotInput.clear();
        descriptionInput.clear();
    }
}
