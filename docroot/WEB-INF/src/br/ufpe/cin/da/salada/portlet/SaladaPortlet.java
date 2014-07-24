package br.ufpe.cin.da.salada.portlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import br.ufpe.cin.da.salada.model.Sorteio;
import br.ufpe.cin.da.salada.service.SorteioLocalServiceUtil;
import br.ufpe.cin.da.salada.util.SorteioValidator;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.TimeZoneUtil;
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

			String dataAberturaParseavel = dataAberturaStr + horaAberturaStr + " " + _FUSO_BRT;
			String dataFechamentoParseavel = dataFechamentoStr + horaFechamentoStr + " " + _FUSO_BRT;

			Date dataAbertura = _DATA_HORA_FUSO_FORMAT.parse(dataAberturaParseavel);
			Date dataFechamento = _DATA_HORA_FUSO_FORMAT.parse(dataFechamentoParseavel);

			String nome = ParamUtil.getString(actionRequest, "nome");

			SorteioLocalServiceUtil.cadastrarSorteio(nome, dataAbertura, dataFechamento, ctx);
		} catch (PortalException | SystemException e) {
			e.printStackTrace();
		}
	}
	
	public void deletarSorteio(
			ActionRequest actionRequest, ActionResponse actionResponse) throws ParseException {
		try {
			ServiceContext ctx = ServiceContextFactory.getInstance(actionRequest);

			long sorteioId = ParamUtil.getLong(actionRequest, "sorteioId");
			
			SorteioLocalServiceUtil.deleteSorteio(sorteioId);
			
		} catch (PortalException | SystemException e) {
			e.printStackTrace();
		}
	}
	
	public void renderAtualizarSorteio(
			ActionRequest actionRequest, ActionResponse actionResponse) throws ParseException {
		try {
			ServiceContext ctx = ServiceContextFactory.getInstance(actionRequest);

			long sorteioId = ParamUtil.getLong(actionRequest, "sorteioId");
			
			Sorteio oSorteio = SorteioLocalServiceUtil.getSorteio(sorteioId);
			
			Date dataAbertura = oSorteio.getDataAbertura();
			
			//Calendar cal = CalendarFactoryUtil.getCalendar(TimeZoneUtil.getTimeZone(_FUSO_BRT));
			
			//cal.setTime(dataAbertura);
			
			_HORA_FORMAT.setTimeZone(TimeZoneUtil.getTimeZone(_FUSO_BRT));
			
			String foo = _HORA_FORMAT.format(dataAbertura);
			
			System.out.println(foo);
			
		} catch (PortalException | SystemException e) {
			e.printStackTrace();
		}
	}

	public void atualizarSorteio(
			ActionRequest actionRequest, ActionResponse actionResponse) throws ParseException {
		try {
			ServiceContext ctx = ServiceContextFactory.getInstance(actionRequest);

			long sorteioId = ParamUtil.getLong(actionRequest, "sorteioId");
			
			SorteioLocalServiceUtil.deleteSorteio(sorteioId);
			
			actionResponse.sendRedirect("sorteio/listar.jsp");
		} catch (PortalException | SystemException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static final DateFormat _DATA_FORMAT = new SimpleDateFormat("dd/MM/yy");
	private static final DateFormat _HORA_FORMAT = new SimpleDateFormat("hh:mm a");
	private static final DateFormat _DATA_HORA_FUSO_FORMAT = new SimpleDateFormat("dd/MM/yy hh:mm a z");
	private static final String _FUSO_BRT = "BRT";
}