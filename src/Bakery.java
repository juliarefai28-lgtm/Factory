public class Bakery {
    //3 instance variable in class
    public int yearFounded;
    public String pastries;
    public Boolean isOpen;

    public Bakery() {
        yearFounded = 1967;
        pastries = "croissants";
        isOpen = true;

    }

    public void printInfo() {
        System.out.println("what year was the bakery founded" + yearFounded);
        System.out.println("what kind of pastries" + pastries);
        System.out.println("Is the bakery open" + isOpen);
    }

    public Bakery(int pYearFounded, String pPastries, boolean pisOpen) {
        yearFounded = pYearFounded;
        pastries = pPastries;
        isOpen= pisOpen;


    }

}
