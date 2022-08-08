package Lessons.Lesson13;

//Различие между if и switch:
//if показывает два пути решение (если true один путь, если false другой путь)
//switch в основном показывает более двух путей. Так же как и if это Flow control.
public class Switch_Statement {
    /*Синтаксис Switch_Statement:
     *  switch (expression) {               switch -ключевое слово, expression - выражение
     *    case value1: our code; break;     case - ключевое слово
     *    case value2: our code; break;     break - ключевое слово
     *    case value3: our code; break;      default  - ключевое слово
     *    default:   our code; break;          value - значение
     *     }

     */
}

class Student {
    int grade;

    Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st = new Student(5);

        if (st.grade == 2) {
            System.out.println("Student dvoeshnik");
        } else if (st.grade == 3) {
            System.out.println("Student troechnik");
        }                                               // * C помощью if мы создали код,который определяет как хорошо
        else if (st.grade == 4) {                       // *   учиться студент. Логика у этого кода простая,однако
            System.out.println("Student horoshist");
        }                                               // *   код получился слишком длинным,а читабельность не очень
        else if (st.grade == 5) {                       // *   хорошая. Было бы больше значений,можно было бы конкретно
            System.out.println("Student otlichnik");
        }                                               // * запутаться. Так что тоже самое мы сейчас сделаем со switch.
        else
            System.out.println("Ocenka ne verna");


        switch (st.grade) {
            case 2:
                System.out.println("Student dvoeshnik");
                break;
            case 3:
                System.out.println("Student troechnik");
                break;
            case 4:
                System.out.println("Student horoshist");
                break;
            case 5:
                System.out.println("Student otlichnik");
                break;
            default:
                System.out.println("Ocenka ne verna");
                break;
        }
        /*switch - это слово означает,что мы будем что-то с чем-то сравнивать; () - что мы будем сранивать пишется в них
         * case 2: - если 2 : что надо сделать
         * break - покидает тело switch. Говорит о том,что statement закончился.
         * default  - срабатывает тогда,когда не срабатывает ни один из case.
         *
         *
         * switch (st.grade) {
            case 2:
                System.out.println("Student dvoeshnik");
                * если тут убрать break, то switch выполнит все действия пока не закончится полностью его тело,или до
                * следующего break.
            case 3:
                System.out.println("Student troechnik");
                break;
                * то есть код выполниться до этого момента. И если st.grade ==2 , то на экран выведет
                * и "Student dvoeshnik", и "Student troechnik"
                *
                * default можно написать где угодно,не обязательно писать его на самом последнем месте,это ни как на
                * его свойства не повлияет.
                *
                * Мы не можем писать одинаковые case:
                * case 1: our code; break;
                * case 2: our code; break;
                * case 3: our code; break;
                * case 2: our code; break; ---- ERROR --- такой case уже существует.
                * case 1+2: our code; break; -----ERROR, так как компилятор знает ,что 1+2 = 3,а case 3 уже есть.
         */
    }
}



