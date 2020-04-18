#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,f1=0,f2=1,f3=0;
  cin>>n;
  for(int i=2;i<=n;i++)
  {
    f1=f2;
    f2=f3;
    f3=f1+f2;
  }
  cout<<f3;
}