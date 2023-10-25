

import java.util.*;
class arraylistToarray
{
    public static void main(String[] args) {

        String sentence = "A quick brown fox jumps over the lazy dog";
        System.out.println("Sentence : "+sentence);

        ArrayList<String> a=new ArrayList<>(Arrays.asList(sentence.split(" ")));
        System.out.println("Arraylist : "+a);
        
        String[] toarrays=a.toArray(new String[0]);
        System.out.println("Array : " +Arrays.toString(toarrays));
    }
}