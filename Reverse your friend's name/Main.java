#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
//Type your code here
  string s;
  getline(cin,s);
  string::iterator i;
  for(auto i=s.rbegin();i<s.rend();i++)
    cout<<*i;
}