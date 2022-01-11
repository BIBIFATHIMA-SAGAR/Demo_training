
function employeeValidation(){
   
    var inputId = document.getElementById("inputId");
    var inputName = document.getElementById("inputName");
    var inputSal = document.getElementById("inputSal");
    var inputDept = document.getElementById("inputDept");
    var inputSkill = document.getElementById("inputSkill");
   

    if(inputId.value.trim()==""){
        inputId.style.border = "2px solid red";
        document.getElementById("eid_err").style.visibility = "visible"
        return false;
    }
    else if(inputName.value.trim()==""){
        inputName.style.border = "2px solid red";
        document.getElementById("name_err").style.visibility = "visible"
        return false;
    }
    else if(inputSal.value.trim()==""){
        inputSal.style.border = "2px solid red";
        document.getElementById("salary_err").style.visibility = "visible"
        return false;
    }
    else if(inputDept.value.trim()==""){
        inputDept.style.border = "2px solid red";
        document.getElementById("dept_err").style.visibility = "visible"
        return false;
    }
	else if(inputSkill.value.trim()==""){
        inputSkill.style.border = "2px solid red";
        document.getElementById("skill_err").style.visibility = "visible"
        return false;
    }
    else{
        saveEmp();
    }
}

function saveEmp(){
	var inputId = document.getElementById("inputId").value;
    var inputName = document.getElementById("inputName").value;
    var inputSal = document.getElementById("inputSal").value;
    var inputDept = document.getElementById("inputDept").value;
    var inputSkill = document.getElementById("inputSkill").value;


    let emp = {id:inputId,name:inputName,Sal:inputSal,dept:inputDept,skill:inputSkill}
    
	// localStorage.setItem("empId",inputId);
    // localStorage.setItem("empName",inputName);
    // localStorage.setItem("empSal",inputSal);
    // localStorage.setItem("empDept",inputDept);
    // localStorage.setItem("empSkill",inputSkill); 
    //getting saved json array
    var getEmp = localStorage.getItem("Empdetails");

    //if there is no data then creating new json array and then saving
    if(getEmp == null){
        let jArr = [emp];
        localStorage.setItem("Empdetails",JSON.stringify(jArr));
        alert("Saved");
    }
    else{
        //if data already exists then appending new json object to that array and the saving
        //parsing data to array
        var jArr = JSON.parse(getEmp);
        //appending json object to arra
        jArr.push(emp);
        // alert(jArr);
        //saving data to local db
        localStorage.setItem("Empdetails",JSON.stringify(jArr));
        alert("Saved successfully");
    }

	
}

function getEmp(){
    
    document.getElementById("showUsers").innerHTML = "";
var localArr = localStorage.getItem("Empdetails");
	
if (localArr != null){
   // alert(localArr);
    var jArray = JSON.parse(localArr);
    // for (let eachObj of jArray) {
    //     //var obj = eachObj;
    //     for (let obj in eachObj) {
    //         console.log(JSON.stringify(eachObj[obj]));
    //         let addDiv=document.createElement('div');
    //     addDiv.className="row";
    //     addDiv.innerHTML='  <div class="col-sm-4" style="padding: 10px;">'+eachObj[obj]+'</div><div class="col-sm-4" style="padding: 10px;">'+eachObj[obj]+'</div><div class="col-sm-4" style="padding: 10px;">'+eachObj[obj]+'</div>';
    //     document.getElementById("showUsers").appendChild(addDiv);
    //     }
    // }



    let user_records=new Array();
    user_records=JSON.parse(localStorage.getItem("Empdetails"))?JSON.parse(localStorage.getItem("Empdetails")):[]
    if(user_records)
    {
      for(let i=0;i<user_records.length;i++)
      {
            let addDiv=document.createElement('div');
        addDiv.className="row";

        addDiv.innerHTML='<div class="col-sm-2" style="padding: 10px;">'+user_records[i].id+'</div><div class="col-sm-2" style="padding: 10px;">'+user_records[i].name+'</div><div class="col-sm-2" style="padding: 10px;">'+user_records[i].Sal+'</div><div class="col-sm-2" style="padding: 10px;">'+user_records[i].skill;
        document.getElementById("showUsers").appendChild(addDiv);
      }
    }


}else{
    alert("hii");
}
}


function remove(){
    var empId = document.getElementById("remove").value;
    
    let user_records=new Array();
    user_records=JSON.parse(localStorage.getItem("Empdetails[]"))
    if(user_records)
    {
      for(let i=0;i<user_records.length;i++)
      {
        if(user_records[i].id == empId) {
            user_records.splice(i, 1);
            alert("Removed ");
            getEmp();
            break;
        }
      }
    }
}

