package Lessons.Lesson18.String_StringBuilder;

public class DOPOLNENIE {
    public static void main(String[] args) {

        //Еще один конструктор класса String:
    char[] array = new char[]{'p','r','i','v','e','t'};
    String s = new String(array);
        System.out.println(s);


      //Method append   (StringBuilding)
        StringBuilder sb = new StringBuilder("Hello World");
        sb.append(array,2,3);
        System.out.println(sb);
        //2 - говорит, с какой позиции добавить
        //3 - говорит сколько элементов добавить


        //method insert   (StringBuilding)
        StringBuilder sb1= new StringBuilder("Hello World");
        sb.insert(2,array,1,3);
        System.out.println(sb1);
        //c какого индекса инсертить ( в данном случае между e и l.
        //array - что будем инсеритить - массив
        //1 - с какой позиции
        // 3 - сколько элементов

    }
}
