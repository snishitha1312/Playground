#include<iostream>
using namespace std;
union employee
{
  char name[50];
  int salary;
};
int main()
{
  union employee e;
  cout << "Enter the Employee details" << endl;
  cout << "Enter the Employee name :";
  cin >> e.name;
  cout << endl;
  cout << "Enter the Employee salary :";
  cin >> e.salary;
  cout << endl;
  cout << "Employee Details" << endl << e.name << " " << e.salary;
}