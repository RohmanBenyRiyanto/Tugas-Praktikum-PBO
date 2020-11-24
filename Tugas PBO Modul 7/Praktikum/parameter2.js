function sum() {
    var result = 0;
    i = 0;
    len = arguments.length

    // melakukan perulangan sebanyak argumen
    // yang diinputkan
    while (i < len) {
        result += arguments[i]
        i++
    }

    return result
}

console.log(sum(1, 4));
console.log(sum(3, 5, 2, 7));
console.log(sum());