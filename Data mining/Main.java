#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int sum=0,r=0,sum1=0;
  while(n>0)
  {
    r=n%10;
    if(r%2==0)sum=sum+r;
    else sum1=sum1+r;
    n/=10;
  }
  if(sum==sum1)cout<<"Yes";
  else cout<<"No";
}