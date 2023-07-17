// Introduction

// Dream Big and never give up on your dreams! That is what this code is all about. This code will show you that big dreams are possible and that anything is achievable if you put your mind to it. 

// Lets take a journey together and find out what dreams can come true when we believe in ourselves and strive for success. 

// Variables 

let dream = "Dream big!";
let success = "You can achieve it!";
let persistence = "Don't give up on your dreams!";
let knowYourWorth = "You are capable of achieving anything!"

// Functions

const dreamBig = (dream, success, persistance, knowYourWorth) => {
    return `When you ${dream}, ${success}! ${persistance} and ${knowYourWorth}.`;
} 

const justDoIt = ( target ) => {
    return `Just do it! Set your ${target} and aim for it! Make sure you put in the hard work and dedication to reach your goal!`;
}

const neverStop = ( steps ) => {
    return `Never stop pursuing your dreams! Take ${steps} at a time and you will eventually get there! `;
}

// Main 

console.log(dreamBig(dream, success, persistence, knowYourWorth));
console.log(justDoIt("target"));
console.log(neverStop("small steps"));

// Visualize

let visualize = () => {
    let dreamPicture = document.createElement("img");
    dreamPicture.src = "dreamBig.jpg";
    document.body.appendChild(dreamPicture);
}

visualize();

// Believe

let believe = () => {
    let beliefStatement = document.createElement("h3");
    beliefStatement.innerHTML = "Believe in yourself and your dreams!";
    document.body.appendChild(beliefStatement);
}

believe();

// Motivation

let stayMotivated = () => {
    let motivationStatement = document.createElement("h4");
    motivationStatement.innerHTML = "Keep your motivation strong and never give up!";
    document.body.appendChild(motivationStatement);
}

stayMotivated();

// Actions 

let takeAction = () => {
    let actionItems = document.createElement("ul");
    let smallSteps = document.createElement("li");
    let workHard = document.createElement("li");
    let focus = document.createElement("li");
    let challengeYourself = document.createElement("li");
    actionItems.appendChild(smallSteps);
    actionItems.appendChild(workHard);
    actionItems.appendChild(focus);
    actionItems.appendChild(challengeYourself);
    smallSteps.innerHTML = "Take small steps";
    workHard.innerHTML = "Work hard";
    focus.innerHTML = "Stay focused";
    challengeYourself.innerHTML = "Challenge yourself";
    document.body.appendChild(actionItems);
}

takeAction();

// Inspiration

let getInspired = () => {
    let inspirationList = document.createElement("ul");
    let readBooks = document.createElement("li");
    let listenToPodcasts = document.createElement("li");
    let watchTutorials = document.createElement("li");
    let followLeaders = document.createElement("li");
    inspirationList.appendChild(readBooks);
    inspirationList.appendChild(listenToPodcasts);
    inspirationList.appendChild(watchTutorials);
    inspirationList.appendChild(followLeaders);
    readBooks.innerHTML = "Read books";
    listenToPodcasts.innerHTML = "Listen to podcasts";
    watchTutorials.innerHTML = "Watch tutorials";
    followLeaders.innerHTML = "Follow leaders in your field";
    document.body.appendChild(inspirationList);
}

getInspired();