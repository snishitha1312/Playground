#include<iostream>
using namespace std;
int max(int a[],int n)
{
  int i,max;
  max=a[0];
  for(i=0;i<n;i++)
  {
    if(a[i]>max)
      max=a[i];
  }
  return max;
}
int main()
{
  int a[25][25],b[25],m,n,i,j;
  cin >> m >> n;
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
      cin >> a[i][j];
  }
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
      b[j]=a[i][j];
    cout << max(b,n) << endl;
}

}