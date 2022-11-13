class Duck {
    constructor(dType = "ordinary_duck") {
        this.duckType = dType;
    }

    sound() {
        console.log("Quack quack")
    }

    swim() {
        console.log("I'm swimming ...");
    }

    print() {
        console.log("Looks like " + this.duckType)
    }

    fly() {
        console.log("I'm flying ...");
    }
}

let donaldDuck = new Duck("Donald Duck");
donaldDuck.sound();
donaldDuck.swim();
donaldDuck.print();

class WildDuck extends Duck {
    constructor(newTypeDuck) {
        let typeDuck = "wild " + newTypeDuck;
        super(typeDuck);
    }
}

let daffDuck = new WildDuck("Daff Duck");
daffDuck.print();

class MallardDuck extends Duck {
    constructor() {
        super("mallard");
    }
}

let daisyDuck = new MallardDuck();
daisyDuck.print();
daisyDuck.fly();

class RubberDuck extends Duck {
    constructor() {
        super("rubber");
    }

    fly() {
        console.log("Rubber ducks can't fly!");
    }
}

let rubberDuck = new RubberDuck();
rubberDuck.fly();