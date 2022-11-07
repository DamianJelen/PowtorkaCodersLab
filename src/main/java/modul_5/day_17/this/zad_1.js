const car = {
    brand: "Fiat",
    color: "Blue",
    numberOfKilometers: 0,
    printCarInfo: function() {
        console.log(this.brand + " " + this.color + " " + this.numberOfKilometers)
    },
    drive: function(km) {
        this.numberOfKilometers += km
    }
}

car.printCarInfo();
car.drive(20);
car.printCarInfo();

car.technicalReview = [];
car.addTechReview = function(data) {
    this.technicalReview.push(data);
}

car.showAllTechReview = function() {
    for(let i = 0; i < this.technicalReview.length; i++) {
        console.log(this.technicalReview[i]);
    }
}

car.addTechReview("2001-01-01");
car.addTechReview("2002-03-11");
car.addTechReview("2003-12-23");
car.addTechReview("2004-05-05");

car.showAllTechReview();