#include<iostream>
using namespace std;
int main()
{
int n,first=2,dif=3,num;
  cin>>n;
  cout<<first<<" ";
  for(int i=2;i<=n;i++)
  {
    num=first+dif;
    first=num;
    dif=dif*2;
    cout<<num<<" ";
  }
  return 0;
}