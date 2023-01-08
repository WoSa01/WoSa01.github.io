// add li to ul in java 1 card
const java1Card = document.getElementById("java1Card");
const java1Ul = document.getElementById("java1Ul");
const liArray = [
    {text: "LAB 1 (شرح)",           link: "JAVA_1_EXP/LAB_1.html",           apiKey: 1},
    {text: "ASSIGNMENT 1 (شرح)",    link: "JAVA_1_EXP/ASSIGNMENT_1.html",    apiKey: 4},
    {text: "LAB 2 (شرح)",           link: "JAVA_1_EXP/LAB_2.html",           apiKey: 6},
    {text: "LAB 3 (شرح)",           link: "JAVA_1_EXP/LAB_3.html",           apiKey: 9},
];

function getValue(key, callback) {
    $.ajax({
        url: 'https://rra5400.azurewebsites.net/Main/ForceUpdateKeyValue',
        data: {
            key: key
        },
        type: 'GET',
        success: function (response) {
            let value = response[1];
            console.log(value);
            if (callback == "inc") {
                incrementCounter(key, value);
            }
            else {
                document.getElementById(callback).innerHTML = value;
            }
        },
      });
}
function incrementCounter(key, value = null) {
    if (value == null) {
        return value = getValue(key, "inc");
    }
    $.ajax({
        url: 'https://rra5400.azurewebsites.net/Main/ForceUpdateKeyValue',
        data: {
            key: key,
            value: value + 1,
        },
        type: 'GET',
        success: function (response) {
            console.log(response);
        },
      });
}

liArray.forEach(x => {

    let type = x.link.includes("html") ? 1 : 0;
    let icon = type == 1 ? "skull-outline" : "document-text-outline";
    let swords = x.text.includes("LAB 3") ? '<div class="swordsDiv"><img class="iconSword" src="../images/swords.png"></div>' : ""

    java1Ul.innerHTML += `                
    <li>
    <a href="${x.link}" target="_blank" rel="noopener noreferrer" onclick="incrementCounter(${x.apiKey});">
        <ion-icon name="${icon}"></ion-icon>
        ${x.text}
        ${swords}
    </a>
    <span style="position: absolute;" class="countSpan" id="spancounternum${x.apiKey}" hidden>
        ${x.apiKey}
    </span>
    </li>`;
});

function showHiddenCounters() {
    let els = document.getElementsByClassName("countSpan");
    for (let el of els) {
        el.hidden = false;
        getValue(el.innerText, el.id);
    }
}

const videoEndTime = 10;
const startMusicAfterMS = 5500 + ((10 - videoEndTime) * 1000);

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
    // stop audio if clicks more than
    if (clickCount > 10) {
        document.getElementById("audio_player").pause();
    }

    // show hidden counters if clicks
    if (clickCount == 30) {
        showHiddenCounters();
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
        setTimeout(() => {
            let el = document.getElementById("audio_player");
            if (el.paused) {
                el.play();
            }
        }, startMusicAfterMS);
        clearInterval(interval);
    }
}, 10);


