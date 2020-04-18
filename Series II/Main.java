#include<iostream>
using namespace std;

int main()
{
  int n;
  cin>>n;
  for(int i=11,j=1;j<=n;i+=4,j++)
    cout<<i*i<<" ";
}