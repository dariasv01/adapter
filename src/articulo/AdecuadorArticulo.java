package articulo;

import java.io.DataOutputStream;
import java.io.IOException;

import cliente.Cliente;

import java.io.DataInputStream;
import principal.Adecuador;

public class AdecuadorArticulo implements Adecuador {

	@Override
	public boolean graba(DataOutputStream conversor, Object objet) {
		boolean retorno = true;
		Articulo articulo = (Articulo) objet;
		try {
			conversor.writeInt(articulo.getNumeroID());
			conversor.writeUTF(articulo.getNombre());
		} catch (IOException e) {
			retorno = false;
		}
		return retorno;
	}


	@Override
	public boolean leer(DataInputStream conversorW, Object objet) {
		boolean retorno = true;
		Articulo articulo = (Articulo) objet;
		System.out.print(articulo.getNumeroID()+",");
		System.out.println(articulo.getNombre());
		return retorno;
	}

}
