package Model;

import javafx.collections.ModifiableObservableListBase;

import java.util.ArrayList;

public class GameList extends ModifiableObservableListBase<Game>{

    private ArrayList<Game> games = new ArrayList<>();

    public String toString(){
        String text = "";
        for(int i = 0; i < games.size(); i++){
            text += games.get(i).getTitle() + " ";
        }
        return text;
    }

    @Override
    public Game get(int index) {
        return games.get(index);
    }

    @Override
    public int size() {
        return games.size();
    }

    @Override
    protected Game doRemove(int index) {
        return games.remove(index);
    }

    @Override
    protected Game doSet(int index, Game element) {
        return games.set(index, element);
    }

    @Override
    protected void doAdd(int index, Game element) {
        games.add(element);
    }
}