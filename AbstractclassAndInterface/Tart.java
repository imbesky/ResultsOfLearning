public abstract class Tart{
  public abstract void fruit();
  //추상 메서드 = 불완전한 메서드
  public void bake(){
    System.out.println("180도 15분");
  }
  //abstract하지 않은 메서드는 반드시 override해야하는 건 아님
}
