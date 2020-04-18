#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  for(int i=11,j=1;j<=n;j++,i+=4)
  {
    cout<<i*i<<" ";
  }
}