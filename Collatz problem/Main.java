#include<iostream>
using namespace std;
int main()
{
int n,i,num;
  cin>>n;
  cout<<n<<endl;
  for(i=0;n!=1;i++)
  {
   if(n%2!=0)
  {
   n=3*n+1;
    cout<<n<<endl;
  }
  else if(n%2==0)
  {
    n=n/2;
    cout<<n<<endl;
  }
  }
  cout<<i<<endl;
  return 0;
  
}