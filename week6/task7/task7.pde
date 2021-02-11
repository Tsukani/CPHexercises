//7.a & 7.b
int input =- 20;

if (input>=0) {
  //Positive input
  for(int i = 0; i<=input; i++) {
    if (i==6) println("six");
    else if (i==input/2) println("HALF!");
    else println(i);  
  }
} else {
  //Negative input
  for(int i = 0; i>=input; i--) {
    if (i==-6) println("-six");
    else if (i==input/2) println("HALF!");
    else println(i);
  }
}
