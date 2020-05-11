#include <stdio.h>
#include <math.h>

int binarySearch(int array[], int arraySize, int target);

int binarySearch(int array[], int arraySize, int target) {
    int left = 0;
    int right = arraySize - 1;
    int middle;

    while (left <= right) {
        middle = floor((left + right) / 2);
        
        if (array[middle] < target) {
            left = middle + 1;
        } else if (array[middle] > target) {
            right = middle - 1;
        } else {
            return middle;
        }   
    }
    return -1;
}

int main() {
    int array[5] = {0, 1, 2, 3, 4};

    int result = binarySearch(array, 5, 5);
    printf("%d", result);
    
    return 0;
}