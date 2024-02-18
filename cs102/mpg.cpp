/*Program name: MPG Calculator
 *Desription:   The program is to calculate
 *              the average MPG for cars and trucks.
 *Student Name: Xiaopei Tan
 *Student ID:   000693762
 *Net ID:       xtan6
 */

#include<iostream>
#include<limits>
#include <string>
using namespace std;

//clear to input stream
void clearStream(){
	cin.clear();
	cin.ignore(numeric_limits<streamsize>::max(), '\n');	
}


int main(){
	string command;
	double carMile = 0;
	double carGal = 0;
	double truckMile = 0;
	double truckGal = 0;
	bool hasCar = false;
	bool hasTruck = false;
	double value; // for input
		
	while (true) {
		//Ask command first
		cout << "Enter command: ";
		cin >> command;
	
		//car stage
		if (command == "car"){
			hasCar = true;
			while (true){
				cout << "Enter car's miles: ";
				clearStream();
				if (cin >> value) {
					carMile += value;
					break;
				} 				
			}
			while (true){
				cout << "Enter car's gallons: ";
				clearStream();
				if (cin >> value) {
					carGal += value;
					break;
				}
			}
		clearStream(); //clear stream for command.

		// truck stage	
		} else if(command == "truck"){
			hasTruck = true;
			while (true){
				cout << "Enter truck's miles: ";
				clearStream();
				if (cin >> value) {
					truckMile += value;
					break;
				} 
			}
			while (true){
				cout << "Enter truck's gallons: ";
				clearStream();
				if (cin >> value) {
					truckGal += value;
					break;
				}
			}
		clearStream();//clear stream for command.

		//done stage and output the result
		} else if(command == "done"){
			if (hasCar){
				cout << "Average car MPG = " << carMile/carGal <<endl;
			} else {
				cout << "Fleet has no cars." << endl;
			}
			
			if (hasTruck){
				cout << "Average Truck MPG = " << truckMile/truckGal <<endl;
			} else {
				cout << "Fleet has no trucks." << endl;
			}
			return 1;
		
		
		} else {
			cout << "Unknown command." << endl;
		}


	}
	return 0;
}