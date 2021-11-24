
let bC = document.getElementById("btnConsultar");
let bI = document.getElementById("btnIngresar");

bC.addEventListener('click',()=>{
   const mostrar = document.getElementById("consultar").style.display="block"; 
   document.getElementById("ingresar").style.display="none";  
});

bI.addEventListener('click',()=>{
   const mostrar = document.getElementById("ingresar").style.display="block"; 
   document.getElementById("consultar").style.display="none";  
});