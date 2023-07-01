class Main {
  public static void main(String[] args) {
    int m = multiply(364,29);
    //main()가 method area의 static zone에서 시작되면 stack area에 호출 정보 push
    //이 다음에는 multiply가 push됨
    System.out.println(m);
    Main main = new Main();
    //static 키워드가 없는 메소드 사용을 위한 방법.
    //이때 객체는 heap area에 생성됨
    float d = main.divide(527, 82);
    System.out.println(d);
  }
  public static int multiply(int a, int b){
    //static 키워드를 가지면 method area의 static zone으로 로딩됨
    // 즉 자동으로 고정된 위치에 자동으로 로딩되게 만드는 키워드임
    return a*b;
  }
  public float divide(float a, float b){
    //static 키워드가 없는 메소드는 static zone에 저장되지 않음
    return (a/b);
  }
}
