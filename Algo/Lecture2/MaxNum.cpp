#include <iostream>
#include <vector>
#include <limits>

// defining the find max function above main
int find_max(const std::vector<int>& lst) {
    if(lst.empty()){
        std::cerr << "Error: list is empty !" << std::endl;     //Checks if lst is empty and returns an error value 
        return std::numeric_limits<int>::min(); //returns smalles possoble integer value
    }

    int left = 0; //start from the first element
    int right = lst.size() -1; // start from the last element

    // intialize the first value which we intially assume is the max
    int max_value = std::numeric_limits<int>::min(); // makes sure we start at the lowest possible value

    // two pointer loop
    while (left <= right) {
        max_value = std::max(max_value, lst[left]); // compare left pointer
        max_value = std::max(max_value, lst[right]);// compare right pointer

        left++;  // move left pointer right
        right--; // moce right pointer left
    }
    return max_value;
}


int main() {
    // create vector of numbers
    std::vector<int> numbers = {1, 8, 7, 5, 3, 2, 6};
    int findMax = find_max(numbers);
    std::cout << "The maximun value is: " << findMax << "\n";

    return 0;
}