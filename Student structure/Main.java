#include<iostream>
using namespace std;
struct student
  {
    int rn;
    int s1,s2,s3,s4,s5;
    int a;
  };
  int main()
  {
    struct student st[100];
    cout << "STUDENT MARKSHEET USING STRUCTURES" << endl;
    int n, i, avg[i], a[i];
    cout << "Enter the no of students" << endl;
    cin >> n;
    for( int i=0; i<n; i++)
    {
      cin >> st[i].rn;
      cin >> st[i].s1;
      cin >> st[i].s2;
      cin >> st[i].s3;
      cin >> st[i].s4;
      cin >> st[i].s5;
    }
    for(int i=0; i<n; i++)
    {
      avg[i]=(st[i].s1)+(st[i].s2)+(st[i].s3)+(st[i].s4)+(st[i].s5);
      a[i]=(avg[i])/5;
    }
    cout << "rn s1 s2 s3 s4 s5 avg grade" << endl;
    for(int i=0; i<n; i++)
    {
      
      cout << st[i].rn << " ";
      cout << st[i].s1 << " "<< st[i].s2 << " "<< st[i].s3 << " " << st[i].s4 << " " << st[i].s5 << " ";
      cout << a[i] << " ";
      if(a[i]>70)
        cout << "1";
      else if(a[i]<=70 && a[i]>=50)
        cout << "2";
      else if(a[i]<50)
        cout << "3";
      cout << endl;
    }
    
  }
    
    
    
  
