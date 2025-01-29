#include <iostream>
#include <vector>

// defining the find max function above main
int find_max(const std::vector<int>& lst) {
    if(lst.empty()){
        std::cerr << "Error: list is empty !" << std::endl;     //Checks if lst is empty and returns an error value 
        return -1; 
    }

    // intialize the first value which we intially assume is the max
    int max_value = lst[0];

    // for loop that loops through each element in the list, check if the elemnt is bigger than the max_value and if it is, gives the value of that element to the max_valye
    for (int element : lst ) {
        if ( element > max_value){
            max_value = element;
        }
    }
    return max_value;
}


int main() {
    // creata vector of numbers
    std::vector<int> numbers = {1, 8, 7, 5, 3, 2, 6};
    int findMax = find_max(numbers);
    std::cout << "The maximun value is: " << findMax << "\n";

    return 0;
}