import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        int i = 0;
        while(i < 5) {
            list.add("word");
            i++;
        }
        System.out.println(list);

        while (list.size() > 0) 
            list.remove(list.size() - 1);
        
        System.out.println(list);
    }
}