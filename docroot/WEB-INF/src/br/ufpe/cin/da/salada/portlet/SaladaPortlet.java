package br.ufpe.cin.da.salada.portlet;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import br.ufpe.cin.da.salada.service.SorteioLocalServiceUtil;
import br.ufpe.cin.da.salada.util.SorteioValidator;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class SaladaPortlet extends MVCPortlet {
	public void criarSorteio(
			ActionRequest actionRequest, ActionResponse actionResponse) throws ParseException {
		ServiceContext ctx;
		try {
			ctx = ServiceContextFactory.getInstance(actionRequest);

			String dataAberturaStr = ParamUtil.getString(actionRequest, "dataAbertura");
			String horaAberturaStr = ParamUtil.getString(actionRequest, "horaAbertura");
			String dataFechamentoStr = ParamUtil.getString(actionRequest, "dataFechamento");
			String horaFechamentoStr = ParamUtil.getString(actionRequest, "horaFechamento");

			String dataAberturaParseavel = dataAberturaStr + " " + horaAberturaStr + " BRT";
			String dataFechamentoParseavel = dataFechamentoStr + " " + horaFechamentoStr + " BRT";

			Date dataAbertura = _df.parse(dataAberturaParseavel);
			Date dataFechamento = _df.parse(dataFechamentoParseavel);

			String nome = ParamUtil.getString(actionRequest, "nome");

			SorteioLocalServiceUtil.cadastrarSorteio(nome, dataAbertura, dataFechamento, ctx);
		} catch (PortalException | SystemException e) {
			e.printStackTrace();
		}
	}
	
	public void deletarSorteio(
			ActionRequest actionRequest, ActionResponse actionResponse) throws ParseException {
		ServiceContext ctx;
		try {
			ctx = ServiceContextFactory.getInstance(actionRequest);

			long sorteioId = ParamUtil.getLong(actionRequest, "sorteioId");
			
			System.out.println("sorteio deletado: " + sorteioId);
			
			
		} catch (PortalException | SystemException e) {
			e.printStackTrace();
		}
	}

	private static DateFormat _df = new SimpleDateFormat("dd/MM/yy hh:mm a z");
}