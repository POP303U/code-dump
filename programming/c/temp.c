#include <stdio.h>
#include <stdlib.h>

#define BUF_SIZE 4096

void main() {
	char name[BUF_SIZE];

	printf("What is your name?");
	scanf("%s", &name);

	sayHello(name);
}

void sayHello(char &name) {
	printf("%s", name);
}
