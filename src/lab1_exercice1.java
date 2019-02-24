public class lab1_exercice1 {

    public static void main(String[] args){
        double lengthInM = 1.75;
        double lengthInInches = lengthInM * 39.37;
        int feet = ((int)lengthInInches)/12;
        int inches = (int)(lengthInInches - feet * 12);
        System.out.println(lengthInM + " metres is " + feet +
                " feet and " + inches + " inches");
    }
}
