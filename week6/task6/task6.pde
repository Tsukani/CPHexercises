//6.a
int a = 3,
    b = 7;

if (a == 10 || b == 10 || a+b == 10) {
  println("Success!");
} else {
  println("Failure!");
}

//6.b
int x = 6,
    y = 5,
    z = 19;

int forbiddenNumbers[] = {10, 20, 30};
for (int i = 0; i<forbiddenNumbers.length; i++) {
  if (x+y+z != 30 || (x == forbiddenNumbers[i] || y == forbiddenNumbers[i] || z == forbiddenNumbers[i])) {
    println("Failure!");
    //Returning to stop the loop
    return;
  } else if (i == forbiddenNumbers.length-1) {
    //Checking if i has cycled through the entire array before printing
    println("Success!");
  }
}
