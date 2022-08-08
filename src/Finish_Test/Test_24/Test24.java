package Finish_Test.Test_24;

public class Test24 {
}

//    Какие из следующих фрагментов кода позволяют вызвать метод abc внутри метода def?
class MyException extends Exception {
}

class Test {
    void abc(double d) throws MyException {
        System.out.println(d);
    }

    void def() {
//ВСТАВЬТЕ КОД
    }
}
//      A)try{abc(3.14);}                                                                    *
//        catch(Exception e){}
//      B)try{new Test().abc(3.14);}
//        catch(RuntimeException e){}
//      C)try{new Test().abc(3.14);}                                                         *
//        catch(MyException e){}
//      D)try{new Test().abc(3.14);}
//        finally{}

//True - *