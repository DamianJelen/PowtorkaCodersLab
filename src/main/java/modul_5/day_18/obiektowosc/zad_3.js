class Tree {
    constructor(type) {
        this.type = type + " tree";
    }
}

const orange = new Tree("Orange");
const lemon = new Tree("Lemon");
const apple = new Tree("Apple");

console.log(orange);
console.log(lemon);
console.log(apple);

Tree.prototype.bloom = function() {
    console.log(this.type + " is blooming");
}

orange.bloom();
lemon.bloom();
apple.bloom();