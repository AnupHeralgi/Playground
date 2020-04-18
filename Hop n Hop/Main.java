#include<iostream>
using namespace std;
int main()
{
  int a=3,b=4,x,y,c=0;
  cin>>x>>y;
  while(1)
  {
	if(a==x && b==y)break;
    if(a!=x && b!=y){a++;b++;c++;}
    if(a==x && b!=y)
    {
      c=c+(y-b);
      b=y;
    }
    if(a!=x && b==y)
    {
      c=c+(x-a);
      a=x;
    }
  }
  cout<<c;
  return 0;
}