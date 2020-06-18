#include<iostream>
using namespace std;
int main()
{
int row,column,mat[10][10],max=0;
  cin>>row>>column;
  for(int i=0;i<row;i++)
  {
    for(int j=0;j<column;j++)
    {
      cin>>mat[i][j];
    }
  }
  for(int j=0;j<column;j++)
  {
    for(int i=0;i<row;i++)
    {
      if(max<mat[i][j])
        max=mat[i][j];
    }
    cout<<max<<endl;
    max=0;
  }
}