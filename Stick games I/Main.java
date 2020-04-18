#include<iostream>
using namespace std;

void print(int n)
{
  if(n%2==0)
    cout<<"Mani Iyer";
  else cout<<"Arun Gupta";
}
int main()
{
  //Type your code here.
  int n,m;
  cin>>n>>m;
  print((n+m)+(n*m));
  return 0;
}