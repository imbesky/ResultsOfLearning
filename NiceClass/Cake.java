public class Cake{
  private String taste;
  private int piece;
  //명시적으로 디폴트 생성자 만들기
  public Cake(){}
  public Cake(String taste, int piece){
    this.taste = taste;
    this.piece = piece;
  }
  public void setTaste(String taste){
    //setter 메소드의 역할: Dependency Injection 종속객체 주입
    this.taste = taste;
  }
  public String getTaste(){
    return taste;
  }
  //getter와 setter 메서드 필요
  //이클립스에서는 자동으로 만들기 가능
  public void setPiece(int piece){
    //잘못된 데이터 판별도 가능함
    if(piece>=0&&piece<9){
      this.piece = piece;
    } else if(piece>8){
      System.out.println("조각의 개수가 너무 많습니다.");} else{
      System.out.println("유효하지 않은 조각 수입니다.");}
  }
  public int getPiece(){
    return piece;
  }
  public String toString(){
    return "Cake: "+taste+", "+piece+"조각";
  }
}
