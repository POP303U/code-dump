.global _start

.section .data
    message:    .asciz "Hello, World!\n"

.section .text
_start:
    // Write the message to the standard output (file descriptor 1)
    mov     x0, 1              // File descriptor 1 (stdout)
    ldr     x1, =message       // Load the address of the message
    ldr     x2, =14            // Length of the message
    mov     x8, 64             // System call number for write
    svc     0                  // Perform the system call

    // Exit the program
    mov     x8, 93             // System call number for exit
    mov     x0, 0              // Exit status 0
    svc     0                  // Perform the system call
