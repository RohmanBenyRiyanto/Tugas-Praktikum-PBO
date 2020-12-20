function Mahasiswa(nim, nama, prodi) {
    this.nim = nim;
    this.nama = nama;
    this.prodi = prodi;

    //fungsi untuk menampilkan
    this.tampil = function() {
        console.log('NIM :', this.nim)
        console.log('Nama : ', this.nama)
        console.log('Prodi : ', this.prodi)
    }
}
let jmlMhs = prompt('Masukkan jumlah mahasiswa : ')

//array mahasiswa
var arrayMhs = []

//objek mahsiswa
let mhs = {}

for (let i = 0; i < jmlMhs; i++) {
    console.log(`\nMahasiswa ke- ${i}`)

    //buat objek mhs
    mhs = new Mahasiswa(
        prompt('Masukkan NIM : '),
        prompt('Masukkan Nama : '),
        prompt('Masukkan Prodi : ')
    )
    arrayMhs.push(mhs)
}

var editData = prompt('Ingin mengubah data? [ya/tidak] : ')

if (editData == 'ya') {
    var noMhs = prompt('Masukkan nomor urut mahasiswa : ')

    //tambah fungsi baru ke constructor
    Mahasiswa.prototype.edit = function() {
        nim = prompt('Masukkan NIM : ');
        nama = prompt('Masukkan Nama : ');
        prodi = prompt('Masukkan Prodi : ');
        this.tampil = this.tampil
        return { nim, nama, prodi, tampil }
    }

    let index = noMhs - 1
    arrayMhs[index] = arrayMhs[index].edit()

    console.lo('\nData setelah diubah')
    index = 1

    for (let in arrayMhs) {
        console.log(`\nMahasiswa ke-${index}`)
        index++
        arrayMhs[i].tampil()
    }
} else if (editData == 'tidak') {
    console.log('\nMahsiswa setelah diubah')
    index = 1

    for (let i in arrayMhs) {
        console.log(`\nMahasiswa ke-${index}`)
        index++
        arrayMhs[i].tampil()
    }
} else {
    console.log('Pilihan tidak sesuai')
}