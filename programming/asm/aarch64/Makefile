hello-world: hello-world.o
	ld -o hello-world hello-world.o

hello-world.o: hello-world.s
	as -o hello-world.o hello-world.s

clean:
	rm *.o

