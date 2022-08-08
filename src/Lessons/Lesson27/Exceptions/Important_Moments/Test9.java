package Lessons.Lesson27.Exceptions.Important_Moments;
//* Указание в сигнатуре метода исключения, которое не будет выбрасываться в
//данном методе не является ошибкой
public class Test9 {
    void abc() throws Exception {
        System.out.println("OK");
    }
}

//*    Unreachable statements
                                          //Нельзя писать return после throw new Exception();
//    public int abc() throws Exception{
//        throw new Exception();
//        return 5;
//    }
                                         //Нельзя писать throw new Exception();  после    return
//    public int abc() throws Exception{
//        return 5;
//        throw new Exception();
//    }
//}
