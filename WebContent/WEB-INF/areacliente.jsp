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

		<!-- Container Fluid-->
		<div class="container-fluid" id="container-wrapper">
			<div
				class="d-sm-flex align-items-center justify-content-between mb-4">
				<h1 class="h3 mb-0 text-gray-800">Area Personale</h1>

			</div>



			<div class="col-lg-4">
				<!-- Pannello dati personali sulla destra -->
				<div class="card mb-4">
					<div
						class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
						<h6 style="font-size: 25px; color: black"
							; class="m-0 font-weight-bold text-primary">Dati personali</h6>
					</div>
					<table>
						<tr>
							<td style="font-size: 18px; color: black">Nome:&nbsp &nbsp<s:property
									value="cliente.nome" /></td>
						</tr>
						<tr>
							<td style="font-size: 18px; color: black">Cognome:&nbsp
								&nbsp <s:property value="cliente.cognome" />
							</td>

						</tr>
						<tr>
							<td style="font-size: 18px; color: black">Email:&nbsp &nbsp<s:property
									value="account.email" /></td>

						</tr>
						<tr>
							<td style="font-size: 18px; color: black">Numero
								Telefono:&nbsp &nbsp<s:property value="account.numero" />
							</td>

						</tr>
						<tr>
							<td style="font-size: 18px; color: black">Codice
								Fiscale:&nbsp &nbsp<s:property value="cliente.CF" />
							</td>

						</tr>

					</table>
				</div>
			</div>
		</div>
<%-- 		<s:form method="post" action="RichiediModificaCliente"> --%>
<%-- 		<s:hidden name="id" value="%{cliente.idcliente}" /> --%>
<%-- 		<s:submit value="Modifica i tuoi dati" /> --%>
<%-- 		</s:form> --%>
		<div class="row">
			<div class="col-lg-12">
				<!-- Tabella ordini -->
				<div class="card mb-4">
					<div
						class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
						<h6 style="font-size: 25px; color: black"
							; class="m-0 font-weight-bold text-primary">I tuoi ordini
							recenti:</h6>
					</div>

						
							
								<table>
									<theads>
										<tr>
											<th>ID dell'ordine</th>
											<th>Data Acquisto</th>
												<th>Cumulativo Ordine</th>
												<th>Nome</th>
										</tr>
									</thead>
									<tbody>
										<s:iterator value="ordiniDelCliente">
										<tr>
											<td> <s:property value="idordine" /> </td> 
											<td> <s:property value="data" /> </td>
											<td> <s:property value="cumulativoOrdine" /> </td> 
											<td> <s:property value="cliente.nome" /> </td> 
											</tr>
										</s:iterator>
									</tbody>
								</table>
						
						
				</div>

			</div>
			<!-- Input Group -->
			<div class="col-lg-8">

				<div class="card mb-4">
					<div
						class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
						<form action="Home1">
							<button
								style="background-color: black; border-color: black; color: white"
								; type="submit">Effettua un ordine</button>
						</form>
					</div>
					<div class="card-body">
						<h6 style="font-size: 25px; color: black"
							; class="m-0 font-weight-bold text-primary">Contatta
							l'assistenza</h6>
						<label>Inserisci una breve descrizione del tuo problema </label>
						<p>Max 400 caratteri</p>
						<div class="form-group">
							<s:form action="Inserisciprenota" method="post">
								
								<s:hidden name="cliente.idcliente" value="%{cliente.idcliente}" />
								<s:textarea id="exampleFormControlTextarea1" theme="simple"
									class="form-control" name="descrizione" rows="5"
									maxlength="400" />
								<s:fielderror name="descrizione"></s:fielderror>



								<div class="col-sm-10 col-xl-2 offset-xl-0">
									<s:submit class="btn btn-primary" value="Invia" />
								</div>

							</s:form>
						</div>
					</div>
				</div>
			</div>

		</div>
	</div>
	</div>

</body>


</div>

<%@ include file="footer.jsp"%>
<script src='js/jquery.js'></script>
<script src='js/plugins.js'></script>
<script src='js/scripts.js'></script>
<script src='js/masonry.pkgd.min.js'></script>
</body>
</html>