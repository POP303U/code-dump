fn main() {
    let x = five();
    let y = plus_one(5);

    another_function(10, 'h');
    math();
    
    println!("The value of x is: {x}");
    println!("The value of y is: {y}");
}
 
fn another_function(value: i32, unit_label: char) {
    println!("The measurement is: {value}{unit_label}");
}

fn math() {
    let y = {
        let x = 3;
        x + 1 //Expression, no Semi-colon
    };

    println!("The value of y is: {y}");
}

fn five() -> i32 {
    5
}

fn plus_one(x: i32) -> i32 {
    x + 1
}
