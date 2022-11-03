function countHello(num) {
  let i = 1;
	const setIntervalHello = setInterval(function() {
    console.log(i + ": Hello!");
    if(i >= num) {
      console.log("Teraz powinno się zatrzymać");
      clearInterval(setIntervalHello);
    }
    i = i + 1;
	}, 1500);
}
countHello(10);