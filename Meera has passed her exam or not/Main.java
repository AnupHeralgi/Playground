#include<iostream>
using namespace std;

int main()
{
  // Type your code here
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int m,flag=0;
  cin>>m;
  for(int i=0;i<n;i++)
    if(a[i]==m)
    {
      flag=1;
      break;
    }
  if(flag)cout<<"She passed her exam";
  else cout<<"She failed";
  return 0;
}