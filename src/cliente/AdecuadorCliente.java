package cliente;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.DataInputStream;

import principal.Adecuador;

public class AdecuadorCliente implements Adecuador {

	@Override
	public boolean graba(DataOutputStream conversorW, Object objeto) {
		boolean retorno = true;
		Cliente cliente = (Cliente) objeto;
		try {
			conversorW.writeInt(cliente.getNumero());
			conversorW.writeUTF(cliente.getNombre());
			conversorW.writeBoolean(cliente.isPreferente());
			conversorW.writeFloat(cliente.getSaldo());
		} catch (IOException e) {
			retorno = false;
		}
		return retorno;
	}


	@Override
	public boolean leer(DataInputStream conversorW, Object objet) {
		boolean retorno = true;
		Cliente cliente = (Cliente) objet;
		System.out.print(cliente.getNumero()+",");
		System.out.print(cliente.getNombre()+",");
		System.out.print(cliente.isPreferente()+",");
		System.out.println(cliente.getSaldo());
		return retorno;
	}

}
