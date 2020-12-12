var person = new Biodata('Emii', 'Sulistya', 2001)

console.log('Object dari person\t: ')
    //Memanggil method
console.log(`Name\t: ${ person.fullname() }`)
console.log(`Tahun\t: ${ person.year }`)
console.log(`Umur\t: ${ person.age() }`)

function Biodata(firstName, lastName, year) {
    this.firstName = firstName
    this.lastName = lastName
    this.year = year
    this.fullname = function() {
        return (this.firstName + " " + this.lastName)
    }
    this.age = function() {
        return 2020 - this.year
    }
}