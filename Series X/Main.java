#include<iostream>
using namespace std;
int main()
{
int n, first=2,second=3;
  int sum;
  cin>>n;
cout<<first<<" ";
  if(n>1)
  {
cout<<second<<" ";
  }
 
  for(int i=3;i<=n;i++)
  { 
    sum=(second+first)*(second-first)+second;
    cout<<sum<<" ";
    first=second;
    second=sum;
  }
    return 0;
      
}