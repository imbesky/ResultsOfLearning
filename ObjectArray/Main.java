class Main {
  public static void main(String[] args) {
    ObjectArray arr = new ObjectArray(3);
    arr.add(new A());
    arr.add(new B());
    arr.add(new A());
    //서로 다른 타입의 객체를 넣을 수 있음

    if(arr[0] instanceof A){
      ((A)arr[0]).go();
      //타입 확인 후 다운캐스팅 필요
    }
    System.out.println(arr.size());
  }
}
