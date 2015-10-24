package br.com.tutoronline.interfaces;

public interface IFabrica {

	<TTipo>  TTipo crie(Class<TTipo> tipo);
}
