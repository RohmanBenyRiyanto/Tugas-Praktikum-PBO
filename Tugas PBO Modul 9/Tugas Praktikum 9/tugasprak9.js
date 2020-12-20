const prompt = require('prompt-sync')()

function Hewan(nama, jenis, umur, makanan, riwayat_penyakit) {
    this.nama = nama
    this.jenis = jenis
    this.umur = umur
    this.makanan = makanan
    this.riwayat_penyakit = riwayat_penyakit

    // Fungsi untuk menampilkan
    this.tampil = function() {
        console.log('Nama\t\t\t\t: ', this.nama)
        console.log('Jenis\t\t\t\t: ', this.jenis)
        console.log('Umur\t\t\t\t: ', this.umur)
        console.log('Makanan\t\t\t\t: ', this.makanan)
        console.log('Riwayat Penyakit\t: ', this.riwayat_penyakit)
    }
}

// Array
var array = [] // Deklarasi array tanpa value
    // Object 
var hewan = {} // Deklarasi object tanpa value

var cek = false

do {
    console.log('Selamat Datang di Pet Shop Snow Ball')
    console.log()

    console.log('<========Menu========>')
    console.log('1. Tambah Hewan')
    console.log('2. Edit Hewan')
    console.log('3. Tampilkan Hewan')
    console.log('4. Exit')
    console.log()
    let pil = prompt('Masukkan Pilihan Menu\t: ')

    console.log()

    if (pil == 1) {
        let jmlHewan = prompt('Masukkan Jumlah Hewan\t: ')

        for (let i = 0; i < jmlHewan; i++) {
            console.log(`\nHewan ke-${i}`);
            hewan = new Hewan(
                prompt(`Masukkan Nama\t\t\t\t: `),
                prompt(`Masukkan Jenis\t\t\t\t: `),
                prompt(`Masukkan Umur\t\t\t\t: `),
                prompt(`Masukkan Makanan\t\t\t: `),
                prompt(`Masukkan Riwayat Penyakit\t: `)
            )
            array.push(hewan)
        }
        console.log()

    } else if (pil == 2) {
        var noHewan = prompt('Masukkan Nomer Urut Hewan\t: ')

        // Tambah fungsi baru ke constructor
        Hewan.prototype.edit = function() {
            nama = prompt(`Masukkan Nama\t: `),
                jenis = prompt(`Masukkan Jenis\t: `),
                umur = prompt(`Masukkan Umur\t: `),
                makanan = prompt(`Masukkan Makanan\t: `),
                riwayat_penyakit = prompt(`Masukkan Riwayat Penyakit\t: `),
                tampil = this.tampil
            return { nama, jenis, umur, makanan, riwayat_penyakit, tampil }
        }

        let index = noHewan - 1
        array[index] = array[index].edit()

        console.log('\nData Berhasil Dirubah')
        console.log()

    } else if (pil == 3) {
        index = 1

        // Mencetak output program
        for (let x in array) {
            console.log(`\nHewan ke-${index}`);
            index++;
            array[x].tampil()
        }
        console.log()

    } else if (pil == 4) {
        cek = true
        console.log('Bye!!!')

    } else {
        console.log('Maaf inputan anda salah')
        console.log()
    }
} while (!cek)