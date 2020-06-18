#include<iostream>
using namespace std;
union book
{
  char name[50];
  int price;
  char name1[50];
};
int main()
{
  union book b;
  cout << "Enter the Book details" << endl;
  cout << "Enter the Book name" << endl;
  cin >> b.name;
  cout << "Enter the Book price" << endl;
  cin >> b.price;
  cout << "Book Details" << endl;
  cout << b.name <<" " << b.price << endl;
  cout << "Enter the Book name" << endl;
  cin >> b.name1;
  cout << "Book Name : " << b.name1;
}