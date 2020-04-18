#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a,c=0,sum=0;
  cin>>n;
  while(sum<n)
  {
    cin>>a;
    sum=sum+a;
    c++;
  }
  cout<<"The number of turns is "<<c;
  return 0;
    
  
  
}