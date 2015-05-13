<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String codesrv = request.getParameter("gwt.codesvr");
	request.getSession().setAttribute("gwt.codesvr", codesrv);
%>
<html>
	<head>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<title>Correspondente WEB - Login</title>		
		<link rel="shortcut icon" type="image/ico" href="imagens/icone/favicon.ico" />	
		<link href="css/styles.css" type="text/css" media="screen" rel="stylesheet" />
		<style type="text/css">
		  img, div { behavior: url(iepngfix.htc) }
		</style>	
	</head>
	<body id="login">
		<div id="wrappertop"></div>
		<div id="wrapper">
			<div id="content">
				<div id="header" style="color: red;">
				<c:if test='<%="1".equals(request.getParameter("erro"))%>'>
                        <c:out value="Usu&#225;rio/Senha inv&#225;lida!" escapeXml="false" />
                    </c:if>
                    <c:if test='<%="2".equals(request.getParameter("erro"))%>'>
                        <c:out value="Usu&#225;rio/Senha inv&#225;lida!" escapeXml="false" />
                    </c:if>
                    <c:if test='<%="3".equals(request.getParameter("erro"))%>'>
                        <c:out value="Usu&#225;rio/Senha inv&#225;lida!" escapeXml="false" />
                    </c:if>
                    <c:if test='<%="4".equals(request.getParameter("erro"))%>'>
                        <c:out value="Acesso ao sistema bloqueado por quantidade de acessos m&#250;ltiplos inv&#225;lidos. Aguarde 30 minutos para nova tentativa." escapeXml="false" />
                    </c:if>
                    <c:if test='<%="5".equals(request.getParameter("erro"))%>'>
                        <c:out value="Usu&#225;rio bloqueado! Entre em contato com o SAC." escapeXml="false" />
                    </c:if>
                    <c:if test='<%="6".equals(request.getParameter("erro"))%>'>
                        <c:out value="Sistema indispon&#237;vel. Tente novamente em instantes." escapeXml="false" />
                    </c:if>

                 </div>
				<div id="darkbanner" class="banner320">
					<h2>CWEB</h2>
				</div>
				<div id="darkbannerwrap">
				</div>
				<form name="form1" method="post" action="login">
					<fieldset class="form">
					        <input type="hidden" name="gwt.codesvr" value='${gwt.codesvr}'/>
                    	<p>
							<label for="user_name">Login:</label>
							<input id="user_name" name="j_username" type="text" />
						</p>
						<p>
							<label for="user_password">Senha:</label>
							<input id="user_password" name="j_password" type="password" />
						</p>
						<div style="display:block;margin-left:35px;width:291px;text-align:center;">
							<button type="submit" style="margin-left:45px;display:block;width:110px;margin-right:7px;" name="Submit">
								<img src="css/images/key.png"/>
								<span>Login</span>
							</button>
							<button type="button" name="limpa" style="display:block;width:120px;margin-right:7px;" onclick="javascript:limpar();">
								<span>Limpar</span>
							</button>
							<%--<button type="button" name="retorna" style="display:block;width:110px;margin-right:7px;" onclick="javascript:parent.location.href='senha.jsp${codeServer}';">
								<span>Ajuda de Senha</span>
							</button> --%>
							<span style="clear:both;">&#160;</span>
						</div>
                    </fieldset>
               </form>
			</div>
		</div>   
        <div id="wrapperbottom_branding">
            <div id="wrapperbottom_branding_text">Correspondente Bancario WEB</div>
        </div>
    </body>

<script>
function limpar() {
	document.getElementById('user_name').value="";
	document.getElementById('user_password').value="";
}
</script>

</html>


