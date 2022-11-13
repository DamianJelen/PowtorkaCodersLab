class Vehicle {
    constructor() {
        console.log("Pojazd: ");
    }
}

class Boat extends Vehicle {
    pojazd() {
        console.log("Boat");
    }
}

class Car extends Vehicle {
    pojazd() {
        console.log("Car");
    }
}

class Plane extends Vehicle {
    pojazd() {
        console.log("Plane");
    }
}

let boat = new Boat;
boat.pojazd();
let car = new Car;
car.pojazd();
let plane = new Plane;
plane.pojazd();