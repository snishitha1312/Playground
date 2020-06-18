#include<iostream>
using namespace std;
int main()
{
int n,sum=4,square;
  cin>>n;
  cout<<sum<<" ";
  for(int i=1;i<n;i++)
  {
    square=i*i;
    sum+=square;
      cout<<sum<<" ";
  }
  return 0;
}