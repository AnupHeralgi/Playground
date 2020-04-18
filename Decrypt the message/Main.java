#include<iostream>
using namespace std;
int main()
{
  int i=0,j=0,n1,n2,p=0;
  cin>>n1>>n2;
  p=n1+n2;
    for( j=1;j<p;j++)
    {
      if(p%j==0)
        i=i+j;
    }
  if(i==p)
    cout<<"They can read the message";
  else cout<<"They can't read the message";
  return 0;
}