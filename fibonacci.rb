def generate_fibonaccis(n)
    fib = [1, 1]
    (2...n).each do |i|
        fib[i] = fib[i - 1] + fib[i - 2]
    end
    fib
end

fib = generate_fibonaccis(10)
puts fib.join(" ")
