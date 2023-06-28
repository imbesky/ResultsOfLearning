class Main {
  public static void main(String[] args) {
    // 정수 1개 저장을 위한 변수 선언
    int a; //선언
    a = 10;
  
    // 책 1권 저장을 위한 변수 선언
    Book b; //자바에서 Book이라는 자료형 제공해주지 않음 -> 자료형 생성 필요 -> class라는 도구 활용
    //패키지가 다르면 import필요
    //import package.class;
    b = new Book();//메모리에 객체 생성
    //변수의 주소값을 b에 대입
    //객체의 실체 instance
    //b는 인스턴스변수, 객체변수
    b.title = "책 제목";
    b.price = 10000;
    b.company = "출판사";
    b.page = 300;
    System.out.println(b.title);

    PersonVO p;
    p = new PersonVO();
    p.name = "회원이름";
    p.age = 22;
    p.weight = 100.0;
    p.height = 200.0;
    System.out.println(p.age);
    //배열과 class를 구분해서 알기
  }
}
