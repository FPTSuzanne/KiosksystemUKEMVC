package Model;

import javafx.collections.ModifiableObservableListBase;

import java.util.ArrayList;

public class TagList extends ModifiableObservableListBase<Tag> {

    private ArrayList<Tag> tags = new ArrayList<Tag>();

    @Override
    public Tag get(int index) {
        return getTags().get(index);
    }

    @Override
    public int size() {
        return getTags().size();
    }

    @Override
    protected Tag doRemove(int index) {
        return getTags().remove(index);
    }

    @Override
    protected Tag doSet(int index, Tag element) {
        return getTags().set(index, element);
    }

    @Override
    protected void doAdd(int index, Tag element) {
        getTags().add(index, element);
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    public void setTags(ArrayList<Tag> tags) {
        this.tags = tags;
    }
}
