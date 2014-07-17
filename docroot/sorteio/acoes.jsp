<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="br.ufpe.cin.da.salada.model.Sorteio"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>

<%@ include file="/init.jsp"%>

<%
	ResultRow row = (ResultRow) request
			.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Sorteio sorteio = (Sorteio) row.getObject();
	String sorteioId = String.valueOf(sorteio.getSorteioId());
%>

<portlet:actionURL name="deletarSorteio" var="deletarSorteioURL">
	<portlet:param name="jspPage" value="/sorteio/listar.jsp" />
	<portlet:param name="sorteioId" value="<%=sorteioId%>" />
</portlet:actionURL>

<liferay-ui:icon-menu>
	<liferay-ui:icon image="edit" label="Editar" url="#" />
	<liferay-ui:icon-delete label="Deletar" url="<%= deletarSorteioURL %>" confirmation="Tem certeza de que deseja deletar este sorteio?" />
</liferay-ui:icon-menu>

