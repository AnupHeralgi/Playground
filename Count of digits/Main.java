#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,i=0;
  cin>>n;
  do{
    n=n/10;
    i++;
  }while(n>0);
    cout<<i;
  return 0;
    
  
}