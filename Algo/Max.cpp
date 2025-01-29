#include <iostream>

int main(){
    float min;
    int i;
    int L[] = {1,2,3,4,5};
    min = L[0];
    int n = sizeof(L)/sizeof(L[0]);
    for (i=1; i < n; i++)
        if (min > L[i])
            min = L[i];
    return min;
}