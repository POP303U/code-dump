fn main() {
    drawPattern(20,15,'H')
}

fn drawPattern(col: i32, row: i32, chr: char) {
    for _i in 0..row {
        println!("");
        for _i in 0..col {
            print!("{}",chr);
        }
    }
}
