public class Factory {
    // Instance variables (they are made at the very top of the class and the word public before them and they can be used everywhere inside factory)
    public int yearFounded;
    public boolean isOpen;
    //Double is any number with decimals
    public double earnings;
    //String is anything that can be put inside two quotes(can be sentences or words)
    public String products;



    public static void main(String[] args) {
        System.out.println("Welcome to Julia's factory");

        new Factory();
    }

    //constructor is a special type of method that does not have void and the name of teh constructor matches the name of the clas
    public Factory() {
        System.out.println("we make houses!");
        yearFounded=2025;
        isOpen= false;
        earnings=1.1;
        factoryInfo();
        




    }
    public void factoryInfo(){
        System.out.println("the factory info");
        //Printing the factory's instance variables
        System.out.println(products);
        System.out.println("the year founded");
        System.out.println(yearFounded);
        System.out.println("the earnings" +earnings);
        System.out.println("it is" + isOpen + "that the factory is open");

    }
}
