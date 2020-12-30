var mhsArray = [];

var app = (function() {

    const prompt = require('prompt-sync')();

    const prodiArray = ["S1 SE", "S1 IF", "S1 SI"]

    function addMahasiswa() {
        console.log("\n<===== Tambah mahasiswa =====>");
        nama = prompt("Input Nama \t\t: ")
        tanggalLahir = prompt("Input Tanggal Lahir \t: ")
        nim = prompt("Input NIM \t\t: ")

        console.log("\n<= Pilih Prodi")
        app.getProdi()

        tanyaProdi = prompt("Inputkan Angka Prodi \t: ")

        if (tanyaProdi > prodiArray.length) {
            throw "Prodi tidak tersedia";
        } else {
            prodi = tanyaProdi
        }

        return {
            nama: nama,
            tanggalLahir: tanggalLahir,
            nim: nim,
            prodi: prodi,
            grade: null
        }
    }

    function ask(inputName) {
        return prompt(inputName);
    }

    function getGrade(nilai) {
        if (nilai >= 80 && nilai <= 100) {
            return 'A'
        } else if (nilai >= 60 && nilai <= 79) {
            return 'B'
        } else if (nilai >= 40 && nilai <= 59) {
            return 'C'
        } else if (nilai >= 0 && nilai <= 39) {
            return 'D'
        }
    }

    function printMenu() {
        console.log("\n<===== Menu Penilaian =====>");
        console.log("1. Tambah mahasiswa");
        console.log("2. Penilaian");
        console.log("3. Lihat seluruh mahasiswa");
        console.log("4. keluar");
    }

    function getProdi() {
        for (let i = 0; i < prodiArray.length; i++) {
            console.log((i + 1) + ". " + prodiArray[i]);
        }
    }

    function getProdiArray() {
        return prodiArray
    }

    return {
        addMahasiswa: addMahasiswa,
        ask: ask,
        getGrade: getGrade,
        printMenu: printMenu,
        getProdi: getProdi,
        getProdiArray: getProdiArray
    }

}())

var loop = 1;

while (loop > 0) {
    app.printMenu()

    var menuYangDipilih = app.ask("Masukan Pillihan \t: ")

    switch (menuYangDipilih) {
        case '1':
            mhsArray.push(app.addMahasiswa())
            break;

        case '2':
            for (let m = 0; m < mhsArray.length; m++) {
                console.log("\nMahasiswa \t\t: " + (m + 1));
                console.log("Nama \t\t\t: " + mhsArray[m].nama);
                console.log("Tanggal lahir \t\t: " + mhsArray[m].tanggalLahir);
                console.log("NIM \t\t\t: " + mhsArray[m].nim);
                console.log("Prodi \t\t\t: " + app.getProdiArray()[mhsArray[m].prodi]);
                console.log("Grade \t\t\t: " + mhsArray[m].grade);
            }

            console.log("\n");

            var dataYangInginDiEdit = app.ask("Masukan nomor urut mahasiswa : ")
            var index = dataYangInginDiEdit - 1;

            var tanyaNilai = app.ask("Masukan nilai mahasiswa : ")

            mhsArray[index].grade = app.getGrade(tanyaNilai)

            console.log("Berhasil mengubah data.. ");

            break;

        case '3':
            for (let m = 0; m < mhsArray.length; m++) {
                console.log("\nMahasiswa \t\t: " + (m + 1));
                console.log("Nama \t\t\t: " + mhsArray[m].nama);
                console.log("Tanggal lahir \t\t: " + mhsArray[m].tanggalLahir);
                console.log("Nim \t\t\t: " + mhsArray[m].nim);
                console.log("Prodi \t\t\t: " + app.getProdiArray()[mhsArray[m].prodi]);
                console.log("Grade \t\t\t: " + mhsArray[m].grade);
            }
            break;

        case '4':
            console.log("Bye !!!");
            loop = 0
            break;

        default:
            console.log("Error : Menu " + menuYangDipilih + " tidak tersedia!");
    }
}