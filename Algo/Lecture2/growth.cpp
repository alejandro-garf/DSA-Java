#include <iostream>

int find_min(int L[], int size) {
    // If the array is empty, return 0
    if (size == 0) {
        return 0;
    }

    // Initialize min with the first element of the array
    int min = L[0];

    // Loop through the array to find the minimum value
    for (int i = 1; i < size; i++) {
        if (min > L[i]) {
            min = L[i];  // Update min if a smaller element is found
        }
    }

    return min;  // Return the smallest element
}

int main() {
    int L[] = {0, 1, 22, 3, 19, 8};
    int size = sizeof(L) / sizeof(L[0]);  // Calculate array size

    int min_value = find_min(L, size);  // Call the function
    std::cout << "Minimum value: " << min_value << std::endl;

    return 0;
}
