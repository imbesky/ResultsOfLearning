public class Cookie{
  public String taste;
  public int number;
  public String shape;
  public int weight;
  //cunstructor가 객체를 생성
  //만들어진 개체는 초기화 가능
  public Cookie(){
    //constructor가 하나도 없으면 default constructor가 생성됨
    //지금은 있기 때문에 생성되지 않음
    //initializing 초기화
    this.taste = "초코";
    //this 생략 가능 but 있어야 가독성 좋음
    number = 1;
    shape = "원형";
    weight = 430;
    //힙 메모리에 데이터 형성
  }
  public Cookie(String taste, int number, String shape, int weight){
    //overloading
    this.taste = taste;
    this.number = number;
    this.shape = shape;
    this.weight = weight;
  }
}
