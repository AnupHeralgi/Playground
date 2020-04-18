#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a ,b ,c;
  cin>>a>>b>>c;
  if(a>b)
  {
	if(a<c)cout<<"The treasure is in box which has number "<<a<<endl;
    if(b>c)cout<<"The treasure is in box which has number "<<b<<endl;
    else cout<<"The treasure is in box which has number "<<c<<endl;
  }
  else
  {
    if(b>c)cout<<"The treasure is in box which has number "<<c<<endl;
    else cout<<"The treasure is in box which has number "<<b<<endl;
  }  
  int i=0;
  for(i=a;i>0;i--)if(a%i==0 && b%i==0 &&c%i==0)break;
  cout<<"The code to open the box is "<<i;
}