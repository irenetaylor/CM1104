public class lab1_exercice2 {

    public static void main(String[] args) {

        int dice1;
        int dice2;
        for (int i = 1; i<=10;i++){
           dice1 = (int) (Math.random()*6) + 1;
           dice2 = (int) (Math.random()*6) + 1;
        System.out.println("Roll " + i + " produced ");
        System.out.println(dice1 + " and " + dice2);


        }
    }
}
