#include<iostream>
int main(){
  // Type your code here
  int n,f=1;
  std::cin>>n;
  for(int i=n;i>=1;i--)
    f=f*i;
  std::cout<<f;
  return 0;
}