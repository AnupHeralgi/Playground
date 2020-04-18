#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  int n,sum=0;
  cin>>n;
  while(n>0)
  {
    sum=sum+n%10;
    n=n/10;
    sum*=10;
  }
  cout<<sum/10;
	return 0;
}