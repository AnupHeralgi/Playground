#include <iostream>
using namespace std;
int main()
{
char str[100], rev[100];     
int count = 0, end, i;    
//Your code goes here   
  cin.getline(str,100);
  for(i=0;str[i]!='\0';i++);
  i=i-1;
  int j=0;
  for(j=0;i>=0;j++,i--)
    rev[j]=str[i];
  rev[j+1]='\0';
	cout<<rev;
  
}