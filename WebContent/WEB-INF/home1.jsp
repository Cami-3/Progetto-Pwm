<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1" --%>
<%--     pageEncoding="ISO-8859-1"%> --%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en-US">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Choose your Shoes | Minimalist Free HTML Portfolio by WowThemes.net</title>
<link rel='stylesheet' href='css/woocommerce-layout.css' type='text/css' media='all'/>
<link rel='stylesheet' href='css/woocommerce-smallscreen.css' type='text/css' media='only screen and (max-width: 768px)'/>
<link rel='stylesheet' href='css/woocommerce.css' type='text/css' media='all'/>
<link rel='stylesheet' href='css/font-awesome.min.css' type='text/css' media='all'/>
<link rel='stylesheet' href='style.css' type='text/css' media='all'/>
<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Oswald:400,500,700%7CRoboto:400,500,700%7CHerr+Von+Muellerhoff:400,500,700%7CQuattrocento+Sans:400,500,700' type='text/css' media='all'/>
<link rel='stylesheet' href='css/easy-responsive-shortcodes.css' type='text/css' media='all'/>

</head>

<body class="home page page-template page-template-template-portfolio page-template-template-portfolio-php">
<%@ include file="Header.jsp"%>
<!-- <div id="page"> -->


		<!-- #masthead -->
		<div class="container">
		<div id="content" class="site-content">
			<div id="primary" class="content-area column full">
				<main id="main" class="site-main">
				<div class="grid portfoliogrid">
				
				

				  	
				
					
				<s:iterator value="prodottiUomo">
							<!-- si preleva l'array presente nella classe Java -->
							<article class="hentry">
								<header class="entry-header">
									<div class="entry-thumbnail">
										<a href="ShoeDescription?id=<s:property value="idprodotto"/>"><img
											src="asset/img-prodotti/<s:property value="idprodotto"/>.jpg"
											style="width: 270px" class="entry-title" /></a>
									</div>
									<h3>
										<s:property value="marca" />
										<s:property value="nome" />
									</h3>
									<span class="price"><span class="amount"><s:property
												value="prezzo" />€</span></span>
								</header>
							</article>

						</s:iterator>
					
					
				</div>
				<!-- .grid -->
				
				<!-- <nav class="pagination">
				<span class="page-numbers current">1</span>
				<a class="page-numbers" href="#">2</a>
				<a class="next page-numbers" href="#">Next »</a>
				</nav>
				<br/> -->
				
				</main>
				<!-- #main -->
			</div>
			<!-- #primary -->
		</div>
		<!-- #content -->
	</div>
	<!-- .container -->
<!-- 	<footer id="colophon" class="site-footer"> -->
<!-- 	<div class="container"> -->
<!-- 		<div class="site-info"> -->
<!-- 			<h1 style="font-family: 'Herr Von Muellerhoff';color: #ccc;font-weight:300;text-align: center;margin-bottom:0;margin-top:0;line-height:1.4;font-size: 46px;">Choose your Shoes</h1> -->
<!-- 			 <a target="blank" href="https://www.wowthemes.net/">&copy; Choose your Shoes - Official Website</a> -->
<!-- 		</div> -->
<!-- 	</div>	 -->
<!-- 	</footer> -->
<!-- 	<a href="#top" class="smoothup" title="Back to top"><span class="genericon genericon-collapse"></span></a> -->
<!-- </div> -->
<!-- #page -->
<%@ include file="footer.jsp"%>
 <script src='js/jquery.js'></script> 
<script src='js/plugins.js'></script> 
<script src='js/scripts.js'></script> 
 <script src='js/masonry.pkgd.min.js'></script> 
</body>
</html>