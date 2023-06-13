fn main() {
    // Safe Rust:
    let number = 10; 
    let num_pointer = &number; 

    println!("r is: {}", *num_pointer);

    // Unsafe Rust (Segmentation Fault):
    unsafe {
        let address = 0x70000000;
        let pointer = address as *const i32;

        println!("value at pointer is equal to {}", *pointer);
    }
}
