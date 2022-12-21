public class Main {
    public static void main(String[] args) {


        int score = 300;
        int replenishment = 1200;
        int bonys = replenishment / 100;
        int result = score + replenishment;
        if (replenishment > 1000) {
            System.out.println(bonys+result);}
        else {
            System.out.println(result);}



    }
}