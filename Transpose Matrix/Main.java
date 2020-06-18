#include<iostream>
using namespace std;
int main()
{
int array[50][50],i,j,n;
  cin>>n;
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>array[i][j];
      cout<<array[i][j]<<" ";
    }
       cout<<endl;
  }
  cout<<"Transpose matrix is:"<<"\n";
    for(j=0;j<n;j++)
    {
      for(i=0;i<n;i++)
      {
        cout<<array[i][j]<<" ";
      }
      cout<<endl;
    }
 

  return 0;
}