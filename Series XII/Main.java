#include<iostream>
using namespace std;
int main()
{
int n,sum,first=9,dif=2;
  cin>>n;
  cout<<first<<" ";
  for(int i=2;i<=n;i++)
  {
    sum=first+dif;
    dif=first;
    first=sum;
    cout<<sum<<" ";
  }
  return 0;
}