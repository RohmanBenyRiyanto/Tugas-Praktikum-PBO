class predikatNilai {

    constructor(nama, nilai) {
        this.nama = nama
        this.nilai = nilai
    }

    getPredikat() {
        var predikat = null

        if (this.nilai <= 100 && this.nilai >= 85) {
            predikat = "A";
        } else if (this.nilai <= 84 && this.nilai >= 75) {
            predikat = "B"
        } else if (this.nilai <= 75 && this.nilai >= 65) {
            predikat = "BC"
        } else if (this.nilai <= 64 && this.nilai >= 55) {
            predikat = "C"
        } else if (this.nilai <= 54 && this.nilai >= 45) {
            predikat = "D"
        } else if (this.nilai <= 44 && this.nilai >= 0) {
            predikat = "E"
        } else {
            predikat = null;
        }

        console.log(this.nama + " mendapatkan predikat " + predikat);
    }
}

/**
 * Method untuk menanyakan inputan
 */

function askFor(name) {
    return prompt("Masukan " + name)
}

// pemanggilan program 
var app = new predikatNilai(askFor("nama"), askFor("nilai"))

// cetak hasil
app.getPredikat()