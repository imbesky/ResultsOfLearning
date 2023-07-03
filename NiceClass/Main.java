class Main {
  public static void main(String[] args) {
    Pudding p = new Pudding();
    p.taste = "초코푸딩";
    p.number = 5;
    p.color = "갈색";
    p.weight = 200;
    System.out.println(p.taste);
    //정보은닉이 되어있지 않아 데이터에 그냥 접근 가능한 클래스
    //직접 접근이 가능하면 잘봇된 데이터를 넣을 수 있음
    Cake c = new Cake("생크림", 8);
    //정보 은닛이 되어 있으면 이런 방식으로 정보를 읽고 수정해야 함
    System.out.println(c.getPiece());
    c.setTaste("레드벨벳");
    System.out.println(c.getTaste());
    //조건 설정 가능
    c.setPiece(10);
    //객체가 가지고 있는 값을 한 번에 출력해주는 메서드
    //디버깅에 용이함
    System.out.println(c);
    // toString은 생략 가능
    //System.out.println(c.toString()); 이것과 동일함
  }
}
