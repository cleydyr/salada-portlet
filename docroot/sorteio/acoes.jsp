<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="br.ufpe.cin.da.salada.model.Sorteio"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>

<%@ include file="/init.jsp" %>

<%
	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Sorteio sorteio = (Sorteio) row.getObject();
	String sorteioId = String.valueOf(sorteio.getSorteioId());
%>

<portlet:actionURL name="desativarArmario" var="cancelarSorteioURL">
	<portlet:param name="jspPage" value="/sorteio/view.jsp" />
	<portlet:param name="armarioId" value="<%= sorteioId %>" />
</portlet:actionURL>


<liferay-ui:icon-menu>
	
</liferay-ui:icon-menu>