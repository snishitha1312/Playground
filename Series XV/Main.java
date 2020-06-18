#include<iostream>
using namespace std;
int main()
{
int n, num,first=3,second=8;
  cin>>n;
  cout<<first<<" ";
  if(n>1)
  {
    cout<<second<<" ";
  }
  for(int i=3;i<=n;i++)
  {
   
    num=(first+second)+i-1;
    first=second;
    second=num;
    cout<<num<<" ";
  }
  return 0;
}