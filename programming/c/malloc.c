#include <stdio.h>
#include <stdlib.h>

void main() {
	char *buf = malloc(4);

	buf[0] = 'h';
	buf[1] = 'e';
	buf[2] = 'y';
	buf[3] = '\0';

	printf("%s", buf);
	free(buf);
}
