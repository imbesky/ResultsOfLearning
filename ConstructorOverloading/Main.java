class Main {
  public static void main(String[] args) {
    Cookie c = new Cookie();
    //default constructor 사용
    System.out.print(c.taste+"\t");
    System.out.print(c.number+"개\t");
    System.out.print(c.shape+"\t");
    System.out.println(c.weight+"g");
    Cookie r = new Cookie("rasberry", 2, "르뱅", 450);
    //overloading된 constructor 활용
    System.out.print(r.taste+"\t");
    System.out.print(r.number+"개\t");
    System.out.print(r.shape+"\t");
    System.out.println(r.weight+"g");
  }
}
