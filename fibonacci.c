#include <stdio.h>

int main() {

    int first = 0;
    int second = 1;
    int sum = 0;

    printf("%d\n",first);
    printf("%d\n",second);
    for (int i = 0; i < 18; i++) {
        sum = first + second;
        printf("%d\n", sum);
        first = second;
        second = sum;
    }
    return 0;
}