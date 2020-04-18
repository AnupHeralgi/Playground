#include<iostream>
using namespace std;

int main()
{
  int n1,n2,n3,n4;
  cin>>n1>>n2>>n3>>n4;
  int s=0;
  if(n1<n2 && n1<n3)s=n1;
  else if(n2<n1 && n2<n3)s=n2;
  else s=n3;
  int gcd=0;
  
  while(s>=1)
  {
    if(n1%s==0 && n2%s==0 && n3%s==0)
    {
      gcd=s;break;
    }
    s--;
  }
  if(gcd==n4)cout<<"Answer is correct.";
  else cout<<"Answer is wrong.";
  return 0; 
}