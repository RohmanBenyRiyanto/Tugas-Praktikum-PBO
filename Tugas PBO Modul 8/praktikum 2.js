//Langsung dengan value
var person1 = {
    name: "Rohman"
};

//Buat object baru
var person2 = new Object();
person2.name = "Beny";

//Menambanhkan properti baru
person1.age = 19;
person2.age = 20;

//Akses properti dengan cara pertama
console.log(`Object dari person1\t: \n 
  name\t:${person1.name}\n 
  age\t: ${person1.age}`);

console.log(" ");

//Akses properti dengan cara kedua
console.log(`Object dari person2\t \n
  name\t: ${person2["name"]}\n
  age\t: ${person2["age"]}`);