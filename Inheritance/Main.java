class Main {
  public static void main(String[] args) {
    //Dessert를 상속하는 Madeleine과 Financier
    //upcasting을 통해 class파일만 있은 자식 파일도 동작시킬 수 있음
    Dessert m = new Madeleine();
    Dessert f = new Financier();
    //object casting 자동 형변환이 이루어짐
    //상속을 통해 부모의 기능을 자식 클래스에서 사용 가능하게 됨
    m.ingredient();
    f.temperature();
    //자식 타입에만 있는 메서드를 사용하려면 타입을 자식 타입으로 바꿔줘야 함 -> downcasting
    ((Financier)f).texture();
  }
}
