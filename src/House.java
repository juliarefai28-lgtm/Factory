public class House {
    // Instance variables
    // 1.they are at the top of the class
    // 2.they can be used anywhere, but psvm
    // 3. they have the word public before

    public int walls;
    public double size;
    public String owner;
    public String address;
    public boolean isOccupied;

    public House(){
        walls=4;
        size=3200.7;
        owner="Bobby";
        address= "362 center st";
        isOccupied= true;
    }
    //Constructor
    //Has no void
    //Same name as class
    //Is a special method
  public void printInfo(){
    System.out.println(walls);//not a readable way
    System.out.println("name of owner:"+owner);//a readable way
      System.out.println("address:" +address);//a more readable way

  }
  public House(double pSize, int pWalls, String pOwner, String pAddress, boolean pisOccupied){
        size = pSize;
        walls=pWalls;
        owner=pOwner;
        address=pAddress;
        isOccupied=pisOccupied;
        //pSize=size;

  }

}
