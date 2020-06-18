#include<iostream>
using namespace std;
int main()
{
 int n, a[15], i;
 int even_sum = 0, odd_sum = 0;
 
 cout << "Enter the number of elements in the array" << endl;
 cin >> n;
 
 cout << "Enter the elements in the array" << endl;
 for(i = 0; i < n; i++)
 {
      cin >> a[i];
 }
  
 for(i = 0; i < n; i ++)
 {
   if(a[i] % 2 == 0)
   {
 	even_sum = even_sum + a[i];
   }
   else
   {
 	odd_sum = odd_sum + a[i];
   }
 }
  
 cout << "The sum of the even elements in the array is " << even_sum;
 return 0;
}