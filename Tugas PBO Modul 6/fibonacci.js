/**
 * Copyright 2020 ©Copyright Rohman Beny R (19104060)
 */
var fibonacci = function(n) {
    if (n === 1) {
        return [0, 1];
    } else {
        var s = fibonacci(n - 1);
        s.push(s[s.length - 1] + s[s.length - 2]);
        return s;
    }
};

console.log("Fibonacci : " + fibonacci(10));