var person = {
    fullName: function(birth, city) {
        return this.firstName + " " + this.lastName + "," + birth + "," + city
    }
}

var person1 = {
    firstName: "Rohman",
    lastName: "Beny R"
}

// menggunakan apply
var result = person.fullName.apply(person1, ["Karanganyar", "April"])
console.log(result);