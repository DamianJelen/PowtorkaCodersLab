const timeMachine = {
    shape: "",
    model: "",
    run: function(date, place) {
        console.log("Jestes teraz w " + place + " dnia " + date);
    }
}

timeMachine.run('2021-10-23', 'Warszawa');