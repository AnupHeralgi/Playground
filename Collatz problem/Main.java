#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,c=0;
  cin>>n;
  cout<<n<<endl;
  while(n!=1)
  {
    c++;
    if(n%2==1)
    {
      n=3*n+1;
    }
    else n=n/2;
    cout<<n<<endl;
  }
  cout<<c;
}