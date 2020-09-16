

class squareSum {
  public static void main(String[] args) {
    int[] test = {1,2,2};
    System.out.println(squareSum(test));
  }


  public static int squareSum(int[] n)
  { 

    int answer = 0;
    for(int i : n){
      int j = i * i;
      answer += j;
    }
   return answer;
  }
}