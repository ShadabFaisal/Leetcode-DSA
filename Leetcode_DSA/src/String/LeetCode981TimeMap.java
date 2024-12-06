package String;

import java.util.HashMap;


class LeetCode981TimeMap {

    HashMap<String,HashMap<Integer,String>> map;
    public LeetCode981TimeMap() {
        map=new HashMap<String, HashMap<Integer, String>>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key,new HashMap<Integer,String>());
        }
        map.get(key).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key))
            return "";
        
        for(int i=timestamp;i>=1;--i){
            if(map.get(key).containsKey(i)){
                return map.get(key).get(i);
            }
        }
        return "";
    }
}