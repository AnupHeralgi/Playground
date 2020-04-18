#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  cout<<"0"<<" ";
  for(int i=2;i<=n;i++)
  {
    if(i%2==0)
      cout<<i*i-2<<" ";
    else cout<<i*i-1<<" ";
  }
}