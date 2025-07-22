class Person{
    // static let name = "john"; this is not valid in javascript as class fields are declared without `let`, `const`, or `var`
    consttrictor(name, age){
        this.name = name;
        this.age = age;
}
    greet() { //this is non-static method
        console.log(`Hello, my name is ${this.name} and I am ${this.age} years old.`);
    } //here the method signaturte is different from the constructure functions/standalone functions in js as this is a class method
    static getSpecies() { //this is a static method
    }
}

class Student extends Person {
    //constructor chaining in javasctipt using call to super()
    constructor(name, age, studentId) {
        super(name, age); // call the parent class constructor
        this.studentId = studentId;
    }
    //method overriding in javascript
    greet() {
        console.log(`Hello, my name is ${this.name}, I am ${this.age} years old, and my student ID is ${this.studentId}.`);
    }
    //method overloading is not supported in javascript, but we can achieve similar functionality using default parameters
    static getSchoolName() {
        return "ABC High School";
    }
}



//lets create an instance of the Person class

Student.getSchoolName(); // static method call
const st1 = new Student(    "John", 20, "S12345"); // create an instance of the Student class
const st2 = new Person("Jane", 22); // create an instance of the Person class