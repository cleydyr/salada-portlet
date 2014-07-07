<%@ include file="/init.jsp" %>

<portlet:renderURL var="criarSorteioURL">
    <portlet:param name="mvcPath" value="/sorteio/criar.jsp" />
</portlet:renderURL>

<div>
	<h2>Sorteios</h2>
</div>

<aui:button value="Criar sorteio" cssClass="icon-plus-sign" href="<%= criarSorteioURL %>"/>

<liferay-ui:search-container emptyResultsMessage="Não há sorteios cadastrados no momento.">
	<liferay-ui:search-container-results
		results="<%= SorteioLocalServiceUtil.getSorteios(searchContainer.getStart(), searchContainer.getEnd()) %>"
		total="<%= SorteioLocalServiceUtil.getSorteiosCount() %>"
	/>

	<liferay-ui:search-container-row
		className="br.ufpe.cin.da.salada.model.Sorteio"
		modelVar="aSorteio"
	>
	
		<liferay-ui:search-container-column-text property="dataFim" />

		<liferay-ui:search-container-column-text property="dataInicio" />

		<liferay-ui:search-container-column-text property="sorteioId" />

		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>