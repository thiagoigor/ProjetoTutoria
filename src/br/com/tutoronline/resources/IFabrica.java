package br.com.tutoronline.resources;

public interface IFabrica {

	<TTipo>  TTipo crie(Class<TTipo> tipo);
}
