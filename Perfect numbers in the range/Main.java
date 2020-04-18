#include<iostream>
using namespace std;

int main()
{
  int r1,r2,sum=0;
  cin>>r1>>r2;
  for(int i=r1;i<=r2;i++)
      {
        sum=0;
        for(int j=1;j<i;j++)
        {
          if(i%j==0)
            sum=sum+j;
        }
        if(sum==i)
          cout<<i<<" ";;
      }
      return 0;
}          