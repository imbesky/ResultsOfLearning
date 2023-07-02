class Main {
  public static void main(String[] args) {
    //int float char boolean -> PDT
    int a = 10;
    //기본적으로 제공되지 않는 자료형 -> UDDT
    Movie m = new Movie(); //객체 생성
    m.title = "영화 제목";
    m.length = 180;
    m.director = "영화 감독";
    m.cost = 10000;
  }
}
