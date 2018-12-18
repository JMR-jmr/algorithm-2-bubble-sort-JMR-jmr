int[] test = {5,1,2,4,3};
int temp = 0;
int length = test.length;
for(int i = 0; i < length; i++){
  for(int j = 0; j <length - 1; j++)
  {
    if(test[i] > test[i + 1]){
      temp = test[i];
      test[i] = test[i + 1];
      test[i + 1] = temp;
    }
  
  }
  length--;
}
