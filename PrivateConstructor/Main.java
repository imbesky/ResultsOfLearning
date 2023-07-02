class Main {
  public static void main(String[] args) {
    Universe u = new Universe();
    //constructor가 private인 경우 사용 불가
    u.sun();
    //non-static method
    Universe.moon();
    //static method
    //constructor가 private 인 경우 모든 메서드가 static이어야 함
    //-> 객체 생성이 불가능하기 때문
  }
}
