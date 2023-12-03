const wrapper document.querySelector(".wrapper");

const question = document.querySelector(".question"); document.querySelector(".gif");

const gif const yesBtn = document.querySelector(".yes-btn");

const noßtn = document.querySelector(".no-btn");

yesBtn.addEventListener("click", () {

question. InnerHTML = "Aaaaa, I like you too";

gif.src

"https://raw.githubusercontent.com/DzarelDeveloper/Img/main/gif.webp"; });

noBtn.addEventListener("mouseover", (){

const noßtnRect = noßtn.getBoundingClientRect();

const maxx window.innerWidth noßtnRect.width;

const maxy window.innerHeight noBtnRect.height;

const randomX = Math.floor(Math.random() maxx);

const randomy = Math.floor(Math.random() maxY);

noBtn.style.left = randomx + "px"; noßtn.style.top randomy + "px"; });