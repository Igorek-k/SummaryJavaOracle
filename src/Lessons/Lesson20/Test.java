package Lessons.Lesson20;
import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder s1 = new StringBuilder("Hello");
        StringBuilder s2 = new StringBuilder("Ok");
        StringBuilder s3 = new StringBuilder("Privet");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for(int i = 0; i<list.size();i++){
            list.get(i).append("!!!");  //изменили элементы ArrayList с помощью метода append
        }
        for(StringBuilder s : list){
            System.out.print(s + " ");
        }
    }
}
