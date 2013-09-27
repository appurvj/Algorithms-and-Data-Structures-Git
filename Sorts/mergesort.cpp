#include<cstdlib>
#include<iostream>
#include<list>

void merge_sort(int start,int end, int* X){
  if(end - start > 1){
    int mid = start + (end-start)/2;
    merge_sort(start, mid, X);
    merge_sort(mid, end, X);   
    int * temp = new int[end - start]; //merge begins here
    int p = start;
    int q = mid;
    for(int i = 0; i < end - start; i++)
      temp[i] = p < mid && ( X[p] < X[q] || q>=end)? X[p++]:X[q++];
    for(int i = start; i < end; i++)
      X[i] = temp[i-start];
    delete temp;
    temp = 0; //merge ends here 
  }
}




using namespace std;
int main(void)
{
  int test[] = {10,1134, 45,23,35,128,8, 1};
  int size = sizeof(test)/sizeof(int);
  merge_sort(0, size, &test[0]);
  for(int i = 0; i < size; i++)
  {
    cout<<test[i]<<endl;
  }
  return 0;
}

