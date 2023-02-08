<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" 
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
crossorigin="anonymous">


<script 
  src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
  integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" 
  crossorigin="anonymous">
</script>

  
<nav class="navbar navbar-light bg-dark">
<div class="container-fluid">
  <a class="navbar-brand" href="#"> <img
   src = "https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
   alt = "" width = "80" height = "48" class = "d-line-block align-text-top" > 
</a>
</div>
</nav>

 <form action = "email">
   <h6> Display Mail Id : ${mailId} </h6>
   <input type = "submit" value = "Send"/>
 </form>
 
 <form action = "number">
  <h6> Display Mobile number : ${number} </h6>
  <input type = "submit" value = "Send"/>
 </form>
 
 <form action = "adhar">
   <h6> Display Adhaar number : ${adharNo} </h6>
   <input type = "submit" value = "Send"/>
 </form>
 
 <form action = "age">
   <h6> Display Age : ${age} </h6>
   <input type = "submit" value = "Send"/>
 </form>
 
  <form action = "dob">
    <h6> Display Date of birth : ${dateAndTime} </h6>
    <input type = "submit" value = "Send"/>
  </form>
  
  <form action = "amount">
    <h6> display desired salary : ${salary} </h6>
    <input type = "submit" value = "Send"/>
  </form>
  
  <form action = "friends">
    <h6> Display best friends names :  </h6>
    <input type = "submit" value = "Send"/>
    <ul>
       <c:forEach items = "${friend}" var = "value">
          <li> ${value} </li>
          </c:forEach>
    </ul>
  </form>
  
  <form action = "places">
   <h6> Display visited places </h6>
   <input type= "submit" value  = "Send"/>
   <ul>
     <c:forEach items = "${place}" var = "value">
     <li> ${value} </li>
     </c:forEach>
   </ul>
 </form>
 
 <form action = "skills">
  <h6> Display skill sets </h6>
  <input type = "submit" value = "Send"/>
  <ul>
    <c:forEach items = "${skill}" var = "value">
    <li> ${value} </li>
    </c:forEach>
   </ul>
  </form>
  
  <form action = "edu">
  <h6> Display education details.</h6>
  <input type = "submit" value = "Send"/></br>
  <label> StudentName : ${education.name} </label> </br>
  <label> Location : ${education.location} </label> </br>
  <label> CollageName : ${education.collageName} </label> </br>
  <label> Qualification : ${education.qualification} </label> </br>
  <label> Semesters : ${education.semesters} </label> </br>
  <label> Percentage : ${education.percentage} </label> </br>
  <label> TotalMarks : ${education.totalMarks} </label> </br>
  <label> EducationType : ${education.type} </label> </br>
  <label> Address : ${education.address} </label> </br>
  <label> PrincipleName : ${education.principleName}</label>
  </form>
  
  <form action = "fam">
  <h6> Display family details </h6>
  <input type = "submit" value = "Send"/></br>
  <label> FatherName : ${family.fatherName} </label> </br>
  <label> MotherName : ${family.motherName} </label> </br>
  <label> ElderSisterName : ${family.elderSisterName} </label> </br>
  <label> SisterName : ${family.sisterName} </label> </br>
  <label> MyName : ${family.myName} </label> </br>
  <label> SirName : ${family.sirName} </label> </br>
  <label> BrotherName : ${family.brotherName} </label> </br>
  <label> CousinName : ${family.cousinName} </label> </br>
  <label> NoOfMembers : ${family.noOfMembers} </label> </br>
  <label> FathersWork : ${family.fathersWork} </label>
  </form>
  
   <form action = "mobile">
  <h6> Display Mobile details </h6>
  <input type = "submit" value = "Send"/> </br>
  <label> MobileName : ${mob.color} </label> </br>
  <label> MobilePrice : ${mob.price} </label> </br>
  <label> MobileBrand : ${mob.brand} </label> </br>
  <label> MobileVersion : ${mob.version} </label> </br>
  <label> Storage : ${mob.storage} </label> </br>
  </form>
  
  <form action = "beverage">
  <h6> Display Beverage details </h6>
  <input type = "submit" value = "Send"/> </br>
  <label> BeverageName : ${coffee.name} </label> </br>
  <label> BeveragePrice : ${coffee.price} </label> </br>
  <label> BeverageFlavour : ${coffee.flavour} </label> </br>
  <label> BuyerName : ${coffee.buyer} </label> </br>
  <label> ShopName : ${coffee.shopName} </label> </br>
  <label> Brand : ${coffee.brand} </label> </br>
  <label> BeverageTypes : ${coffee.types} </label> </br>
  <label> SugarContent : ${coffee.sugarContent} </label> </br>
  <label> BeverageQuantity : ${coffee.quantity} </label> </br>
  <label> BeverageColor : ${coffee.color} </label>
  </form>
  
   <form action = "chat">
  <h6> Display Chat details </h6>
  <input type = "submit" value = "Send"/> </br>
  <label> ChatId : ${chat.id} </label> </br>
  <label> ChatName : ${chat.name} </label> </br>
  <label> ChatPrice : ${chat.price} </label> </br>
  <label> ShopName : ${chat.centerName} </label> </br>
  <label> MadeBy : ${chat.madeBy} </label> </br>
  <label> Location : ${chat.location} </label> </br>
  <label> CoolDrink : ${chat.coolDrinkName} </label> </br>
  <label> Location : ${chat.location} </label> </br>
  <label> Quantity : ${chat.quantity} </label> </br>
  <label> TasteOrNot : ${chat.taste} </label> </br>
  <label> Type : ${chat.type} </label>
  </form>
</body>
</html>