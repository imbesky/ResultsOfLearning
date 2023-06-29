class Main {
  public static void main(String[] args) {
    //가변길이 2차원 배열
    char[][] star = new char[5][];
    for(int i=0; i<star.length;i++){
      star[i] = new char[i+1];
      for(int j=0;j<star[i].
         length;j++){
        star[i][j] = '*';
        System.out.print(star[i][j]);
         }
      System.out.println();
    }
}
}
