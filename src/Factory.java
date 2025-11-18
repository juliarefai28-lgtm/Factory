public class Factory {
    //instance variables they are at the top of the class and they have the word public before them
    public int yearFounded;
    public boolean isOpen;
    // A double is a number in decimal points
    public double earnings;

    // A string is the text inside quotes
    public String products;

    // This is a constructor a type of method that doesn't use void and have same name as class
    public Factory() {
        System.out.println("we make houses");
        yearFounded = 2025;
        isOpen = false;
        products = "houses";
        factoryInfo();
        //type varName= value;
        //object of type house
        House h1= new House();
        h1.owner = "Mr.Kim";
        System.out.println("the owner is" + h1.owner);

        //Todo: is to give all the houses instance variables values
        h1.size=200.25;
        h1.walls = 4;
        h1.isOccupied = true;
        h1.owner = "cathy";
        h1.address = "Milton Street 625";

        System.out.println(h1.size);
        h1.size=40.2;
        System.out.println(h1.size);
        h1.printInfo();

        //todo: make another house object called myHouse
        House myHouse= new House();
            myHouse.printInfo();

            House customHouse = new House(200.24,8, "Ms Blare","260 center street", true);
            customHouse.printInfo();

        //todo: change the variable year founded to be a different value
        yearFounded = 2030; // I just changed the value to a different number
        factoryInfo();
    }

    public static void main(String[] args) {
        Factory f = new Factory();
    }

    // New method names factoryInfo
    public void factoryInfo() {
        System.out.println("this is factory info");
        System.out.println("what we sell");
        System.out.println("the earnings");
        System.out.println("the year founded" + yearFounded);
    }
}






