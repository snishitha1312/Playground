#include<iostream>
#include<math.h>
using namespace std;
int main()
{
int x1,y1,r1,x2,y2,r2,r,d1,d2,d;
  cin>>x1>>y1>>r1>>x2>>y2>>r2;
  d1=(x2-x1)*(x2-x1);
  d2=(y2-y1)*(y2-y1);
  d=d1+d2;
  d=sqrt(d);
  r=(r1+r2);
  if(d==r)
  {
    cout<<"Tangential";
  }
  else if(d<r)
  {
    cout<<"Overlap";
  }
  else 
  {
    cout<<"Do not Overlap";
  }
  return 0;
}