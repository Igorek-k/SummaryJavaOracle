package Lessons.Lesson27.Exceptions.Important_Moments;

public class Test8 {
//* При создании объекта исключения вы можете воспользоваться его конструктором, который принимает String параметр
//и вписать в него необходимую информацию. Вы также можете воспользоваться конструктором, который не принимает параметры.

//* Если исключение выбрасывается из catch блока, то оно не может быть обработано одно-уровневым catch блоком.

//* При написании кода, вы можете создавать свои собственные исключения. В зависимости от необходимости,
// создавайте исключения, которые наследуются от классов Exception или RuntimeException.

    void marafon(int temperaturaVozduha, int tempBega) throws PodvernulNoguExceptoins {
        if (tempBega > 12) {
            throw new PodvernulNoguExceptoins("Speed very fast: " + tempBega);
        }
        if (temperaturaVozduha > 32) {
            throw new SveloMushcuExceptions();
        }
        System.out.println("You a finish this marathon!! Our Congratulations!! ");
    }

    public static void main(String[] args) {
        Test8 t = new Test8();
        try {
            t.marafon(5, 10);
        } catch (PodvernulNoguExceptoins e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("В любом случае вы получите грамоту!!");
        }
    }
}


class PodvernulNoguExceptoins extends Exception {

    PodvernulNoguExceptoins(String message) {
        super(message);  //создаем конструктор для сообщения Exceptions, его message
    }

    PodvernulNoguExceptoins() {
    }
}

class SveloMushcuExceptions extends RuntimeException {
    SveloMushcuExceptions(String message) {
        super(message);
    }

    SveloMushcuExceptions() {
    }
}
