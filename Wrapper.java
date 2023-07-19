class Main {
  public static void main(String[] args) {
    int n1 = 1;
    Integer n2 = new Integer(1);
    //신버전에서는 이 방법도 가능; boxing 기법
    Integer n3 = 1;
    System.out.println(n2.intValue());
    System.out.println(n2.toString());
    System.out.println(n2.parseInt());

    Object[] o = new Object[3];
    /* 방법 1
    o[0] = new Integer(1);
    o[1] = new Integer(2);
    o[2] = new Integer(3);*/
    
    //방법 2: boxing 기법 사용
    o[0] = 1;
    o[1] = 2;
    o[3] = 3;

    System.out.println(o[0].toString());
    System.out.println(o[1].toString());
    System.out.println(o[2].toString());
    //o[n]은 부모타입 toString()은 자식타입
    //toString()은 override됨

    //"1"+"1"=2
    String a = "1234";
    String b = "4321";
    //System.out.println(a+b); -> "12344321"
    int x = Integer.parseInt(a);
    int y = Integer.parseInt(b);
    System.out.println(x+y); //5555

    String n1 = String.valueOf(x);
    String n2 = String.valueOf(y);
    System.out.println(x+y);//"12344321"
  }
}
