// add li to ul in java 1 card
const java1Card = document.getElementById("java1Card");
const java1Ul = document.getElementById("java1Ul");
const liArray = [
    {text: "LAB 1",                 link: "JAVA_1/LAB_1.java",               apiKey: 0},
    {text: "LAB 1 (شرح)",           link: "JAVA_1_EXP/LAB_1.html",           apiKey: 1},
    {text: "ASSIGNMENT 1 (OLD)",    link: "JAVA_1/ASSIGNMENT_1_OLD.java",    apiKey: 2},
    {text: "ASSIGNMENT 1 (NEW)",    link: "JAVA_1/ASSIGNMENT_1_NEW.java",    apiKey: 3},
    {text: "ASSIGNMENT 1 (شرح)",    link: "JAVA_1_EXP/ASSIGNMENT_1.html",    apiKey: 4},
    {text: "LAB 2",                 link: "JAVA_1/LAB_2.java",               apiKey: 5},
    {text: "LAB 2 (شرح)",           link: "JAVA_1_EXP/LAB_2.html",           apiKey: 6},
    {text: "LAB 3 (App.java)",      link: "JAVA_1/LAB_3.java",               apiKey: 7},
    {text: "LAB 3 (AppTest.java)",  link: "JAVA_1/LAB_3_TEST.java",          apiKey: 8},
    {text: "LAB 3 (شرح)",           link: "JAVA_1_EXP/LAB_3.html",           apiKey: 9},
];

liArray.forEach(x => {

    let type = x.link.includes("html") ? 1 : 0;
    let icon = type == 1 ? "skull-outline" : "document-text-outline";

    java1Ul.innerHTML += `                
    <li>
    <a href="${x.link}" target="_blank" rel="noopener noreferrer">
        <ion-icon name="${icon}"></ion-icon>
        ${x.text}
    </a>
    </li>`;
});

const videoEndTime = 10;

const vid = document.getElementById("myVideo");
vid.controls = false;
const skipEl = document.getElementById("skipHint");
const innerDiv = document.getElementById("innerHide");
const mainDiv = document.getElementById("toHide");

const quotes = [
    '“Any fool can write code that a computer can understand. Good programmers write code that humans can understand.”',
    '“Experience is the name everyone gives to their mistakes.”',
    '“Java is to Javascript what car is to Carpet.”',
    '“Knowledge is power”',
    '“Perfection is achieved not when there is nothing more to add, but rather when there is nothing more to take away.”',
    '“Code is like humor. When you have to explain it, it\'s bad.”',
    '“Never Gonna Give You Up”',
    '“Life is not a problem to be solved, but a reality to be experienced.”',
    '“Every saint has a past, and every sinner has a future.”',
    '“You will not be punished for your anger, you will be punished by your anger.”',
    '“Keep your face always toward the sunshine and shadows will fall behind you.”',
    '“Dead people receive more flowers than the living ones because regret is stronger than gratitude.”',
    '“Better a cruel truth than a comfortable delusion.”',
    '“Don\'t use yesterday\'s state of mind, to make today\'s decision.”',
    '“A ship in harbor is safe, but that is not what ships are built for.”',
    '“Once we accept our limits, we go beyond them.”',
    '“No.”'
];

let randomNum =  Math.floor(Math.random() * (quotes.length));
document.getElementById("quote").innerHTML = quotes[randomNum];

// card
const card = document.querySelector(".card");
const cardtoggle = document.querySelector(".toggle");
cardtoggle.onclick = function () {
card.classList.toggle("active");
};

// screen clicks counter
let clickCount = 0;
window.onclick = function() {

    clickCount++;
    // skip video if clicks more than
    if (clickCount > 4 && vid.currentTime < videoEndTime) {
        vid.currentTime = videoEndTime;
    }
}

function hide() {
    vid.hidden = false;
    vid.play();
    skipEl.hidden = false;
    setTimeout(function() {
        innerDiv.hidden = true;
    }, 500);
}

let interval = setInterval(function () {
    if (vid.currentTime > videoEndTime) {
        // java1Card.classList += " animate__animated animate__fadeIn animate__delay-2s";
        vid.hidden = true;
        skipEl.hidden = true;
        mainDiv.hidden = true;
        clearInterval(interval);
    }
}, 10);