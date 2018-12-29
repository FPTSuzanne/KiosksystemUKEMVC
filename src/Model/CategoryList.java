package Model;

import javafx.collections.ModifiableObservableListBase;

import java.util.ArrayList;

public class CategoryList extends ModifiableObservableListBase<Category>{

    private ArrayList<Category> allCategorys = new ArrayList<Category>();

    public CategoryList(){

    }

    public CategoryList(ArrayList<Category> allCategorys){
        this.allCategorys = allCategorys;
    }

    public Category get(int index) {
        return allCategorys.get(index);
    }

    public int size() {
        return allCategorys.size();
    }

    @Override
    protected Category doRemove(int index) {
        return allCategorys.remove(index);
    }

    @Override
    protected Category doSet(int index, Category element) {
        return allCategorys.set(index, element);
    }

    @Override
    protected void doAdd(int index, Category element) {
        allCategorys.add(index, element);
    }

    public ArrayList<Category> getAllCategorys() {
        return allCategorys;
    }

    public void setAllCategorys(ArrayList<Category> allCategorys) {
        this.allCategorys = allCategorys;
    }

    public void setTagActive(String tag){
        for(int i = 0; i < allCategorys.size(); i++){
            allCategorys.get(i).setTagActive(tag);
        }
    }

    public ArrayList<String> getAllActiveTags(){
        ArrayList<String> allActiveTags = new ArrayList<>();
        for(int i = 0; i < allCategorys.size(); i++){
            if(allCategorys.get(i).getOneActiveTag()){
                for(int j = 0; j < allCategorys.get(i).getActiveTags().size(); j++){
                    allActiveTags.add(allCategorys.get(i).getActiveTags().get(j));
                }
            }
        }
        return allActiveTags;
    }
}
