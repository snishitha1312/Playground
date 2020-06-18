#include<iostream>
using namespace std;
struct employee
{
  int id;
  char name[100];
  int salary;
  int hra;
  int da;
  int medical;
  int PF;
  int insurance;
}person[10];
int main()
{
  int n,p;
  cout<<"Enter the number of employees: "<<endl;
  cin>>n;
  cout<<"Enter your input for every employee: "<<endl;
  for(int i=0;i<n;i++)
  {
    cout<<"Employee ID: "<<endl;
    cin>>person[i].id;
    cout<<"Employee Name: "<<endl;
    cin>>person[i].name;
    cout<<"Basic Salary, HRA: "<<endl;
    cin>>person[i].salary>>person[i].hra;
    cout<<"DA, Medical Allowance: "<<endl;
    cin>>person[i].da>>person[i].medical;
    cout<<"PF and Insurance: "<<endl;
    cin>>person[i].PF>>person[i].insurance;
  }
  cout<<"Enter employee ID to get payslip:"<<endl;
  cin>>p;
  for(int i=0;i<n;i++)
  {
  if(person[i].id==p)
  {
  cout<<"Salary Slip of "<<person[i].name<<endl;
  cout<<"Employee ID: "<<person[i].id<<endl;
  cout<<"Basic Salary: "<<person[i].salary<<endl;
  cout<<"House Rent Allowance: "<<person[i].hra<<endl;
  cout<<"Dearness Allowance: "<<person[i].da<<endl;
  cout<<"Medical Allowance: "<<person[i].medical<<endl;
  int gross=(person[i].salary+person[i].hra+person[i].da+person[i].medical)*12;
  cout<<"Gross Salary: "<<gross<<" Rupees"<<endl;
    cout<<"Deductions:"<<endl;
    cout<<"Provident fund: "<<person[i].PF<<endl;
    cout<<"Insurance: "<<person[i].insurance<<endl;
    int net=gross-((person[i].PF+person[i].insurance)*12);
    cout<<"Net Salary: "<<net<<" Rupees";
  }
  }
  return 0;
}