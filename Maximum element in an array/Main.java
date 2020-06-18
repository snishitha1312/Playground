#include<stdio.h>

#define MAX 100

int getMaxElement(int []); 
int size;

int main()
{
    int arr[MAX], max, i;
    printf("Enter the size of the array\n");
    scanf("%d", &size);
    printf("Enter %d elements of an array\n",size);

    for(i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }
    
    max = getMaxElement(arr);  
    printf("Maximum element in the array is %d",max);
 
    return 0;
}

int getMaxElement(int a[])
{
    static int i = 0, max =- 9999;  
    if(i < size)   
    {
        if(max < a[i])
        max = a[i];

        i++; 
        getMaxElement(a);
    }
    return max;
}