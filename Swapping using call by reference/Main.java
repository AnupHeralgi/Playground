#include<iostream>
using namespace std;

void swaping(int &x,int &y)
{
  int temp=x;
  x=y;
  y=temp;
}
int main()
{
  int a,b;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" and b="<<b<<endl; 
  swaping(a,b);
  cout<<"After swapping a= "<<a<<" and b="<<b<<endl;
  
  return 0;
}
