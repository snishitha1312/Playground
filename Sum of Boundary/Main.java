#include<iostream>
using namespace std;

int main()
{
    int m, n, sum = 0;
    cin >> m >> n;
    int i, j;
    int mat[m][n];
    for(i = 0; i < m; i++)
    {
        for(j = 0; j < n; j++)
            cin >> mat[i][j];
    }

    for(i = 0; i < m; i++)
    {
        for(j = 0; j < n; j++)
        {
            if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
            {
                //cout << mat[i][j] << " ";
                sum = sum + mat[i][j];
            }
        }
    }
    cout << "Sum of boundaries is " << sum;
}