public class ChocolateCake implements Cake{
  //모든 추상 메서드를 오버라이드 해야 함
  public void taste(){
    System.out.println("초콜릿");
  }
  public void piece(){
    System.out.println(8);
  }
}
