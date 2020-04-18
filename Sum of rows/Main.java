#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n;
  cin>>m>>n;
  int a[m][n],sum1[m];
  for(int i=0;i<m;i++)
    sum1[i]=0;
  for(int i=0;i<m;i++)
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  for(int i=0;i<m;i++)
    for(int j=0;j<n;j++)
    {
      sum1[i]=sum1[i]+a[i][j];
    }
  for(int i=0;i<m;i++)
  {
    cout<<sum1[i]<<endl;
  }
 
}