
<%
	/**
	 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
	 *
	 * This library is free software; you can redistribute it and/or modify it under
	 * the terms of the GNU Lesser General Public License as published by the Free
	 * Software Foundation; either version 2.1 of the License, or (at your option)
	 * any later version.
	 *
	 * This library is distributed in the hope that it will be useful, but WITHOUT
	 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
	 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
	 * details.
	 */
%>
<%@ include file="/init.jsp"%>

<portlet:defineObjects />

<portlet:renderURL var="sorteioURL">
	<portlet:param name="mvcPath" value="/sorteio/listar.jsp" />
</portlet:renderURL>
<div class="row-fluid">
	<ul class="thumbnails">
		<li class="span4">
			<div class="thumbnail" id="sorteios">
				<a href="<%=sorteioURL%>"> <span class="bg">&nbsp</span>
					<h3>Sorteios</h3>
					<p>Gerencie os sorteios de armários.</p>
				</a>
			</div>
		</li>
		<li class="span4">
			<div class="thumbnail" id="pagamentos">
				<a href="<%=sorteioURL%>"> <span class="bg">&nbsp</span>
					<h3>Pagamentos</h3>
					<p>Gerencie os pagamentos realizados.</p>
				</a>
			</div>
		</li>
		<li class="span4">
			<div class="thumbnail" id="inscricoes">
				<a href="<%=sorteioURL%>"> <span class="bg">&nbsp</span>
					<h3>Inscrições</h3>
					<p>Gerencie as inscrições feitas pelos alunos</p>
				</a>
			</div>
		</li>
	</ul>

	<ul class="thumbnails">
		<li class="span4">
			<div class="thumbnail" id="armarios">
				<a href="<%=sorteioURL%>"> <span class="bg">&nbsp</span>
					<h3>Armários</h3>
					<p>Gerencie os armários disponíveis.</p>
				</a>
			</div>
		</li>
		<li class="span4">
			<div class="thumbnail" id="mensagens">
				<a href="<%=sorteioURL%>"> <span class="bg">&nbsp</span>
					<h3>Pagamentos</h3>
					<p>Gerencie as mensagens enviadas por e-mail.</p>
				</a>
			</div>
		</li>
	</ul>
</div>
