


  let xmlHttp;
            if (window.XMLHttpRequest) {
                xmlHttp = new XMLHttpRequest();


            } else {
                xmlHttp = new ActiveXobject("Microsoft.XMLHTTP");
            }
            xmlHttp.onreadystatechange = function () {
                if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
                    var ar = JSON.parse(xmlHttp.responseText);
                    // const xmlDoc=this.responseXML;
                    // const ar response=JSON.parse(xmlHttp.responseText);
                    console.log("kalpa sadaruwan");
                    console.log(ar);
                    let data = "";
                    ar.forEach(value => {
                       // console.log(value.title);
                      //  console.log(value.dpartmentID);

                        // data += "<tr><td>" + value.dpartmentID + "</td><td>" + value.title + "</td><td><button class=\"btn btn-success\" onclick=\"update(" + value.dpartmentID + ")\">Edit</button></td></tr>"
                        data += "<option>" + value.jobID + "-" + value.leaveCount +"-"+value.salary+"-"+value.tittle+"<option>"

                    });
                    let tbody = document.getElementById("jobrole");
                    tbody.innerHTML = data;
                    
                }
            }
            xmlHttp.open("GET", "view_all_jobrole", true);
            //  xmlHttp.open("POST", "view_all?id="+id, true);
            xmlHttp.send();


    



function save(){
     var fname = document.getElementById("input-first-name").value;
     var mname = document.getElementById("input-middle-name").value;
     var lname = document.getElementById("input-last-name").value;
     var dob = document.getElementById("dob").value;
     var sex = document.getElementById("sex").value;
     var address1 = document.getElementById("input-address1").value;
     var address2 = document.getElementById("input-address2").value;
     var address3 = document.getElementById("input-address3").value;
     var tel = document.getElementById("tel").value;
     var email = document.getElementById("email").value;
     var jobrole = document.getElementById("jobrole").value;
     var pass = document.getElementById("pass").value;
     var cpass = document.getElementById("cpass").value;
     
//     console.log(fname);
//     console.log(mname);
//     console.log(lname);
//     console.log(dob);
//     console.log(sex);
//     console.log(address1);
//     console.log(address2);
//     console.log(address3);
//     console.log(tel);
//     console.log(email);
//     console.log(jobrole);
//     console.log(pass);
//     console.log(cpass);
     
   
     if(pass == cpass){
           let xmlHttp1;
                if (window.XMLHttpRequest) {
                    xmlHttp1 = new XMLHttpRequest();


                } else {
                    xmlHttp1 = new ActiveXobject("Microsoft.XMLHTTP");
                }
                let tb = document.getElementById("input-username");
                xmlHttp1.onreadystatechange = function () {
                    if (xmlHttp1.readyState == 4 && xmlHttp1.status == 200) {
                      //  var ar = JSON.parse(xmlHttp1.responseText);
  window.location='add_employee.jsp'


                    }
                }
                xmlHttp1.open("GET", "save_employee?fname=" + fname + "&mname=" + mname + "&lname=" + lname + "&dob=" + dob+"&sex="+sex+"&address1="+address1+"&address2="+address2+"&address3="+address3+"&tel="+tel+"&email="+email+"&jobrole="+jobrole+"&pass="+pass, true);
                //  xmlHttp.open("POST", "view_all?id="+id, true);
                xmlHttp1.send();
     }else{
         window.alert("Your password not matching");
     }
     
     
}


