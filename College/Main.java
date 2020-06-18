#include<iostream>
using namespace std;
struct college
{
  char name[100];
  char city[100];
  int establishmentYear;
  float passPercentage;
};

int main()
{
  struct college c[50];
  int n;
  cout << "Enter the number of colleges" << endl;
  cin >> n;
  for(int i=0; i<n; i++)
  {
    cout << "Enter the details of college " << i+1 <<  endl;
    cout << "Enter name" << endl;
    cin >> c[i].name;
    cout << "Enter city" << endl;
    cin >> c[i].city;
    cout << "Enter year of establishment" << endl;
    cin >> c[i].establishmentYear;
    cout << "Enter pass percentage" << endl;
    cin >> c[i].passPercentage;
  }
  cout << "Details of colleges" << endl;
  for(int i=0; i<n; i++)
  {
    cout << "College:"<< i+1 << endl;
    cout << "Name:"<< c[i].name << endl;
    cout << "City:"<< c[i].city << endl;
    cout << "Year of establishment:"<<c[i].establishmentYear <<endl;
    cout << "Pass percentage:"<<c[i].passPercentage <<endl;
  }
  
 
}