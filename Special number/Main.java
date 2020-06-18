#include<iostream>
using namespace std;
int main()
{
int m,n,i,num1,num2,special_number;
  cin>>m>>n;
  for(i=m;i<=n;i++)
  {
    num1=(i/10)+(i%10);
    num2=(i/10)*(i%10);
    special_number=num1+num2;
    if(special_number==i)
    {
      cout<<i<<endl;
    }
  }
  return 0;
}