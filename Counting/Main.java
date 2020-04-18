#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  getline(cin,s);
  int v=0,c=0,w=0,d=0,s1=0;
  for(int i=0;s[i]!='\0';i++)
  {
    if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' ||s[i]=='u' || s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U')
      v++;
    else if(s[i]>'a' && s[i]<='z' || s[i]>'A' && s[i]<='Z')
      c++;
    else if(s[i]==' ')
      w++;
    else if(s[i]=='1' || s[i]=='2' || s[i]=='3' || s[i]=='4' || s[i]=='5' || s[i]=='6' || s[i]=='7' || s[i]=='8' || s[i]=='9' || s[i]=='0')
      d++;
    else s1++;
  }
  cout<<"Vowels:"<<v<<endl;
  cout<<"Consonants:"<<c<<endl;
  cout<<"White Spaces:"<<w<<endl;
  cout<<"Digits:"<<d<<endl;
  cout<<"Symbols:"<<s1;
}