#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a[20];
  cout<<"Enter the number of elements in the array"<<endl;
  int n;
  cin>>n;
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++)
    cin>>a[i];
  cout<<"Enter the location where you wish to insert an element"<<endl;
  int pos;
  cin>>pos;
  if(pos<=n)
  {
  cout<<"Enter the value to insert"<<endl;
  int q;
  cin>>q;
  cout<<"Array after insertion is"<<endl;
    for(int i=0;i<pos-1;i++)
      cout<<a[i]<<endl;
    cout<<q<<endl;
    for(int i=pos-1;i<n;i++)
      cout<<a[i]<<endl;
  }
  else cout<<"Invalid Input";
  
    
  
}