const blocks = document.querySelector("div.blocks");
console.log(blocks.innerText);
const block = blocks.querySelectorAll("div.block a");

for (let i = 0; i < block.length; i++) {
    block[i].innerText = "Change " + (i + 1);
}

console.log(blocks.innerText);