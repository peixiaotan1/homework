/*Program Name: Penname
 * Student Name: Xiaopei Tan
 * NET ID: xtan6
 * Student ID: 000-69-3762
 * Program Description: Lab 1: Penname; Get input and output the penname.*/


#include <iostream>
#include <string>
using namespace std;

int main() {
	string fName, mName, streetName, streetType, city;
	int age, streetNumber;
 
	//Take user input
	cout <<"Enter your first and middle names: ";
	cin  >> fName;
	cin  >> mName;
	cout << "Enter your age: ";
	cin  >> age;
	cout << "Enter your street number, name, and type: ";
	cin  >> streetNumber;
	cin  >> streetName;
	cin  >> streetType;
	cout << "Enter your city of birth: ";
	cin  >> city;

	//Output the result
	cout << "Your penname name is " << city << " " << streetName << "." << endl;
	cout << "You will write as a " << (streetNumber%age)*3 << " year old." << endl;
	cout << "Your address is " << (age*425)/streetNumber << " " << mName << " " << streetType << "." << endl;

	return 0;
}
