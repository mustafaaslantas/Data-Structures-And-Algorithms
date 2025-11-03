#include <stdio.h>

int main() {

    int array[] = {32, 16, 85, 53, 19, 22};

    int size = sizeof(array) / sizeof(array[0]);

    for (int i = 0; i < size-1; i++) {
        for (int j= 0; j < size-i-1; j++) {
            if (array[j] > array[j+1]) {
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }

    printf("Sorted array: ");
    for (int i = 0; i < size; i++) {
        printf("%d ", array[i]);
    }
    printf("\n");
    return 0;
}