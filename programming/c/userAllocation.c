#include <stdio.h>
#include <stdlib.h>

void main() {
  int input;

  printf("How big do you want your buffer to be?: ");
  scanf("%i", &input);

  char *buf = malloc(input);

  for (int i = 0; i < input; i++) {
    char data = ' ';

    printf("Enter a value for byte %i", i);
    scanf(&data, "%c");

    buf[i] = data;
  }

  printf("%s", buf);
}
