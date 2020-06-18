#include<stdlib.h>
#include<iostream>
using namespace std;
#define NO_OF_CHARS 256

int *get_char_count(char *str)
{
    int *count = (int *)calloc(sizeof(int), NO_OF_CHARS);
    int i;
    for (i = 0; *(str+i); i++)
        count[*(str+i)]++;
    return count;
}
int first_non_repeating_character(char *str)
{
    int *count = get_char_count(str);
    int index = -1, i;
for (i = 0; *(str+i); i++)
    {
        if (count[*(str+i)] == 1)
        {
            index = i;
            break;
        }
    }
    return index;
}

int main()
{
    char str[NO_OF_CHARS];
    cin >> str;
    int index = first_non_repeating_character(str);
    if (index == -1)
        cout << "All the characters are repetitive";
    else
        cout << str[index];
    return 0;
}