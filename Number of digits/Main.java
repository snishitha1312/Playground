#include <iostream>
using namespace std;
int numofDigits(int num)
{
    static int count=0;
    if(num>0)
    {
        count++;
        numofDigits(num/10);
    }
    else
    {
        return count;
    }
}
int main()
{
    int number;
    int count=0;   
    cout << "Enter the value of n" << endl;
    cin >> number;  
    count=numofDigits(number);
    cout << "The number of digits in " << number << " is " << count;
    return 0;
}