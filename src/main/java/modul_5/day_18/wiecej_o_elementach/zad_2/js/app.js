const divImgBrowser = document.querySelectorAll("div.card-body");

for (let i = 0; i < divImgBrowser.length; i++) {
    //chrome
    if(i == 0) {
        divImgBrowser[i].querySelector("div").style.width = "100px";
        divImgBrowser[i].querySelector("a").innerText = "Chrome";
        divImgBrowser[i].querySelector("a").setAttribute("href", "https://www.google.com/chrome/");
    }
    //edge
    if(i == 1) {
        divImgBrowser[i].querySelector("div").style.backgroundImage = "url('./img/edge.jpg')";
        divImgBrowser[i].querySelector("a").innerHTML = "Edge";
        divImgBrowser[i].querySelector("a").setAttribute("href", "https://www.microsoft.com/pl-pl/edge?form=MA13FJ");
    }
    //firefox
    if(i == 2) {
        divImgBrowser[i].querySelector("div").style.backgroundImage = "url('./img/firefox.jpg')";
        divImgBrowser[i].querySelector("a").innerHTML = "FireFox";
        divImgBrowser[i].querySelector("a").setAttribute("href", "https://www.mozilla.org/pl/firefox/new/");
    }
}