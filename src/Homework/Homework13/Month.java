package Homework.Homework13;

public class Month {

        public static void Info2015Years(int g){

            switch (g) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Information for the 2015 calendar.");
                    System.out.println("This month has 31 days.");
                    System.out.println();
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Information for the 2015 calendar.");
                    System.out.println("This month has 30 days.");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Information for the 2015 calendar.");
                    System.out.println("This month has 28 days.");
                    System.out.println();
                    break;
                default:
                    System.out.println("Check the spelling of the month.");
                    System.out.println();
            }
        }

    public static void main(String[] args) {
        Info2015Years(2);
        Info2015Years(7);
        Info2015Years(11);
        Info2015Years(14);
    }
    }

