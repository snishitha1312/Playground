#include<iostream>
#include<cstring>
using namespace std;
int main ()
{
    char str[50];
    gets(str); 
    for (int i = 0; str[i] != '\0'; i++)
    {
        if (isalpha(str[i]))
        {
            if (islower(str[i]))
                str[i] = toupper(str[i]);
            else
                str[i] = tolower(str[i]);
        }
        else
	{
            cout << "Entered string is not alphabetical.";
            exit(0);
        }
    }
    cout << str;
}
