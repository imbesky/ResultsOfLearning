class Main {
  public static void main(String[] args) {
    Tart bt = new BlueberryTart();
    //추상 클래스
    Cake cc = new ChocolateCake();
    //인터페이스
    //하위 클래스의 동작 방식을 몰라도 동작 가능

    bt.fruit();
    bt.bake();

    cc.taste();
    cc.piece();
  }
}
