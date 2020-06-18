#include<iostream>
using namespace std;
int is_prime_number(int num, int i)
{
  if(num < 2)
  {
    exit(0);
  }
  if (i == 1)
  {
    return 1;
  }
  else
  {
    if (num % i == 0)
    {
      return 0;
    }
    else
    {
      return is_prime_number(num, i - 1);
    }
  }
}
int main()
{
  int n, flag;
  cin >> n;
  flag = is_prime_number(n, n / 2);
  if (flag == 1)
  {
    cout << "Prime Number";
  }
  else
  {
    cout <<"Not a Prime Number";
  }
  return 0;
}