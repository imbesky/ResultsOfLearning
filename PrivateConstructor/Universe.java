public class Universe{
  private Universe(){
    
  }
  public void sun(){
    //static 키워드가 없으면 사용 불가
    System.out.println("태양은 항성입니다");
    //System도 constructor가 private한 class라서 이런 형태로 사용
    //메서드들은 전부 static함
  }
  public static void moon(){
    System.out.println("달은 위성입니다");
  }
}
