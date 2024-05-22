import java.util.*;
public class wordChecker{
  
     private ArrayList <String> wordList;
  
     public wordChecker(ArrayList<String> words){
       wordList = words;
     }

     public boolean isWordChain(){
        for(int i =0; i< wordList.size(); i++){
          if(wordList.get(i).indexOf(wordList.get(i+1)) == -1){
            return false;
          }
        }
      return true;
     }

     public ArrayList <String> createList(String target){
       ArrayList <String> result = new ArrayList <String>();
       for(int i = 0; i < wordList.size(); i++){
         if(wordList.get(i).indexOf(target) == 0){
           String str = wordList.get(i).substring(target.length());
           result.add(str);
         }
       }

       return result;
     }




