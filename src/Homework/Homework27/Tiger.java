package Homework.Homework27;

public class Tiger {
    public String eat(String s) {
        if (s.equals("myaso")) {
            System.out.println("Tiger eat myaso");
        } else {
            throw new NeMyasoException("Tiger not eating" + s);
        }
        return s;
    }

    public String drink(String s) throws NeVodaException {
        if (s.equals("voda")) {
            System.out.println("Tiger drink water");
        } else {
            throw new NeVodaException("Tigr ne drink, tigr drink: " + s);
        }
        return s;
    }
}
