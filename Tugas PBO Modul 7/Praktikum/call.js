var person = {
    fullname: function() {
        return this.firstName + " " + this.lastName
    }
}

var person1 = {
    firstName: "Rohman",
    lastName: "Beny R"
}

var person2 = {
    firstName: "Emii",
    lastName: "Sulistya"
}

// memanggil method dengan call()
var result = person.fullname.call(person2)

console.log(result);