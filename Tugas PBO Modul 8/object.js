var person = {
    firsName: "Emii",
    lastName: "Sulistya",
    year: 2001,
    fullname: function() {
        //Mengebalikan nilai dengan return
        //this merujuk pada object person
        return (this.firsName + " " + this.lastName)
    },
    age: function() {
        return 2001 - this.year
    },
};

//Akses property dengan cara kedua
console.log(`Object dari person\t: \n
name\t: ${perosn.fullname()}\n
year\t: ${person.year } \n
age\t: ${person.age()}`) //Memanggil method dalam object