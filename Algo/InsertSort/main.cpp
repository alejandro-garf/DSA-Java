#include <iostream>

void insert_sort(int array[], int length);

int main(){

    int array[] = {1, 4, 6, 9, 7, 5, 2};
    int length = 7;

    insert_sort(array, length);

    for (int i = 0; i < length; i++)
    {
        std::cout << "Index [" << i << "] = " << array[i] << "\n";
    }
    
    return 0;
}

void insert_sort(int array[], int length)
{
    // iterates through each index of the array
    for (int i = 1; i < length; i++)
    {
        int key = array[i]; // The vaue of the index we are looking at
        int j = i - 1; // the index to the left of the index we are on
        // while the index hasn't reached zero anf the value of the index to the left is bigger than the current value, keeo running through the loop. 
        while (j >= 0 && array[j] > key)
        {
            //the value of the index to the left becomes the value of the index to the right
            array[j + 1] = array[j]; 
            j = j - 1; // The index keeps moving left with each loop 
        }
        // if the value of the index the left is less than the current value, the current index becomes the key 
        array[ j + 1 ] = key;
    }
}