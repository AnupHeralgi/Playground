#include<iostream>
using namespace std;

int bact(int m,int n)
{
  int bact=1;
  for(int i=1;i<=n;i++)
    bact=bact*m;
  return bact;
}
int main()
{
  int m,n,req;
  cin>>m>>n>>req;
  if(bact(m,n)>=req)
    cout<<"Doctor, you can proceed with your experiment.";
  else cout<<"Sorry Doctor! You need more bacteria.";
  return 0;
}