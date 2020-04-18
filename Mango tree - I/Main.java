#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n,t,i,j;
  cin>>m>>n>>t;
  if(t<=m || t%m==1 || t%n==0)cout<<"Yes";
  else cout<<"No";
  return 0;
}