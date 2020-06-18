#include<iostream>
using namespace std;
int main()
{
int n,sum,first=5,mul=11,c=1;
  cin>>n;
  cout<<first<<" ";
  for(int i=2;i<=n;i++)
  {
    sum=first+(mul*c);
    first=sum;
    c=c+2;
    cout<<sum<<" ";
  }
  return 0;
}