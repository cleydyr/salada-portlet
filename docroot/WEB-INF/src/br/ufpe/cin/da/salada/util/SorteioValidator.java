package br.ufpe.cin.da.salada.util;

import java.util.Date;

public class SorteioValidator {
	public static boolean estaNoFuturo(Date data) {
		return data.compareTo(new Date()) > 0;
	}
}
