package principal;

import java.io.DataOutputStream;
import java.io.DataInputStream;

public interface Adecuador {
	public boolean graba(DataOutputStream conversor, Object objet);
	public boolean leer(DataInputStream conversorW,Object objet);
}
