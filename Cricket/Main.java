#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  int rr,br;
  rr=b-c;
  br=a-d;
  cout<<a/6<<endl;
  cout<<(d/6)+((d%6)/10.0)<<endl;
  cout<<fixed<<setprecision(1)<<(c/((d/6)+((d%6)/10.0)))<<endl;
  cout<<(float)b/(a/6)<<endl;
  if((c/((d/6)+((d%6)/10.0)))>b/(a/6))cout<<"Eligible to Win";
  else cout<<"Not Eligible to Win";
  return 0;
}