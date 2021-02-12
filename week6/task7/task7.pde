//7.a & 7.b
int input = -20;

if (input>=0) {
  //Positive input
  for(int i = 0; i<=input; i++) {
    println(((i==6) ? "six" : ((i==input/2) ? "HALF!" : i)));
  }
} else {
  //Negative input
  for(int i = 0; i>=input; i--) {
    println(((i==-6) ? "-six" : ((i==input/2) ? "HALF!" : i)));
  }
}
