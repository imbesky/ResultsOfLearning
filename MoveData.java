class Main {
  public static void main(String[] args) {
    //데이터 이동 -> 변수와 배열의 관계
    //case1
    int a, b, c;
    a=10;
    b=20;
    c=30;
    //a+b+c=? 메서드 처리 -> sum()
    sum(a,b,c);
    //변수가 많아지면 번거로워짐

    int[] nums = new int[3];
    //배열에 변수 담기
    nums[0] = 10;
    nums[1] = 20;
    nums[2] = 30;
    sum2(nums);
  }
  public static void sum(int a, int b, int c){
    System.out.println(a+b+c);
  }
  public static void sum2(int[] nums){
    int sum = 0;
    //반복문 활용
    for(int i=0;i<nums.length;i++){
      sum += nums[i];
    }
    System.out.println(sum);
  }
}
