<%@page import="java.util.List"%>
<%@page import="edu.fpdual.proyectoERP.conector.Conector"%>
<%@page import="java.sql.Connection"%>
<%@page import="edu.fpdual.proyectoERP.dao.Employees"%>
<%@page import= "edu.fpdual.proyectoERP.manager.EmployeesManager" %>

<html>
<head>
	<!-- Fuentes -->
	<link rel="preconnect" href="https://fonts.gstatic.com">
	<link href="https://fonts.googleapis.com/css2?family=Pattaya&display=swap" rel="stylesheet">
	<!-- Bootstrap -->
	<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
	<!-- MDBootstrap -->
	<link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.10/css/mdb.min.css" rel="stylesheet">
</head>

	<body style="background-color: #fff8e1;">


	<!-- NAV PC -->
	 <nav class="navbar fixed-top ocultarpc" style="background-image: linear-gradient(to right,#ed8323,#ed8323); box-shadow: 0px 0px 0px 0px grey; padding: 0rem 0rem 0rem 0rem; ">
	    
	  <div class="col-md-3 pl-3" >
	    <ul class="nav justify-content-left  lighten-4">
	      <li class="nav-item">
	        <a href="https://www.royalsheepgroup.com" >
	        <img src="logos positivo-08.png" class="img-fluid py-1"  style="width: 45%; ">
	        </a>
	      </li>
	    </ul>
	  </div>
	   <div class="col-md-8" >
	    <ul class="nav justify-content-end  lighten-4 py-2 pr-2">
	      <li class="nav-item">
	        <a href="https://www.royalsheepgroup.com/juego" style="color:#fff">
	          <button type="button" class="btn botoncta2 btn-rounded" > 
	            COMPRAR
	          </button>
	        </a>
	      </li>
	    </ul>
	   </div>
	
	   <button class="navbar-toggler second-button pr-3" type="button" data-toggle="collapse" data-target="#navbarSupportedContent23"
	   aria-controls="navbarSupportedContent23" aria-expanded="false" aria-label="Toggle navigation">
	   <div class="animated-icon2"><span></span><span></span><span></span><span></span></div>
	   </button>
	
	   <div class="collapse navbar-collapse" id="navbarSupportedContent23" style="padding-top: 10em; padding-bottom: 10em; background-image: linear-gradient(to right,#fff,#fff);">
	    <ul class="navbar-nav mr-auto " style="padding-left: 6em;">
	      <li class="nav-item ">
	        <a class="navgenACTIVE py-2" style="color:#fff8e1; font-size: 2.8em;" href="https://www.pvillarserrano.com/">Inicio</a>
	      </li>
	      <li class="nav-item">
	        <a class="navgen py-2" style="color:#fff8e1; font-size: 2.8em;" href="https://www.royalsheepgroup.com/">Battle of Chefs</a>
	      </li>
	      <li class="nav-item">
	        <a class="navgen py-2"style="color:#fff8e1; font-size: 2.8em;"  href="https://www.royalsheepgroup.com/">Conócenos</a>
	      </li>
	      <li class="nav-item active">
	        <a class="navgen py-2" style="color:#fff8e1; font-size: 2.8em;" href="https://www.royalsheepgroup.com/">Contacto</a>
	      </li>
	    </ul>
	  </div>
	
	  </nav>
	
	<main>
		<section class="section py-5" >
		
			<div class="p-4 text-center" style="text-align: center; font-family: 'Pattaya', sans-serif;">
				<span style="font-size: 4em; color: #ed8323">Empleados</span>
			</div>
			<div class="" style="text-align: center">
			   <table border = "1" style="margin: auto">
			       <thead style="font-family: 'Pattaya', sans-serif; color: #ed8323" >
			           <tr>
			               <th class="px-4 py-2" style="font-size: 1.5em;">Id</th>
			               <th class="px-4 py-2" style="font-size: 1.5em;">Compañía</th>
			               <th class="px-4 py-2" style="font-size: 1.5em;">Ciudad</th>
			           </tr>
			       </thead>
			        <%
			           Connection con = new Conector().getMySQLConnection();
			           List<Employees>list=new EmployeesManager().findAll(con);
			        %> 
			       <tbody>
			       
			       <% for(Employees emp:list){ %>
			       
			           <tr>
			               <td><%= emp.getId()%></td>
			               <td><%= emp.getCompany()%></td>
			               <td><%= emp.getCity()%></td>
			           </tr>
			           <%}%>
			       </tbody>
			   </table> 
		   </div>
		
		
		</section>
	</main>

	<!--  SCRIPTS  -->
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<!-- Bootstrap tooltips -->
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js"></script>
	<!-- Bootstrap core JavaScript -->
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
	<!-- MDB core JavaScript -->
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.10/js/mdb.min.js"></script>
	
	<!--HAMBURGUESA-->
	<script>$(document).ready(function () {
	
	    $('.second-button').on('click', function () {
	    
	        $('.animated-icon2').toggleClass('open');
	    });
	});
	</script>
	
	  <!-- Scroll animation script -->
	  <script>
	    $( document ).ready(function() {
	      new WOW().init();
	    });
	  </script>
	   <!-- <script>
	  new WOW().init();</script>-->
  
</body>
</html>
