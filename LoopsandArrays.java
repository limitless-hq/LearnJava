public class Main{
  public static void main(String[] args){

    System.out.println("Your Name is: ");
    concat();

    System.out.println("Random Number: ");
    math();

    System.out.println("Five in number form:");
    scase();

    System.out.println("Countdowm from 10: ");
    whileLoop();

    System.out.println("Number associated with letter in alphabet: ");
    forLoop();
  }
  public static void concat(){
    String firstName = "William";
    String lastName = " Roche";

    System.out.println(firstName.concat(lastName));
  }
  public static void math(){

    int randomNum = (int)(Math.random() *101);
    System.out.println(randomNum);

  }
  public static void scase(){

    String number = "five";
    switch(number){
      case "one":
        System.out.println(1);
        break;
      case "two":
        System.out.println(2);
        break;
      case "three":
        System.out.println(3);
        break;
      case "four":
        System.out.println(4);
        break;
      case "five":
        System.out.println(5);
        break;
      case "six":
        System.out.println(6);
        break;
      default:
        break;
    }
      
    }
  public static void whileLoop(){

    int x = 10;
    while(x>0){
      System.out.println(x);
      x--;
    }
  }
  public static void forLoop(){

    String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    int b = 0;
    for (int a = 1; a<=26; a++){
      System.out.print(a);
      System.out.print(" - ");
      System.out.println(alphabet[b]);
      b++;
    }
    
  }
}