#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,e=0,f=0;
  cin>>a>>b>>c>>d;
  e=a+c;
  f=b+d;
  if(f>100)
  {
    e+=1;
    f=f-100;
  }
  cout<<e<<endl;
  cout<<f;
  return 0;
  
}