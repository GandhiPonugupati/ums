
function formValidation()  
{  
	var uname = document.getElementById("username").value; 
	var uemail = document.getElementById("email").value;
	var uid = document.getElementById("userid").value;  
	var passid = document.getElementById("password").value;  
	var cpassid = document.getElementById("cpassword").value; 
	var mobile=document.getElementById("mobileno").value;
	var answer=document.getElementById("answer").value;

	/* var uadd = document.registration.address;  
 var ucountry = document.registration.country;  
 var uzip = document.registration.zip;  
 var umsex = document.registration.msex;  
 var ufsex = document.registration.fsex;*/ 


	if(allLetter(uname))  
	{
		if(ValidateEmail(uemail))  
		{  
			if(userid_validation(uid,5,12))  
			{  
				if(passid_validation(passid,7,12))  
				{  
					if(cpassword_validation(cpassid,7,12))
					{
						if(mobileno_validation(mobile,10))
						{
							if(allLetter(answer))
							{
							}
						}
					}   
				}  
			}  
		}  
	}  
	return false;  
}  



/*function usernamevalidation(){
	var name=document.getElementById("username").value;
	if(name.length==""){
		alert("plz enter user name");
		return false;
	}else{
		return true;
	}
}

function emailvalid(){
	var userpat=/^[A-Za-z@0-9]{3,3,1,5}$/;
	var email=document.getElementById("email");
	if(!userpat.test(email.value)){
		alert("Invalid EmailId, enter like this [A-Za-z@0-9]{3,3,1,5}");
		return false;
	}else{
		alert("valid EmailId");
		return true;
	}
}

function useridvalid() {
	var userpat=/^[A-Za-z0-9]{5,5,5}$/;
	var userid=document.getElementById("userid");
	if(!userpat.test(userid.value)){
		alert("invalid userid ,plz enter like this [A-Za-z0-9]{5,5,5}");
		return false;
	}else{
		alert("valid userid");
		return true;
	}
}





function pasvalidate() {
	var pas=document.getElementById("password").value;
	var errmsg=document.getElementById("msg");
	if (pas.length=""){
		errmsg.innerHTML="enter password";
		errmsg.style.color="red";
	}else if (pas.length<4){
		errmsg.innerHTML="weak password";
		errmsg.style.color="pink"
	}else if(pas.length>5&&pas.length<8){
		errmsg.innerHTML="strong password";
		errmsg.style.color="blue";
	}else if(pas.length>11){
		errmsg.innerHTML="verystorng password";
		errmsg.style.color="green";
	}
}

function mobilevalid() {
	var userpatt=/^[0-9]{10}$/;
	var mobileno=document.getElementById("mobileno");
	if(!userpatt.test(mobilno.value)){
		alert("invaild mobile number, enter min 10 digits");
		return false;
	}else{
		alert("valid mobile number");
		return true;
	}
}
 */



/* 
function validateform(){  
var name=document.myform.name.value;  
var password=document.myform.password.value;  

if (name==null || name==""){  
  alert("Name can't be blank");  
  return false;  
}else if(password.length<6){  
  alert("Password must be at least 6 characters long.");  
  return false;  
  }  
}  
</script>  
<body>  
<form name="myform" method="post" action="abc.jsp" onsubmit="return validateform()" >  
Name: <input type="text" name="name"><br/>  
Password: <input type="password" name="password"><br/>  
<input type="submit" value="register">  
</form>  
 */





/* password and confirm password<script type="text/javascript">  
 function matchpass(){  
 var firstpassword=document.f1.password.value;  
 var secondpassword=document.f1.password2.value;  

 if(firstpassword==secondpassword){  
 return true;  
 }  
 else{  
 alert("password must be same!");  
 return false;  
 }  
 }  
 </script>  

 <form name="f1" action="register.jsp" onsubmit="return matchpass()">  
 Password:<input type="password" name="password" /><br/>  
 Re-enter Password:<input type="password" name="password2"/><br/>  
 <input type="submit">  
 </form>  */

/* number vaild<script>  
 function validate(){  
 var num=document.myform.num.value;  
 if (isNaN(num)){  
   document.getElementById("numloc").innerHTML="Enter Numeric value only";  
   return false;  
 }else{  
   return true;  
   }  
 }  
 </script>  
 <form name="myform" onsubmit="return validate()" >  
 Number: <input type="text" name="num"><span id="numloc"></span><br/>  
 <input type="submit" value="submit">  
 </form>  */


