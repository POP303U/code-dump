use std::io;

fn main() {
    let tup: (i32, f64, u8) = (500, 6.4, 1);
    let five_hundred = tup.0;
    let six_point_four = tup.1;
    let one = tup.2;

    let guess: u32 = "42".parse().expect("Not a number!");

    let a: [i32; 5] = [1, 2, 3, 4, 5];
    let b = ['b'; 5];

    let months = [
        "January",
        "February",
        "March",
        "April",
        "May",
        "June",
        "July",
        "August",
        "September",
        "October",
        "November",
        "December",
    ];

    let first = a[0];
    let second = a[1];

    read();
}

fn read() {
    let c = [1, 2, 3, 4, 5];

    println!("Enter an array index.");

    let mut index = String::new();

    io::stdin()
        .read_line(&mut index)
        .expect("Failed to read line");

    let index: usize = index
        .trim()
        .parse()
        .expect("Index entered was not a number");

    let element = c[index];

    println!("The value of the element at index {index} is: {element}");
}
/*
    let bit_8: i8 = -128;
    let ubit_8: u8 = 255;

    let bit_16: i16 = -32333;
    let ubit_16: u16 = 62521;

    let bit_32: i32 = -219239495;
    let ubit_32: u32 = 203949959;

    let bit_64: i64 = -6944932498234;
    let ubit_64: u64 = 655304923408234;

    let bit_128: i128 = -3425032509872384320983234;
    let ubit_128: i128 = 4350987435085083240984108204198;
*/
