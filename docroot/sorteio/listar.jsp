<%@ include file="/init.jsp" %>

<portlet:renderURL var="criarSorteioURL">
    <portlet:param name="mvcPath" value="/sorteio/criar.jsp" />
</portlet:renderURL>

<div>
	<h2>Sorteios</h2>
</div>

<div class="salada">
	<aui:button value="Criar sorteio" cssClass="btn-da btn-primary icon-plus-sign icon-white" href="<%= criarSorteioURL %>"/>

	<liferay-ui:search-container emptyResultsMessage="Não há sorteios cadastrados no momento.">
		<liferay-ui:search-container-results
			results="<%= SorteioLocalServiceUtil.getSorteios(searchContainer.getStart(), searchContainer.getEnd()) %>"
			total="<%= SorteioLocalServiceUtil.getSorteiosCount() %>"
		/>
	
		<liferay-ui:search-container-row
			className="br.ufpe.cin.da.salada.model.Sorteio"
			modelVar="aSorteio"
		>
		
			<liferay-ui:search-container-column-text property="nome" name="Nome"/>
	
			<liferay-ui:search-container-column-text property="dataAbertura" name="Data de Abertura" />
	
			<liferay-ui:search-container-column-text property="dataFechamento" name="Data de Fechamento" />
			
			<liferay-ui:search-container-column-jsp
				path="/sorteio/acoes.jsp" align="right" />
		</liferay-ui:search-container-row>
	
		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
</div>