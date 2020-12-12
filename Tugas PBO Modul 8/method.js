const prompt = require('prompt-sync')()

let total = prompt('Berapa mahasiswa?\t:')

var array = [] //Deklarasi array tanpa value
var mahasiswa = {} //Deklarasi object tanpa value

for (let i = 0; i < total; i++) {
    console.log(`\nMahasiswa ${ i }`)
    mahasiswa = new Object({
        name: prompt('Masukkan nama\t\t\t: '),
        birth: prompt('Masukan tanggal lahir\t: '),
        nim: prompt('Mahsukan NIM\t\t\t: '),
        age: function() {
            //functuin slice untuk mendapatkan nilai dari ke n sampau akhir
            let year = this.birth.slice(this.birth.length - 4)
            return 2020 - year
        }
    })
    array.push(mahasiswa)
}
let index = 0

for (let x in array) {
    console.log(`\nMahsiswa \t: ${ array[x].name }`)
    index++
    console.log(`Nama \t\t\t: ${ array[x].name }`)
    console.log(`Tanggal lahir \t: ${ array[x].birth }`)
    console.log(`Nim \t\t\t: ${ array[x].nim }`)
    console.log(`Umur \t\t\t: ${ array[x].age() }`)
}