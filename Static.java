public class Static {

  static String name = "Rohan";
  
  static void myStaticMethod() {
    System.out.println("Static Method Called");
  }

  public void myPublicMethod() {
    System.out.println("Public method Called");
  }

  public static void main(String[ ] args) {
    myStaticMethod(); 
    Static myObj = new Static();
    myObj.myPublicMethod();
	System.out.println(name);
  }
}