#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  float t;
  cin>>n>>t;
  if(n==1)cout<<t;
  else if(n==2)cout<<t+t*0.5;
  else if(n==3)cout<<t*2;
  else cout<<"Number of items is more";
  return 0;
}