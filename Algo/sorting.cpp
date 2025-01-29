// Bubble sort
#include <iostream>

//function declaration at the top
void sort(int array[], int size);

int main()
{
        //create an array
        int array[] = {10, 8 , 3, 1, 4, 5,9, 11};

        // get the size of the array
        int size = sizeof(array)/sizeof(array[0]);

        //sort the array
        sort(array, size);

        // Prints out every element in  the array
        for(int element : array){
            std::cout << element << " ";
        }
        return 0;
}
// Sorting algo 
void sort(int array[], int size){

    int temp;
    for(int i = 0; i < size - 1; i++){
        for (int j = 0; j < size - 1; j++){
            if(array[j] > array[j + 1]){
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }
}
