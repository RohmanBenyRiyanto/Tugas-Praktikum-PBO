var nilai = {
    minMax: function() {
        console.log("Nilai : " + this.firstName);

        // ambil nilai dari argumen parameter saat ini
        var nilai = arguments

        console.log("Nilai tertinggi : " + Math.max.apply(Math, nilai));
        console.log("Nilai terendah : " + Math.min.apply(Math, nilai));
    }
}

//  creator for this program
var creator = {
    firstName: "5, 6, 2, 3, 7",
}

var hasil = nilai.minMax.apply(creator, [5, 6, 2, 3, 7])