#include <iostream>
using namespace std;

int main() {
    string input;
    cout << "Enter a series of numbers: ";
    cin >> input;

    int count[10] = {0};  // Array to count occurrences of digits 0-9

    // Loop through each character in the input string
    for (int i = 0; i < input.length(); i++) {
        int digit = input[i] - '0';  // Convert character to integer
        count[digit]++;  // Increment the count of the digit
    }

    // Display the repeated numbers and their occurrences
    for (int i = 0; i < 10; i++) {
        if (count[i] > 1) {
            cout << i << ": " << count[i] << " times" << endl;
        }
    }

    return 0;
}
