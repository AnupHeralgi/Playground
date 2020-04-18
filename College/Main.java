#include<iostream>
using namespace std;

struct College
{
  char name[100];
  char city[100];
  int year;
  float p;
};

int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of colleges"<<endl;
  cin>>n;
  College C[n];
  for(int i=1;i<=n;i++)
  {
    cout<<"Enter the details of college "<<i<<endl;
    cout<<"Enter name"<<endl;
    cin>>C[i].name;
    cout<<"Enter city"<<endl;
    cin>>C[i].city;
    cout<<"Enter year of establishment"<<endl;
    cin>>C[i].year;
    cout<<"Enter pass percentage"<<endl;
    cin>>C[i].p;
  }
  cout<<"Details of colleges"<<endl;
  for(int i=1;i<=n;i++)
  {
    
    cout<<"College:"<<i<<endl;
    cout<<"Name:"<<C[i].name<<endl;
    cout<<"City:"<<C[i].city<<endl;
    cout<<"Year of establishment:"<<C[i].year<<endl;
    cout<<"Pass percentage:"<<C[i].p<<endl;
  }
  
}