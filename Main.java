class Main {
  public static void main(String[] args) {
    int high = 5 ;
    for(int i = 0; i<high; i++) {
      for(int k = 0; k<= i; k++) {
        System.out.print(" ");
      
      }
      for(int j = 0; j < 5-i ;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}