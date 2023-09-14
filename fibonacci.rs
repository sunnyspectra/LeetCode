fn print_fib(n: usize) {
    let mut x = (1, 1);
    for i in 0..n {
        print!("{} ", x.0);
        x = (x.1, x.0 + x.1)
    }
}

fn main() {
    print_fib(10);
}
