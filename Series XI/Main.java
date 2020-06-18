#include<iostream>
using namespace std;
int main()
{
int n;
  float first=95,dif=20.5,sum;
  cin>>n;
  cout<<first<<" ";
  for(int i=2;i<=n;i++)
  {
    sum=first+dif;
    first=sum;
    dif+=2;
    cout<<sum<<" ";
  }
  return 0;
}