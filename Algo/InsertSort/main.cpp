#include <iostream>

//declare function at the top of the program
// void insert_sort(int array[], int length);

int main() {

// create an arrat
int array[] = { 4, 2, 0, 9, 8, 3 };

//gives me the size of the array
int length = sizeof(array)/sizeof(array[0]);


for (int i = 1; i < length; i ++) {
        std::cout << i;
}

std::cout << "\n";

for (int i = 0; i < length; i ++) {
        std::cout << i;
}

    return 0;
}

/*void insert_sort(int array[], int length) 
    //create an outer loop that starts at the second index (first one is already sorted) and traverses through the entire array
    for (int i = 1; if i < length; i ++) {
        std::cout << i;
} */