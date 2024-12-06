package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class LeetCode380RandomizedSet {

    Map<Integer, Integer> map=null;
    List<Integer> list=null;

    Random ran=null;

    public LeetCode380RandomizedSet() {
        map=new HashMap<>();
        list=new ArrayList<>();
        ran=new Random();
    }
    
    public boolean insert(int val) {
        if(!map.containsKey(val)){
            map.put(val,list.size());
            list.add(val);
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val)){

            Integer lastNodeVal=list.get(list.size()-1);

            if(lastNodeVal==val){
                list.remove(list.size()-1);
                map.remove(val);
                return true;
            }

            int indexOfVal=map.get(val);
            list.set(indexOfVal,lastNodeVal);
            map.put(lastNodeVal,indexOfVal);
             list.remove(list.size()-1);
            map.remove(val);
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getRandom() {
        int size=list.size();
        int index=ran.nextInt(size);
        return list.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */