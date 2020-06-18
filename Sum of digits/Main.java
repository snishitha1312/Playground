#include <iostream>
using namespace std;
int sumOfDigits(int a)
{
  if(a==0)
  {
    return 0;
  }
  else
  {
    return (a%10) + sumOfDigits(a/10);
  }
}

int main()
{
  int n;
  cout<<"Enter the value of n" << endl;
  cin>>n;
  cout<<"The sum of digits in "<< n << " is " <<sumOfDigits(n);
  return 0;
}