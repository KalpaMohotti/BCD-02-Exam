console.log("Malaka");






let xmlHttp1;
if (window.XMLHttpRequest) {
    xmlHttp1 = new XMLHttpRequest();


} else {
    xmlHttp1 = new ActiveXobject("Microsoft.XMLHTTP");
}
xmlHttp1.onreadystatechange = function () {
    if (xmlHttp1.readyState == 4 && xmlHttp1.status == 200) {
        var ar = JSON.parse(xmlHttp1.responseText);
        // const xmlDoc=this.responseXML;
        // const ar response=JSON.parse(xmlHttp.responseText);
        console.log("kalpa sadaruwan");
        console.log(ar);
        let data = "";
        ar.forEach(value => {
            console.log(value.title);
            console.log(value.dpartmentID);

            data += "<tr><td>" + value.shiftsID + "</td><td>" + value.startTime + "</td><td>" + value.empID.empID + "</td><td>" + value.empID.fname + " " + value.empID.mname + " " + value.empID.lname + "</td><td>" + value.empID.url + "</td><td><button class=\"btn btn-success\" onclick=\"update(" + value.shiftsID + ")\">Shift OFF</button></td></tr>"
//                        data += "<option>" + value.empID + "-" + value.fname +" "+value.mname+" "+value.lname+ "<option>"

        });
        let tbody = document.getElementById("tbody");
        tbody.innerHTML = data;
    }
}
xmlHttp1.open("GET", "view_all_working", true);
//  xmlHttp.open("POST", "view_all?id="+id, true);
xmlHttp1.send();

function update(id) {
    console.log(id);


    console.log("save data");

    let xmlHttp2;
    if (window.XMLHttpRequest) {
        xmlHttp2 = new XMLHttpRequest();


    } else {
        xmlHttp2 = new ActiveXobject("Microsoft.XMLHTTP");
    }
    let tb = document.getElementById("input-username");
    xmlHttp2.onreadystatechange = function () {
        if (xmlHttp2.readyState == 4 && xmlHttp2.status == 200) {
            //  var ar = JSON.parse(xmlHttp3.responseText);
            window.location = 'attendance_mark.jsp'


        }
    }
    xmlHttp2.open("GET", "shift_off?id=" + id, true);
    //  xmlHttp.open("POST", "view_all?id="+id, true);
    xmlHttp2.send();



}

function mark() {
    var date = document.getElementById("input-date").value;
    var emp = document.getElementById("emp").value;



    let xmlHttp3;
    if (window.XMLHttpRequest) {
        xmlHttp3 = new XMLHttpRequest();


    } else {
        xmlHttp3 = new ActiveXobject("Microsoft.XMLHTTP");
    }
    let tb = document.getElementById("input-username");
    xmlHttp3.onreadystatechange = function () {
        if (xmlHttp3.readyState == 4 && xmlHttp3.status == 200) {
            //  var ar = JSON.parse(xmlHttp3.responseText);
            window.location = 'attendance_mark.jsp'


        }
    }
    xmlHttp3.open("GET", "mark_attendance?date=" + date + "&emp=" + emp, true);
    //  xmlHttp.open("POST", "view_all?id="+id, true);
    xmlHttp3.send();
}

            