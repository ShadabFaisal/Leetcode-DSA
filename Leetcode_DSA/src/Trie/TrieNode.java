package Trie;

class TrieNode{

    TrieNode[] links=new TrieNode[26];
    boolean flag=false;

    public TrieNode(){

    }

    boolean containsKey(char ch){
        return (links[ch-'a']!=null);
    }

    TrieNode get(char ch){
        return links[ch-'a'];
    }

    void put(char ch, TrieNode node){
        links[ch-'a']=node;
    }

    void setEnd(){
        flag=true;
    }

    boolean isEnd(){
        return flag;
    }


}