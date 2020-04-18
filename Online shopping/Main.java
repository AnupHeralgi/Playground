#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x1,x2,x3,y1,y2,y3,z1,z2,z3;
  cin>>x1>>x2>>x3>>y1>>y2>>y3>>z1>>z2>>z3;
  cout<<"In Flipkart Rs."<<x1-(x1*(x2/100.0))+x3<<endl;
  cout<<"In Snapdeal Rs."<<y1-(y1*(y2/100.0))+y3<<endl;
  cout<<"In Amazon Rs."<<z1-(z1*(z2/100.0))+z3<<endl;
  if((x1-(x1*(x2/100.0))+x3)<=(y1-(y1*(y2/100.0))+y3))
  {
    if((x1-(x1*(x2/100.0))+x3)<=(z1-(z1*(z2/100.0))+z3))
      cout<<"He will prefer Flipkart";
    else cout<<"He will prefer Amazon";
  }
  else 
  {
    if((y1-(y1*(y2/100.0))+y3)<=(z1-(z1*(z2/100.0))+z3))
      cout<<"He will prefer Snapdeal";
    else 
      cout<<"He will prefer Amazon";
  }
  return 0;
  
}