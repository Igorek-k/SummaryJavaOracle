package Lessons.Lesson27.Exceptions.Important_Moments;

public class Test5 {
    void abc() {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String s = null;
            System.out.println(s.length());
        } catch (
                NullPointerException e) { //данный catch относится только к try. То есть исключение из первого catch ловить
            //не будет
            System.out.println("Poymali NullPointerException");
        }
    }


    void def() {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String s = null;
            try {
                System.out.println(s.length());
            } catch (  // Этот catch ловит внутренний try.
                    NullPointerException e1) {

                System.out.println("Poymali NullPointerException внутренним catch блоком");
            }
        }
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        t.abc();
    }
}
