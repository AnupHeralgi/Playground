#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  if(n<=200)
    cout<<"Rs."<<n/2;
  else if(n<=400)
    cout<<"Rs."<<n*0.65+100;
  else if(n<=600)
    cout<<"Rs."<<n*0.80+200;
  else cout<<"Rs."<<n*1.25+425;
  return 0;
    
}