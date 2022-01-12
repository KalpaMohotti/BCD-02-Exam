// const queryString = window.location.search;

//const urlParams = new URLSearchParams(queryString);

const empid = urlParams.get('id')
console.log(empid)


                let xmlHttp3;
                if (window.XMLHttpRequest) {
                    xmlHttp3 = new XMLHttpRequest();


                } else {
                    xmlHttp3 = new ActiveXobject("Microsoft.XMLHTTP");
                }

           
           


                xmlHttp3.onreadystatechange = function () {
                    if (xmlHttp3.readyState == 4 && xmlHttp3.status == 200) {
                        var ar = JSON.parse(xmlHttp3.responseText);
                        // const xmlDoc=this.responseXML;
                        // const ar response=JSON.parse(xmlHttp.responseText);
                        console.log("kalpa sadaruwan");
                      //  console.log(ar);
                        ar.forEach(value => {
                           console.log(value.fname);
                      //   data="<h1>"+value.fname+"</h1>"


                        });

                      //  name.innerHTML=data;
                      
                    }
                }
                xmlHttp3.open("GET", "get_employee_from_id?id=" + empid, true);
                //  xmlHttp.open("POST", "view_all?id="+id, true);
                xmlHttp3.send();


