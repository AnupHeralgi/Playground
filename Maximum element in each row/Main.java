#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n;
  cin>>m>>n;
  int a[m][n];
  int c[m];
  for(int i=0;i<m;i++)c[i]=0;
  for(int i=0;i<m;i++)
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  for(int i=0;i<m;i++)
    for(int j=0;j<n;j++)
      if(a[i][j]>c[i])c[i]=a[i][j];
  for(int i=0;i<m;i++)
    cout<<c[i]<<endl;
}