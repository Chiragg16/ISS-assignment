function validateForm() {
    var password = document.getElementById("password").value;
    
    if (password === "") {
        alert("Please enter a password");
        return false;
    }
    
    // Add more validation logic here if needed
    if(password.length < 5) {
        alert("Password must be at least 5 characters long");
        return false;
    }
    return true;
}