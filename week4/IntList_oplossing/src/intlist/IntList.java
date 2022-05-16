package intlist;

import java.util.ArrayList;

public class IntList {

    protected ArrayList<Integer> list = new ArrayList<Integer>();

    public void add(int element){
        list.add(element);
    }

    public Integer remove(int index){
        if(index < list.size()){
            return list.remove(index);
        } else {
            return null;
        }
    }

    public Integer findMin(){
        if(list.isEmpty()){
            return null;
        }

        int minimum = Integer.MAX_VALUE;
        for(int element: list){
            if(element < minimum){
                minimum = element;
            }
        }

        return minimum;
    }

}
