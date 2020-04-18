#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,c=0;
  cin>>n;
  int temp=n;
  while(temp>0){
    c++;
    temp/=10;
  }
  temp=n;
  temp*=temp;
  int num=1;
  for(int i=1;i<=c;i++)
    num=num*10;
  int sum=0;
  int n1=temp%num;
  temp=temp/num;
  int n2=temp%num;
  sum=n1+n2;
 
  if(sum==n)
    cout<<"Kaprekar Number";
  else cout<<"Not a Kaprekar Number";
  
}