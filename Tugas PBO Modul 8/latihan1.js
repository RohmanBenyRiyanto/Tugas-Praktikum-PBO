const prompt = require('prompt-sync')();

const prodi = ['S1 SE', 'S1 IF', 'S1 SI'];

let array = [];

function Mahasiswa(name, nim, birth, prodi, grade = null) {
    this.name = name;
    this.nim = nim;
    this.birth = birth;
    this.prodi = prodi;
    this.grade = grade;
    this.age = () => {
        let year = this.birth.slice(this.birth.length - 4);
        let nowYear = new Date().getFullYear();
        return nowYear - year;
    }
}

function detectGrade(nilai) {
    if (nilai >= 80 && nilai <= 100) {
        return 'A'
    } else if (nilai >= 60 && nilai < 80) {
        return 'B'
    } else if (nilai >= 40 && nilai < 60) {
        return 'C';
    } else if (nilai < 40) {
        return 'D';
    }
}

function printMenu() {
    console.log("\n<===== Menu Penilaian =====>");
    console.log("1. Tambah Mahasiswa");
    console.log("2. Penilaian");
    console.log("3. Lihat seluruh mahasiswa");
    console.log("4. Keluar\n");
}

var loop = true;

while (loop) {

    printMenu();
    let pilihan = prompt("Masukan Pilihan\t : ")

    switch (pilihan) {
        case '1':
            var total = prompt("\nMasukkan Jumlah mahasiswa : ");
            for (let i = 0; i < total; i++) {
                console.log("\n<=====Tambah Mahasiswal=====>")
                console.log("Mahasiswa " + (i + 1));
                let nama = prompt("Input Nama\t\t: ")
                let tglLahir = prompt("Input Tanggal Lahir\t: ")
                let nim = prompt("Input NIM\t\t: ")

                console.log("\nProdi");
                for (let j = 0; j < prodi.length; j++) {
                    console.log(j + ". " + prodi[j]);
                }

                let idprodi = prompt("Masukan id prodi : ")

                array.push(
                    new Mahasiswa(nama, nim, tglLahir, idprodi)
                )
            }
            break;

        case '2':
            console.log("<=====Penilaian Mahasiswa=====>\n");
            var inputNIM = prompt("Masukan Nim\t: ");
            var inputNilai = prompt("Masukan Nilai\t: ");

            for (let n = 0; n < array.length; n++) {
                if (array[n].nim == inputNIM) {
                    array[n].grade = detectGrade(inputNilai)
                }
            }

            break;

        case '3':
            console.log("\n<=====Data Mahasiswa=====>\n");
            for (let m = 0; m < array.length; m++) {
                console.log("Mahasiswa " + m);
                console.log("Nama \t\t: " + array[m].name);
                console.log("Tanggal lahir \t: " + array[m].birth);
                console.log("Umur \t\t: " + array[m].age());
                console.log("NIM \t\t: " + array[m].nim);
                console.log("Prodi \t\t: " + prodi[array[m].prodi]);
                console.log("Grade \t\t: " + array[m].grade);
                console.log("\n");
            }
            break;

        case '4':
            console.log('Selamat jalan Sayang');
            loop = false;
            break;

        default:
            printMenu();
            break;
    }
}