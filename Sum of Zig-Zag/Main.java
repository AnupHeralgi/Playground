#include<iostream>
using namespace std;

int main()
{
  int n,m,sum=0;
  cin>>m>>n;
  int a[m][n];
  for(int i=0;i<m;i++)
    for(int j=0;j<n;j++)
    {
      cin>>a[i][j];
      if(i+j==n-1)
        sum=sum+a[i][j];
    }
  for(int i=0;i<=0;i++)
  {
    for(int j=0;j<n;j++)
      sum=sum+a[i][j];
  }
  sum=sum-a[0][n-1];
  for(int i=m-1;i<=m-1;i++)
    for(int j=0;j<n;j++)
      sum=sum+a[i][j];
      sum=sum-a[m-1][0];
  cout<<"Sum of Zig-Zag pattern is "<<sum;
}
  