#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n;
  cin>>m>>n;
  int a[m][n];
  int c[n];
  for(int i=0;i<n;i++)c[i]=0;
  for(int i=0;i<m;i++)
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  for(int j=0;j<n;j++)
    for(int i=0;i<m;i++)
      if(a[i][j]>c[j])c[j]=a[i][j];
  for(int i=0;i<n;i++)
    cout<<c[i]<<endl;
}