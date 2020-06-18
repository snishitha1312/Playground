#include<iostream>
using namespace std;
int main()
{
  int n,s,i,sum=0;
  cin>>n>>s;
  int a[n];
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    sum=sum+a[i];
  }
  if(sum<=s)
  {
    cout<<"YES";
  }
  else
  {
    cout<<"NO";
  }
}