/*sample form
 <!DOCTYPE html>  
 <html lang="en"><head>  
 <meta charset="utf-8">  
 <title>JavaScript Form Validation using a sample registration form</title>  
 <meta name="keywords" content="example, JavaScript Form Validation, Sample registration form" />  
 <meta name="description" content="This document is an example of JavaScript Form Validation using a sample registration form. " />  
 <link rel='stylesheet' href='js-form-validation.css' type='text/css' />  
 <script src="sample-registration-form-validation.js"></script>  
 </head>  
 <body onload="document.registration.userid.focus();">  
 <h1>Registration Form</h1>  
 <p>Use tab keys to move from one input field to the next.</p>  
 <form name='registration' onSubmit="return formValidation();">  
 <ul>  
 <li><label for="userid">User id:</label></li>  
 <li><input type="text" name="userid" size="12" /></li>  
 <li><label for="passid">Password:</label></li>  
 <li><input type="password" name="passid" size="12" /></li>  
 <li><label for="username">Name:</label></li>  
 <li><input type="text" name="username" size="50" /></li>  
 <li><label for="address">Address:</label></li>  
 <li><input type="text" name="address" size="50" /></li>  
 <li><label for="country">Country:</label></li>  
 <li><select name="country">  
 <option selected="" value="Default">(Please select a country)</option>  
 <option value="AF">Australia</option>  
 <option value="AL">Canada</option>  
 <option value="DZ">India</option>  
 <option value="AS">Russia</option>  
 <option value="AD">USA</option>  
 </select></li>  
 <li><label for="zip">ZIP Code:</label></li>  
 <li><input type="text" name="zip" /></li>  
 <li><label for="email">Email:</label></li>  
 <li><input type="text" name="email" size="50" /></li>  
 <li><label id="gender">Sex:</label></li>  
 <li><input type="radio" name="msex" value="Male" /><span>Male</span></li>  
 <li><input type="radio" name="fsex" value="Female" /><span>Female</span></li>  
 <li><label>Language:</label></li>  
 <li><input type="checkbox" name="en" value="en" checked /><span>English</span></li>  
 <li><input type="checkbox" name="nonen" value="noen" /><span>Non English</span></li>  
 <li><label for="desc">About:</label></li>  
 <li><textarea name="desc" id="desc"></textarea></li>  
 <li><input type="submit" name="submit" value="Submit" /></li>  
 </ul>  
 </form>  
 </body>  
 </html>  */








/*JavaScript function for validating userid
 view plaincopy to clipboardprint?

     function userid_validation(uid,mx,my)  
     {  
     var uid_len = uid.value.length;  
     if (uid_len == 0 || uid_len >= my || uid_len < mx)  
     {  
     alert("User Id should not be empty / length be between "+mx+" to "+my);  
     uid.focus();  
     return false;  
     }  
     return true;  
     } */



/*JavaScript function for validating password
 view plaincopy to clipboardprint?

     function passid_validation(passid,mx,my)  
     {  
     var passid_len = passid.value.length;  
     if (passid_len == 0 ||passid_len >= my || passid_len < mx)  
     {  
     alert("Password should not be empty / length be between "+mx+" to "+my);  
     passid.focus();  
     return false;  
     }  
     return true;  
     } */



/*JavaScript code for validating user name
 view plaincopy to clipboardprint?

     function allLetter(uname)  
     {   
     var letters = /^[A-Za-z]+$/;  
     if(uname.value.match(letters))  
     {  
     return true;  
     }  
     else  
     {  
     alert('Username must have alphabet characters only');  
     uname.focus();  
     return false;  
     }  
     }*/


