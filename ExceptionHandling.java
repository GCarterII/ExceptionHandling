import java.util.ArrayList;

public class ExceptionHandling{
    public static void main(String[] args){
        
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        for(Object obj : myList){
            try{
                Integer toIntValue = (Integer) obj;
                System.out.println(toIntValue);
            } catch (ClassCastException exception) {
                System.out.println("Error :-D");
                System.out.println("Casting... it's a pain in the butt");
            }
        }
    }
}