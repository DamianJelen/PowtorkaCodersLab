function Basket() {
    this.products = [];
    this.sum = 0;
}

Basket.prototype.addProduct = function(name, price) {
    let product = {
        name: name,
        price: price
    }
    this.products.push(product);
}

Basket.prototype.showBasket = function() {
    for(let prod of this.products) {
        console.log(prod.name + ": " + prod.price);
        this.sum += prod.price;
    }
    console.log("---------------------------------");
    console.log("Razem: " + this.sum);
    this.sum = 0;
}

const aliceBasket = new Basket();
aliceBasket.addProduct("pomidor",10);
aliceBasket.addProduct("arbuz",40);
aliceBasket.showBasket();

const bruceBasket = new Basket();
bruceBasket.addProduct("rice", 10);
bruceBasket.addProduct("grzyby mun",50);
bruceBasket.addProduct("tofu",20);
bruceBasket.showBasket();