function validate()
{
   var username= document.getElementById("user");
   let passWord = document.getElementById("pass");
   
   if(username.value.trim()==""){
       username.style.border ="2px solid red";
       document.getElementById("invalid-user").style.visibility = "visible";
       return false;
   }
   else if(passWord.value.trim()==""){
    passWord.style.border = "2px solid red";
    document.getElementById("invalid-pass").style.visibility = "visible"
       return false;
   }
   else if(passWord.value.trim().length<5){
       passWord.style.border = "2px solid red";
     
       document.getElementById("short-pass").style.visibility = "visible";

   }
   else{
   return login();
   }

}

function login(){
    var username= document.getElementById("user").value;
    var passWord = document.getElementById("pass").value;

    let localUser=localStorage.getItem("user");
    let localPass=localStorage.getItem("pass");

    if(username==localUser && passWord==localPass){
       alert("login successfull");
       location.href = "index.html";
    }
    else{
        "invalid user name or password"
        return false;
    }
}



function registerValidation(){
   
    var firstName = document.getElementById("invalidFname");
    var lastName = document.getElementById("invalidLname");
    var pass = document.getElementById("invalidPwd");
    var user = document.getElementById("invalidUser");


    if(firstName.value.trim()==""){
        firstName.style.border = "2px solid red";
        document.getElementById("msg1").style.visibility = "visible"
        return false;
    }
    else if(lastName.value.trim()==""){
        lastName.style.border = "2px solid red";
        document.getElementById("message").style.visibility = "visible"
        return false;
    }
    else if(pass.value.trim()==""){
        pass.style.border = "2px solid red";
        document.getElementById("msg2").style.visibility = "visible"
        return false;
    }
    else if(user.value.trim()==""){
        user.style.border = "2px solid red";
        document.getElementById("msg3").style.visibility = "visible"
        return false;
    }
    else{
        saveData();
    }
}


function saveData(){
   
    var firstName = document.getElementById("invalidFname").value;
    var lastName = document.getElementById("invalidLname").value;
    let pass = document.getElementById("invalidPwd").value;
    let user = document.getElementById("invalidUser").value;
    var contact = document.getElementById("contact").value;
    var address = document.getElementById("address").value;
   

    localStorage.setItem("firstName",firstName);
    localStorage.setItem("lastName",lastName);
    localStorage.setItem("user",user);
    localStorage.setItem("pass",pass);
    localStorage.setItem("contact",contact);
    localStorage.setItem("address",address);



}



