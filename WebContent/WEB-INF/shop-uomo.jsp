<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="en-US">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Moschino | Minimalist Free HTML Portfolio by
	WowThemes.net</title>
<link rel='stylesheet' href='css/woocommerce-layout.css' type='text/css'
	media='all' />
<link rel='stylesheet' href='css/woocommerce-smallscreen.css'
	type='text/css' media='only screen and (max-width: 768px)' />
<link rel='stylesheet' href='css/woocommerce.css' type='text/css'
	media='all' />
<link rel='stylesheet' href='css/font-awesome.min.css' type='text/css'
	media='all' />
<link rel='stylesheet' href='style.css' type='text/css' media='all' />
<link rel='stylesheet'
	href='https://fonts.googleapis.com/css?family=Oswald:400,500,700%7CRoboto:400,500,700%7CHerr+Von+Muellerhoff:400,500,700%7CQuattrocento+Sans:400,500,700'
	type='text/css' media='all' />
<link rel='stylesheet' href='css/easy-responsive-shortcodes.css'
	type='text/css' media='all' />
</head>
<body
	class="archive post-type-archive post-type-archive-product woocommerce woocommerce-page">
	<%@ include file="Header.jsp"%>

	<div class="container">
		<div id="content" class="site-content">
			<div id="primary" class="content-area column full">
				<main id="main" class="site-main" role="main">
					
					<form class="woocommerce-ordering" method="get">
<%-- 						<select name="orderby" class="orderby"> --%>
<!-- 							<option value="menu_order" selected="selected">Ordinamento -->
<!-- 								di Default</option> -->
<!-- 							<option value="popularity">Popolari</option> -->
<!-- 							<option value="rating">Più comprate</option> -->
<!-- 							<option value="date">Novità</option> -->
<!-- 							<option value="price">Prezzo: crescente</option> -->
<!-- 							<option value="price-desc">Prezzo: descrescente</option> -->
<%-- 						</select> --%>
					</form>
					<br />
					<br />

					<div class="grid portfoliogrid"
						style="position: relative; height: 1455.29px;">
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


				</main>

			</div>

		</div>

	</div>


	<%@ include file="footer.jsp"%>
	<script src='js/jquery.js'></script>
	<script src='js/plugins.js'></script>
	<script src='js/scripts.js'></script>
	<script src='js/masonry.pkgd.min.js'></script>
</body>
</html>