
//check if user inserted any data to inputs before sending the form onclick function not defined
function checkInput() {
    let user = document.forms["loginForm"]["username"].value
    let pass = document.forms["loginForm"]["password"].value
    if (user === "" || pass === "") {
        console.log("no data")
        alert("Please enter your credentials before trying to sign in.")
        return false;
    }
    else {
        console.log("DATA")
        return true;
    }
}
