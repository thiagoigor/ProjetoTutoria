package br.com.tutoronline.util;

import br.com.tutoronline.interfaces.IFabrica;

public class FactoryUtil implements IFabrica {

	private static FactoryUtil fabrica;
	
	private FactoryUtil() {
	}

	@Override
	public <TTipo> TTipo crie(Class<TTipo> tipo) {
		
		try {
			return tipo.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static IFabrica getInstance() {
		
		if(fabrica == null){
			fabrica = new FactoryUtil();
		}
		
		return fabrica;
	}

}
