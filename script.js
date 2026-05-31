
document.querySelectorAll('.counter').forEach(counter=>{
let target=+counter.dataset.target;
let c=0;
let step=Math.max(1,Math.ceil(target/100));
let i=setInterval(()=>{
c+=step;
if(c>=target){c=target;clearInterval(i);}
counter.textContent=c;
},20);
});
