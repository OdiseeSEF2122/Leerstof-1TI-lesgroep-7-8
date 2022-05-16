package intlist;

public class SortedIntList  extends IntList{

    @Override
    public void add(int element){
        if(list.size() == 0){
            super.add(element);
        } else {
            int index = 0;
            for(int ele : list){
                if(ele >= element){
                    break;
                }
                index++;
            }
            list.add(index, element);
        }
    }

    @Override
    public Integer findMin(){
        if(list.isEmpty()){
            return null;
        } else {
            return list.get(0);
        }
    }
}
