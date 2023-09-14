func generateFibonaccis(_ n: Int) -> [Int] {
    var fib = Array(repeating: 1, count: n)
    for i in 2..<n {
        fib[i] = fib[i - 2] + fib[i - 1]
    }
    return fib
}

var fib = generateFibonaccis(10)
print(fib.map({"\($0)"}).joined(separator: " "))
