const prompt = require('prompt-sync')()

let total = prompt('Berapa mahasiswa?\t: ')

var array = []

for (let i = 0; i < total; i++) {
    console.log(`\nMahasiswa ${i}`)

    let name = prompt('Masukan nama\t\t\t: ')
    let nim = prompt('Masukan Nim\t\t\t: ')
    let birth = prompt('Masukan tanggal lahir\t: ')

    let mahasiswa = new Mahasiswa(name, nim, birth)
    array.push(mahasiswa)
}

let index = 0

for (let x in array) {
    console.log(`\nMahasiswa \t: ${ index }`)
    index++
    console.log(`Nama \t\t\t: ${ array[x].name }`)
    console.log(`Tanggal lahir \t: ${ array[x].birth }`)
    console.log(`NIM \t\t\t: ${array[x].nim}`)
    console.log(`Umur \t\t\t: ${array[x].age() }`)
}

function Mahasiswa(name, nim, birth) {
    this.name = name
    this.nim = nim
    this.birth = birth
    this.age = function() {
        //Function untuk mendapatkan nilai dari ke n sampai akhir
        let year = this.birth.slice(this.birth.length - 4)
        return 2020 - year
    }
}