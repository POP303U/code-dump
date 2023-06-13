fn main() {
    let mut run = true;
    let mut counter = 0;

    while run {
        counter += 1;

        if counter == 10000 {
            run = false;
        }

        println!("counter: {} run: {}", counter, run);
    }

}
