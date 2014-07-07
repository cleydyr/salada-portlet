<%@ include file="/init.jsp" %>

<portlet:actionURL name="criarSorteio" var="criarSorteioActionURL" />

<div>
	<h2>Criar sorteio</h2>
</div>

<aui:form action="<%= criarSorteioActionURL %>" name="criarSorteioFm">
	<aui:fieldset>
		<aui:input label="Nome" name="nome" id="nome"/>
		<aui:input label="Data de Abertura" name="dataAbertura" id="dataAbertura"/>
		<aui:input label="Data de Encerramento" name="dataFechamento" id="dataFechamento" />
	</aui:fieldset>
</aui:form>

<aui:script>
	YUI().use(
	  'aui-datepicker',
	  function(Y) {
	    new Y.DatePicker(
	      {
	        trigger: '#<portlet:namespace />dataAbertura',
	        mask: '%d/%m/%y',
	        popover: {
	          zIndex: 1
	        },
	        on: {
	          selectionChange: function(event) {
	            console.log(event.newSelection)
	          }
	        }
	      }
	    );
	  }
	);
	
	YUI().use(
	  'aui-datepicker',
	  function(Y) {
	    new Y.DatePicker(
	      {
	        trigger: '#<portlet:namespace />dataFechamento',
	        mask: '%d/%m/%y',
	        popover: {
	          zIndex: 1
	        },
	        on: {
	          selectionChange: function(event) {
	            console.log(event.newSelection)
	          }
	        }
	      }
	    );
	  }
	);
</aui:script>