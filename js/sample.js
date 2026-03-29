function hi(){
    console.log("Hi");
}
function bye(){
    console.log("chala nikal");
    document.getElementById("in").innerHTML="<h1>bye chala nikal </h1>";
}
    
function myname(){
    console.log("Swamini");
}
function stuName(){
    document.getElementById("input").innerHTML="<h1>swaminiiiiiii</h1>";
}

function enter(){
     let stu = document.getElementById("input1").value;
     console.log(stu);
     document.getElementById("input").innerHTML="<h1>" + stu + "</h1>";
}
