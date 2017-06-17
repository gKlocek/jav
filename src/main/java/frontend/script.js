function myFunction(nr) {
        var xhttp = new XMLHttpRequest();

        xhttp.onreadystatechange = function() {
            if (this.readyState == 4 && this.status == 200) {
              document.getElementById("demo").innerHTML = this.responseText;
            } else {
               document.getElementById("demo").innerHTML =  this.readyState + " "+ this.status;
            }
        };
        xhttp.open("POST", "http://localhost:2222/home/post/", true);
        xhttp.setRequestHeader("Content-type", "application/json");
        xhttp.send(JSON.stringify({fieldNumber:nr}));
      }