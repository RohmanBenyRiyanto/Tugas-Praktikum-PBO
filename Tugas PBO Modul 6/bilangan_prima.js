/**
 * Copyright 2020 ©Copyright Rohman Beny R (19104060) - 2020
 */
function bilPrime(num) {
    for (var i = 2; i < num; i++) {
        if (num % i === 0) {
            return false;
        }
    }
    return true;
}

function display(n) {
    var arr = [2];
    for (var i = 3; i < n; i += 2) {
        if (bilPrime(i)) {
            arr.push(i);
        }
    }
    console.log(" Bilangan Prima : " + arr); // gunakan hasil arr Anda sendiri
}
display(50);