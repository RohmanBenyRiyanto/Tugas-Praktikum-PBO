// membuat fungsi dengan 1 parameter
function reflect(params) {
    return params
}

console.log(reflect("Halo"));
console.log(reflect("Hari ini hari ke " + 2));
console.log("Panjang argumen : " + reflect.length);

// meredefinisi fungsi reflect
reflect = function() {
    return arguments[1]
}

console.log(reflect("Halo"));
console.log(reflect("Hari ini hari ke " + 2));
console.log("Panjang argumen : " + reflect.length);