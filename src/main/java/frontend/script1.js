function myFunction(nr) {
        var url = "http://localhost:2222/home/post/";
        var xhttp = new XMLHttpRequest();
        xhttp.onreadystatechange = function() {
            if (this.readyState == 4 && this.status == 200) {
              document.getElementById("demo").innerHTML = this.responseText;
            } else {
               document.getElementById("demo").innerHTML =  this.readyState + " "+ this.status;
            }
        };
        xhttp.open("POST", url, true);
        xhttp.setRequestHeader("Content-type", "application/json");
        xhttp.send(JSON.stringify({fieldNumber:nr}));
      }
