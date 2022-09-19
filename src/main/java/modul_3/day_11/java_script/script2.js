let yearsOld = prompt("Wpisz swój wiek");

if (yearsOld >= 18) {
    console.log("Jesteś pełnoletni.")
} else {
    console.log("jesteś niepełnoletni.")
}


let grade = prompt("Podaj ocene od 1 - 6");

switch (grade) {
    case "1": {
        console.log("niedostateczny");
        break;
    }
    case "2": {
        console.log("mierny");
        break;
    }
    case "3": {
        console.log("dostateczny");
        break;
    }
    case "4": {
        console.log("dobry");
        break;
    }
    case "5": {
        console.log("bardzo dobry");
        break;
    }
    case "6": {
        console.log("celujący");
        break;
    }
    default: {
        console.log("O co kaman?")
    }
}