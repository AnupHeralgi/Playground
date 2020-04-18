#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  string s1,s2;
  cin>>s1>>s2;
  int i,j;
  for(i=0,j=s2.length()-1;s1[i]!='\0' && j>=0; i++,j--)
    if(s1[i]!=s2[j])
      break;
 
  j=j+1;
  if(i==s1.length() && j==0)
 	cout<<"It is correct";   
  else cout<<"It is wrong";
}