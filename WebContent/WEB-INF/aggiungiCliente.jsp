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


		<article class="post invert style3 alt">

			<div style="width: 50%"></div>
			<div style="width: 50%; background: white;">
				<div id="regLogin"
					style="width: 100%; text-align: center; margin-top: 5%;">


					<h2 style="color: #1c1c1c;">Inserisci nuovo cliente:</h2>
					<div style="text-align: center">
						<div>

							<div>
								<span></span>
							</div>
							<div align="left">
								<s:actionerror />
								<s:form theme="simple" method="post" action="Registrazione">

									<table>
										<tr>
											<td><label for="email">Email</label></td>

											<td><s:textfield cssClass="form-control" name="email" />
												<s:fielderror
													style="color:red ;margin-left: -114px; margin-top: 15px;;"
													fieldName="account.email" /></td>
										</tr>
										<tr>
											<td><label for="nome">Nome </label></td>
											<td><s:textfield cssClass="form-control"
													name="cliente.nome" /> <s:fielderror
													style="color:red ; margin-left: -114px; margin-top: 15px;"
													fieldName="cliente.nome" /></td>
										</tr>
										<tr>
											<td><label for="cognome">Cognome </label></td>
											<td><s:textfield cssClass="form-control"
													name="cliente.cognome" /> <s:fielderror
													style="color:red ; margin-left: -114px; margin-top: 15px;"
													fieldName="cliente.cognome" /></td>
										</tr>
										<tr>
											<td><label for="data">Data di nascita (gg/mm/aa)</label>
											</td>
											<td><s:textfield name="cliente.datanascita"
													label="Data di nascita (gg/mm/aa)" /> <s:fielderror
													style="color:red ; margin-left: -114px; margin-top: 15px;"
													fieldName="cliente.datanascita" /></td>

										</tr>
										<tr>
											<td><label for="cliente.CF">Codice Fiscale </label></td>
											<td><s:textfield cssClass="form-control"
													name="cliente.CF" /> <s:fielderror
													style="color:red ; margin-left: -114px; margin-top: 15px;"
													fieldName="cliente.CF" /></td>
										</tr>
										<tr>
											<td><label for="Piva">P.Iva </label></td>
											<td><s:textfield cssClass="form-control"
													name="cliente.PIva" /> <s:fielderror
													style="color:red ; margin-left: -114px; margin-top: 15px;"
													fieldName="cliente.p_iva" /></td>
										</tr>
										<tr>
											<td><label for="iban">Iban </label></td>
											<td><s:textfield cssClass="form-control"
													name="cliente.iban" /> <s:fielderror
													style="color:red ; margin-left: -114px; margin-top: 15px;"
													fieldName="cliente.iban" /></td>
										</tr>
										<tr>
											<!-- 										CONTROLLARE STO FATTO DI ACCOUNT.NUMERO -->
											<td><label for="telefono">Telefono</label></td>
											<td><s:textfield cssClass="form-control"
													name="account.numero" /> <s:fielderror
													style="color:red ; margin-left: -114px; margin-top: 15px;"
													fieldName="account.numero" /></td>
										</tr>
										<tr>
											<td><label for="password">Password </label></td>
											<td><s:password cssClass="form-control" name="password" />
												<s:fielderror
													style="color:red ; margin-left: -114px; margin-top: 15px;"
													fieldName="account.password" /></td>
										</tr>
										<tr>
											<td><div class="form-group">
													<label for="confermaPassword">Conferma password</label>


												</div></td>
											<td><s:password name="confermaPassword" /> <s:fielderror
													style="color:red ; margin-left: -114px; margin-top: 15px;"
													fieldName="account.confermaPassword" /></td>
										</tr>
									</table>
									<div style="margin-left: 32px; margin-top: 9px;">
										<s:submit value="Aggiungi"></s:submit>
									</div>

								</s:form>







								<div style="margin-left: 171px;">
									


								</div>

							</div>
						</div>
					</div>

					<p></p>

				</div>
		</article>



	</div>

	<%@ include file="footer.jsp"%>
	<script src='js/jquery.js'></script>
	<script src='js/plugins.js'></script>
	<script src='js/scripts.js'></script>
	<script src='js/masonry.pkgd.min.js'></script>
</body>
</html>