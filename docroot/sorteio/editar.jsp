<%@ include file="/init.jsp" %>

<portlet:actionURL name="atualizarSorteio" var="atualizarSorteioActionURL">
	<portlet:param name="sorteioId" value="<%= renderRequest.getAttribute("sorteioId")%>"/>
</portlet:actionURL>

<div>
	<h2>Atualizar sorteio</h2>
</div>

<aui:form action="<%= atualizarSorteioActionURL %>" name="atualizarSorteioFm">
	<aui:fieldset>
		<aui:input label="Nome" name="nome" id="nome"/>
		<div class="data-hora">
			<aui:input label="Data de Abertura" name="dataAbertura" id="dataAbertura"/>
			<aui:input label="Hora de Abertura" name="horaAbertura" id="horaAbertura"/>
		</div>
		<div class="data-hora">
			<aui:input label="Data de Fechamento" name="dataFechamento" id="dataFechamento" />
			<aui:input label="Hora de Fechamento" name="horaFechamento" id="horaFechamento"/>
		</div>
	</aui:fieldset>
	<aui:button-row>
		<aui:button type="cancel" />
        <aui:button type="submit" />
    </aui:button-row>
</aui:form>

<aui:script>
	//Datepicker na data de abertura
	YUI().use(
	  'aui-datepicker',
	  function(Y) {
	    new Y.DatePicker(
	      {
	        trigger: '#<portlet:namespace />dataAbertura',
	        mask: '%d/%m/%y',
	        popover: {
	          zIndex: 1
	        }
	      }
	    );
	  }
	);
	
	//Timepicker na hora da abertura
	YUI().use(
	  'aui-timepicker',
	  function(Y) {
	    new Y.TimePicker(
	      {
	        trigger: '#<portlet:namespace />horaAbertura',
	        popover: {
	          zIndex: 1
	        }
	      }
	    );
	  }
	);
	
	//Datepicker na data de fechamento
	YUI().use(
	  'aui-datepicker',
	  function(Y) {
	    new Y.DatePicker(
	      {
	        trigger: '#<portlet:namespace />dataFechamento',
	        mask: '%d/%m/%y',
	        popover: {
	          zIndex: 1
	        }
	      }
	    );
	  }
	);
	
	//Timepicker na hora de fechamento
	YUI().use(
	  'aui-timepicker',
	  function(Y) {
	    new Y.TimePicker(
	      {
	        trigger: '#<portlet:namespace />horaFechamento',
	        popover: {
	          zIndex: 1
	        }
	      }
	    );
	  }
	);
</aui:script>