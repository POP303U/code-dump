fn main() {
    let mut number = 5;
    println!("{}", number);
    add_two(number);
    println!("{}", number);
}

fn add_two(mut num: i32): i32 {
    return num + 2;
}
