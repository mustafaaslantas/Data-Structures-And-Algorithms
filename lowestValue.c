#include <stdio.h>

int main() {

    int array[] = {10, 3, 8, 5, 7};
    int size = sizeof(array) / sizeof(array[0]);
    int min = array[0];

    for (int i = 0; i < size; i++) {
        if (array[i] < min) {
            min = array[i];
        }
    }

    printf("Lowest value in this array is %d.", min);
    return 0;
}