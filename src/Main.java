public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

        System.out.println("----------------------------------------------------");

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));



        System.out.println("----------------------------------------------------");

        System.out.println(isCatPlaying(true,10)) ;
        System.out.println(isCatPlaying(false,36)) ;
        System.out.println(isCatPlaying(false,35)) ;

        System.out.println("----------------------------------------------------");

        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));


        System.out.println("----------------------------------------------------");

        System.out.println(area(5.0));
        System.out.println(area(-1));

    }

    public static boolean shouldWakeUp(boolean isDogBarking, int hourOfDay) {
        if (isDogBarking) {
            if (hourOfDay >= 0 && hourOfDay < 8 || hourOfDay > 22 && hourOfDay <= 23) {
                return true;
            }
        }
        return false;
    }



    public static boolean hasTeen(int num1, int num2, int num3) {
        if ((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isCatPlaying(boolean summer, int num) {
        if (summer && (num > 25 && num <= 45)) {
            return true;
        } else if (!summer && (num > 25 && num <= 35)) {
            return true;
        } else {
            return false;
        }
    }


    public static double area(double num1, double num2){
        if((num1 >= 0 ) && ( num2 >= 0 ) ){
            double total = num1*num2;
            return total;
        }
        else {
            return -1;
        }

    }

    public static double area(double radius){
        if(radius >= 0){
            double total = Math.PI*radius*radius;
            return total;
        }
        else {
            return -1;
        }

    }
}
