package reverse;

import java.util.*;
public class Reverse{
    public static void main(String[] args)
    {
     Scanner key=new Scanner(System.in);
     System.out.println("Enter a word");
     String word=key.nextLine();

     char[] myArr= new char[word.length()];
     for(int i=0;i<myArr.length;i++){
         myArr[i]=word.charAt(i);
         System.out.println(myArr[i]);}

     System.out.println();

     for(int i=myArr.length-1;i>=0;i--){
         myArr[i]=word.charAt(i);
         System.out.println(myArr[i]);}
    }

}