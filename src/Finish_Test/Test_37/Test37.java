package Finish_Test.Test_37;

//Сколько объектов будут пригодными для удаления их GC на строке с комментарием  данного кода?
class Test {
    Byte b = 10;
    Test abc(Test t) {
        t = null;
        return t;
    }
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = t1.abc(t2);
        t1 = null;
// kommentariy
    }
}

// 2*