/*JavaScript code for validating user address
 view plaincopy to clipboardprint?

     function alphanumeric(uadd)  
     {   
     var letters = /^[0-9a-zA-Z]+$/;  
     if(uadd.value.match(letters))  
     {  
     return true;  
     }  
     else  
     {  
     alert('User address must have alphanumeric characters only');  
     uadd.focus();  
     return false;  
     }  
     }

 *
 *JavaScript code for validating country
view plaincopy to clipboardprint?

    function countryselect(ucountry)  
    {  
    if(ucountry.value == "Default")  
    {  
    alert('Select your country from the list');  
    ucountry.focus();  
    return false;  
    }  
    else  
    {  
    return true;  
    }  
    }
 *
 *
 *JavaScript code for validating ZIP code
view plaincopy to clipboardprint?

    function allnumeric(uzip)  
    {   
    var numbers = /^[0-9]+$/;  
    if(uzip.value.match(numbers))  
    {  
    return true;  
    }  
    else  
    {  
    alert('ZIP code must have numeric characters only');  
    uzip.focus();  
    return false;  
    }  
    }
 *
 *
 *
 *JavaScript code for validating email format
view plaincopy to clipboardprint?

    function ValidateEmail(uemail)  
    {  
    var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;  
    if(uemail.value.match(mailformat))  
    {  
    return true;  
    }  
    else  
    {  
    alert("You have entered an invalid email address!");  
    uemail.focus();  
    return false;  
    }  
    } 
 *
 *
 *
 *JavaScript code for validating gender
view plaincopy to clipboardprint?

    function validsex(umsex,ufsex)  
    {  
    x=0;  

    if(umsex.checked)   
    {  
    x++;  
    } if(ufsex.checked)  
    {  
    x++;   
    }  
    if(x==0)  
    {  
    alert('Select Male/Female');  
    umsex.focus();  
    return false;  
    }  
    else  
    {  
    alert('Form Successfully Submitted');  
    window.location.reload()  
    return true;}  
    }
 *
 *
 *Here is the entire JavaScript used for validation of the form.
view plaincopy to clipboardprint?

    function formValidation()  
    {  
    var uid = document.registration.userid;  
    var passid = document.registration.passid;  
    var uname = document.registration.username;  
    var uadd = document.registration.address;  
    var ucountry = document.registration.country;  
    var uzip = document.registration.zip;  
    var uemail = document.registration.email;  
    var umsex = document.registration.msex;  
    var ufsex = document.registration.fsex; if(userid_validation(uid,5,12))  
    {  
    if(passid_validation(passid,7,12))  
    {  
    if(allLetter(uname))  
    {  
    if(alphanumeric(uadd))  
    {   
    if(countryselect(ucountry))  
    {  
    if(allnumeric(uzip))  
    {  
    if(ValidateEmail(uemail))  
    {  
    if(validsex(umsex,ufsex))  
    {  
    }  
    }   
    }  
    }   
    }  
    }  
    }  
    }  
    return false;  

    } function userid_validation(uid,mx,my)  
    {  
    var uid_len = uid.value.length;  
    if (uid_len == 0 || uid_len >= my || uid_len < mx)  
    {  
    alert("User Id should not be empty / length be between "+mx+" to "+my);  
    uid.focus();  
    return false;  
    }  
    return true;  
    }  
    function passid_validation(passid,mx,my)  
    {  
    var passid_len = passid.value.length;  
    if (passid_len == 0 ||passid_len >= my || passid_len < mx)  
    {  
    alert("Password should not be empty / length be between "+mx+" to "+my);  
    passid.focus();  
    return false;  
    }  
    return true;  
    }  
    function allLetter(uname)  
    {   
    var letters = /^[A-Za-z]+$/;  
    if(uname.value.match(letters))  
    {  
    return true;  
    }  
    else  
    {  
    alert('Username must have alphabet characters only');  
    uname.focus();  
    return false;  
    }  
    }  
    function alphanumeric(uadd)  
    {   
    var letters = /^[0-9a-zA-Z]+$/;  
    if(uadd.value.match(letters))  
    {  
    return true;  
    }  
    else  
    {  
    alert('User address must have alphanumeric characters only');  
    uadd.focus();  
    return false;  
    }  
    }  
    function countryselect(ucountry)  
    {  
    if(ucountry.value == "Default")  
    {  
    alert('Select your country from the list');  
    ucountry.focus();  
    return false;  
    }  
    else  
    {  
    return true;  
    }  
    }  
    function allnumeric(uzip)  
    {   
    var numbers = /^[0-9]+$/;  
    if(uzip.value.match(numbers))  
    {  
    return true;  
    }  
    else  
    {  
    alert('ZIP code must have numeric characters only');  
    uzip.focus();  
    return false;  
    }  
    }  
    function ValidateEmail(uemail)  
    {  
    var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;  
    if(uemail.value.match(mailformat))  
    {  
    return true;  
    }  
    else  
    {  
    alert("You have entered an invalid email address!");  
    uemail.focus();  
    return false;  
    }  
    } function validsex(umsex,ufsex)  
    {  
    x=0;  

    if(umsex.checked)   
    {  
    x++;  
    } if(ufsex.checked)  
    {  
    x++;   
    }  
    if(x==0)  
    {  
    alert('Select Male/Female');  
    umsex.focus();  
    return false;  
    }  
    else  
    {  
    alert('Form Succesfully Submitted');  
    window.location.reload()  
    return true;  
    }  
    }
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */



