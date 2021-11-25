
let bC = document.getElementById("btnConsultar");
let bI = document.getElementById("btnIngresar");
let bT = document.getElementById("btnTiempo");
let bP = document.getElementById("btnPrecio");

bC.addEventListener('click',()=>{
   const mostrar = document.getElementById("consultar").style.display="block"; 
   document.getElementById("ingresar").style.display="none"; 
   document.getElementById("tiempo").style.display="none";
   document.getElementById("precio").style.display="none";
   
});

bI.addEventListener('click',()=>{
   const mostrar = document.getElementById("ingresar").style.display="block"; 
   document.getElementById("consultar").style.display="none"; 
   document.getElementById("tiempo").style.display="none";
   document.getElementById("precio").style.display="none";
});

bT.addEventListener('click',()=>{
   const mostrar = document.getElementById("tiempo").style.display="block"; 
   document.getElementById("ingresar").style.display="none"; 
   document.getElementById("consultar").style.display="none";
   document.getElementById("precio").style.display="none";
   
});
bP.addEventListener('click',()=>{
   const mostrar = document.getElementById("precio").style.display="block"; 
   document.getElementById("ingresar").style.display="none"; 
   document.getElementById("tiempo").style.display="none";
   document.getElementById("consultar").style.display="none";
   
});