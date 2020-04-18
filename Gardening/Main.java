#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n,t,i,j;
  cin>>m>>n>>t;
  if(t>n && t<=2*n)
    cout<<"It is a mango tree";
  else if( t>=(n-1)*(m-1) && t<=(n*(m-1)))
    cout<<"It is a mango tree";
  else cout<<"It is not a mango tree";
  return 0;
}