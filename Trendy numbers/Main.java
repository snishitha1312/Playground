#include<iostream>
using namespace std;
int main()
{
int num,i;
  cin>>num;
  if(num/10>9)
  {
    num=num/10;
   if(num/10<=9)
   {
     num=num%10;
     if(num%3==0)
     {
       cout<<"Trendy Number";
     }
     else 
     {
       cout<<"Not a Trendy Number";
     }
   }
  else 
  {
    cout<<"Invalid Number";
  }
  }
  else 
  {
    cout<<"Invalid Number";
  }
  return 0;
}