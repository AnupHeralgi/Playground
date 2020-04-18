#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n;
  cin>>m>>n;
  int a[m][n],sum1[m],sum2[n];
  for(int i=0;i<m;i++)
    sum1[i]=0;
  for(int j=0;j<n;j++)
    sum2[j]=0;
  for(int i=0;i<m;i++)
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  for(int i=0;i<m;i++)
    for(int j=0;j<n;j++)
    {
      sum1[i]=sum1[i]+a[i][j];
      sum2[j]=sum2[j]+a[i][j];
    }
  int max1=0,max2=0,ind1=0,ind2=0;
  cout<<"Sum of rows is ";
  for(int i=0;i<m;i++)
  {
    cout<<sum1[i]<<" ";
    if(sum1[i]>max1){max1=sum1[i];ind1=i;}
  }
  cout<<endl;
  cout<<"Row "<<ind1+1<<" has maximum sum"<<endl;
  cout<<"Sum of columns is ";
  for(int i=0;i<n;i++)
  {
    cout<<sum2[i]<<" ";
    if(sum2[i]>max2){max2=sum2[i];ind2=i;}
  }
  cout<<endl;
  cout<<"Column "<<ind2+1<<" has maximum sum";
  
  
  
}