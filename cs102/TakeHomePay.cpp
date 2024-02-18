/*Program name: TakeHomePay
 *Desription:   The program is to calculate
 *              the tax information about your salary.
 *Student Name: Xiaopei Tan
 *Student ID:   000693762
 *Net ID:       xtan6
 */

#include<iostream>
#include<iomanip>
using namespace std;

int main() {
	//Tax rates and income brackets
	const double taxRates[] = {0.10, 0.12, 0.22, 0.24, 0.32, 0.35};
	const double incomeBrackets[] = {10275, 41775, 89075, 170050, 215950, 539900};
	
	//Take user input
	double salary;
	cout << "Enter a salary: $";
	cin >> salary;
	
	if (salary < 15080) {
		cout << "This is less than minimum wage for a yearly salary." << endl;
		return 1;
	}
	

	//Calculation
	double incomeTax = 0;
	double takehomePay = salary;
	double remain = salary;
	double taxableAmount, ssTax, mTax;

	for (int i = 0; i < 6; i++) {
		if ( remain <= 0) {
			break;
		}
		if (i == 0){
			taxableAmount = incomeBrackets[i];
		} else {
			taxableAmount = min(remain, incomeBrackets[i]-incomeBrackets[i-1]);
		}
		incomeTax += taxRates[i] * taxableAmount;
		remain -= taxableAmount;
	}

	// For the last bracket remaining
	if (remain > 0){
		incomeTax += remain * 0.37;
	}	
	
	ssTax = salary * 0.062;
	mTax  = salary * 0.0145;
	takehomePay = salary - incomeTax - ssTax - mTax;

	//Format and output
	cout << fixed << setprecision(2);
	cout << "-----------------------------------" << endl;
	cout << left << setw(25) << "Yearly Salary:" << "$" << right << setw(9) << salary << endl;
	cout << left << setw(25) << "Social Security Tax:" << "$" << right << setw(9) << ssTax << endl;
	cout << left << setw(25) << "Medicare Tax:" << "$" << right << setw(9) << mTax << endl;
	cout << left << setw(25) << "Income Tax:" << "$" << right << setw(9) << incomeTax << endl;
	cout << "-----------------------------------" << endl;
	cout << left << setw(25) << "Take Home Salary:" << "$" << right << setw(9) << takehomePay << endl;
	cout << left << setw(25) << "Monthly Take Home Pay:" << "$" << right << setw(9) << takehomePay/12 << endl;


	return 0;

}
