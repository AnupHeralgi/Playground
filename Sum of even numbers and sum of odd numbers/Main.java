#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int a[n],sume=0,sumo=0;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
    if(a[i]%2==0)sume=sume+a[i];
    else sumo=sumo+a[i];
  }
  cout<<"The sum of the even numbers in the array is "<<sume<<endl;
  cout<<"The sum of the odd numbers in the array is "<<sumo;
  return 0;
  
}