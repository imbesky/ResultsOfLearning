class Main {
  public static void main(String[] args) {
    System.out.println(sum(239,813));
    int[] nums = {3,28,2,483,92};
    System.out.println(arrSum(nums));
    
    int[] arr = makeArr(10);
    int s = 0;
    for(int i=0;i<arr.length;i++){
      s += arr[i];
    }
    System.out.println(s);
  }
  public static int sum(int a, int b){
    //main에서 호출하기 위해 sum()이 메모리에 로딩되어 있어야 함
    //static 함수가 다른 함수 호출시 같은 static이어야 바로 호출 가능
    return a+b;
  }
  public static int[] makeArr(int n){
    int[] arr = new int[3];
    arr[0]=n-1;
    arr[1]=n;
    arr[2]=n+1;
    return arr;
  }
  public static int arrSum(int[] arr){
    int sum = 0;
    for(int i=0;i<arr.length;i++){
      sum += arr[i];
    }
    return sum;
  }
}
